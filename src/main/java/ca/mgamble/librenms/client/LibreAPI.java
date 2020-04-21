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
import ca.mgamble.librenms.client.classes.DevicePortResponse;
import ca.mgamble.librenms.client.classes.Devices;
import ca.mgamble.librenms.client.classes.EventLogs;
import ca.mgamble.librenms.client.classes.Graphs;
import ca.mgamble.librenms.client.classes.IPInfo;
import ca.mgamble.librenms.client.classes.LibreOperationResponse;
import ca.mgamble.librenms.client.classes.NewLibreDevice;
import ca.mgamble.librenms.client.classes.PortDetail;
import ca.mgamble.librenms.client.classes.Ports;
import com.google.common.io.ByteStreams;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
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
    private Version version = new Version();
    
    public String getAPIVersion() {
        return version.getBuildNumber();
    } 
    
    public LibreAPI(String url, String token) throws Exception {
        this.logger = Logger.getLogger(LibreAPI.class);
        this.url = url;
        this.token = token;
        this.client = new DefaultAsyncHttpClient();
        
        RequestBuilder builder = new RequestBuilder("GET");
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
                throw new Exception("Could not connect / login to LibreAPI - http status " + r.getStatusCode());
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
        if (deviceID == null) {
            throw new Exception("Cannot load a null device - check device ID");
        }
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
    
    public LibreOperationResponse createDevice(NewLibreDevice newDevice) throws Exception {
    
       Future<Response> f = client.executeRequest(buildRequest("POST", "/devices", gson.toJson(newDevice)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            
            throw new Exception("Could not create new device - HTTP Response Code was: " + r.getStatusCode() );
        } else {
          
                return gson.fromJson(r.getResponseBody(), LibreOperationResponse.class);
            
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
    
     
    // devices/:device/ports - get the device ports
     
     public Ports getDevicePorts(String deviceID) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/devices/" + URLEncoder.encode(deviceID, "UTF-8") + "/ports?columns=ifName%2Cport_id%2CifOperStatus%2CifDescr"));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get device ports - response code is " + r.getStatusCode());
        } else {
            return gson.fromJson(r.getResponseBody(), Ports.class);
            
        }
     }
     
     
     public IPInfo getPortIPInfo(String portID) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/ports/" + URLEncoder.encode(portID, "UTF-8") + "/ip"));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get ip info for  port - response code is " + r.getStatusCode());
        } else {
            return gson.fromJson(r.getResponseBody(), IPInfo.class);
            
        }
     }
     
     
     public PortDetail getDevicePortDetail(String deviceID, String portName) throws Exception {
         Future<Response> f = client.executeRequest(buildRequest("GET", "/devices/" +  URLEncoder.encode(deviceID, "UTF-8") + "/ports/" + URLEncoder.encode(portName, "UTF-8")));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get details for port " + portName + " - response code is " + r.getStatusCode());
        } else {
            DevicePortResponse devicePortResponse = gson.fromJson(r.getResponseBody(), DevicePortResponse.class);
            return devicePortResponse.getPort();
            
        }
     }
     public PortDetail getPortDetail(int portID) throws Exception {
      Future<Response> f = client.executeRequest(buildRequest("GET", "/ports/" + URLEncoder.encode(Integer.toString(portID), "UTF-8")));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get details for port " + portID + " - response code is " + r.getStatusCode());
        } else {
            return gson.fromJson(r.getResponseBody(), PortDetail.class);
            
        }
     }
     
     public Graphs getDeviceGraphs(String deviceID) throws Exception {
      Future<Response> f = client.executeRequest(buildRequest("GET", "/devices/" + URLEncoder.encode(deviceID, "UTF-8") + "/graphs"));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get avaiabile graphs for device id " + deviceID + " - response code is " + r.getStatusCode());
        } else {
            return gson.fromJson(r.getResponseBody(), Graphs.class);
            
        }
     }
     
     public byte[] getGenericDeviceGraph(String deviceID, String graphType) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/devices/" + URLEncoder.encode(deviceID, "UTF-8") + "/" + URLEncoder.encode(graphType, "UTF-8")));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get device port graph - response code is " + r.getStatusCode());
        } else {
            BufferedInputStream bis = new BufferedInputStream(r.getResponseBodyAsStream());
            return ByteStreams.toByteArray(bis);
        }
     }
     
     // Device images - for now we're going to return them as a byte array for now?
     
     public byte[] getDevicePortGraph(String deviceID, String ifaceName) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/devices/" + URLEncoder.encode(deviceID, "UTF-8") + "/ports/" + URLEncoder.encode(ifaceName, "UTF-8") + "/port_bits"));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get device port graph - response code is " + r.getStatusCode());
        } else {
            BufferedInputStream bis = new BufferedInputStream(r.getResponseBodyAsStream());
            return ByteStreams.toByteArray(bis);
        }
     }
     
    // Event Logs
    public EventLogs getDeviceEventLogs(String deviceID) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("GET", "/logs/eventlog/" + URLEncoder.encode(deviceID, "UTF-8")));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not get device event logs - response code is " + r.getStatusCode());
        } else {
            return gson.fromJson(r.getResponseBody(), EventLogs.class);

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
