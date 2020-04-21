/*
 * The MIT License
 *
 * Copyright 2019 mgamble.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ca.mgamble.librenms.client.classes;

/**
 *
 * @author mgamble
 */
public class NewLibreDevice {
    
    public NewLibreDevice() {
        
    }
    /**
     * @return the hostname
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * @param hostname the hostname to set
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the poller_group
     */
    public int getPoller_group() {
        return poller_group;
    }

    /**
     * @param poller_group the poller_group to set
     */
    public void setPoller_group(int poller_group) {
        this.poller_group = poller_group;
    }

    /**
     * @return the force_add
     */
    public boolean isForce_add() {
        return force_add;
    }

    /**
     * @param force_add the force_add to set
     */
    public void setForce_add(boolean force_add) {
        this.force_add = force_add;
    }

    /**
     * @return the community
     */
    public String getCommunity() {
        return community;
    }

    /**
     * @param community the community to set
     */
    public void setCommunity(String community) {
        this.community = community;
    }
    private String hostname;
    private int port = 161;
    private String version = "v2c";
    private int poller_group = 0;
    private boolean force_add;
    private String community;
    
}
