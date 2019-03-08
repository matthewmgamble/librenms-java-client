/*
The MIT License (MIT)
Copyright (c) 2019 Matthew M. Gamble https://www.mgamble.ca
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package ca.mgamble.librenms.client;

import ca.mgamble.librenms.client.classes.Device;
import ca.mgamble.librenms.client.classes.Devices;
import com.google.gson.Gson;
import java.io.Closeable;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.concurrent.Future;
import java.util.logging.Level;
import org.apache.log4j.Logger;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;

/**
 *
 * @author mgamble
 */
public class LibreAPI implements Closeable {

    private static final String JSON = "application/json; charset=UTF-8";
    private final boolean closeClient;
    private final AsyncHttpClient client;
    private final String url;
    private final String token;
    private final Logger logger;
    private boolean closed = false;
    Gson gson = new Gson();

    public LibreAPI(String url, String token) throws Exception {
        this.logger = Logger.getLogger(LibreAPI.class);
        this.url = url;
        this.token = token;
        this.client = new DefaultAsyncHttpClient();
        
        RequestBuilder builder = new RequestBuilder("POST");
        Request request = builder.setUrl(this.url)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("X-Auth-Token", token)
                .build();
        Future<Response> f = client.executeRequest(request);
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            if (r.getStatusCode() == 401) {
                throw new Exception("API Client Unauthorized");
            } else {
                throw new Exception("Could not connect / login to LibreAPI");
            }
        } 
        closeClient = true;
    
    }
    
    //////////////////////////////////////////////////////////////////////
    // Closeable interface methods
    //////////////////////////////////////////////////////////////////////
    public boolean isClosed() {
        return closed || client.isClosed();
    }

    public void close() {
        if (closeClient && !client.isClosed()) {
            try {
                client.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(LibreAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        closed = true;
    }
    
    // Devices - /api/v0/devices
    
    public Devices getDevices() throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/devices"));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            
            throw new Exception("Could not get device ID");
        } else {
            // We need to swap the device ID here for some form of token so that we can map devices to customers on 
            // subsuquent API calls.  
            
            return gson.fromJson(r.getResponseBody(), Devices.class);
            
        }
    }
    
    public Device getDevice(String deviceID) throws Exception {
       Future<Response> f = client.executeRequest(buildRequest("GET", "/devices/" + URLEncoder.encode(deviceID, "UTF-8")));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            
            throw new Exception("Could not get device ID");
        } else {
            Devices devices =  gson.fromJson(r.getResponseBody(), Devices.class);
            if (devices.getDevices().size() != 1) {
                throw new Exception("Too many or too few results found for query");
            } else {
                return devices.getDevices().get(0);
            }
            
        }
    }
    
     // devicegroups/:Device Group
     public Devices getGroupDevices(String deviceGroup) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/devicegroups/" + URLEncoder.encode(deviceGroup, "UTF-8")));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            
            throw new Exception("Could not get group devices - response code is " + r.getStatusCode());
        } else {
            return gson.fromJson(r.getResponseBody(), Devices.class);
            
        }
    }
    
    private Request buildRequest(String type, String subUrl) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("X-Auth-Token",  this.token)
                .build();
        return request;
    }
    
        private Request buildRequest(String type, String subUrl, String requestBody) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("X-Auth-Token",  this.token)
                .setBody(requestBody)
                .build();
        return request;
    }
}
