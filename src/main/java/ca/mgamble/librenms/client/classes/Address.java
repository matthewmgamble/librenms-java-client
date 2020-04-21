/*
 * The MIT License
 *
 * Copyright 2020 mgamble.
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

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class Address {
    
    @SerializedName("ipv4_address_id")
    private int ipv4AddressID;
    
    @SerializedName("ipv4_address")
    private String ipv4Address;
    
    @SerializedName("ipv4_prefixlen")
    private int ipv4PrefixLen;
    
    @SerializedName("ipv4_network_id")
    private int ipv4NetworkID;
    
    @SerializedName("port_id")
    private int portID;
    
    @SerializedName("context_name")
    private String contextName;

    /**
     * @return the ipv4AddressID
     */
    public int getIpv4AddressID() {
        return ipv4AddressID;
    }

    /**
     * @param ipv4AddressID the ipv4AddressID to set
     */
    public void setIpv4AddressID(int ipv4AddressID) {
        this.ipv4AddressID = ipv4AddressID;
    }

    /**
     * @return the ipv4Address
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    /**
     * @param ipv4Address the ipv4Address to set
     */
    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     * @return the ipv4PrefixLen
     */
    public int getIpv4PrefixLen() {
        return ipv4PrefixLen;
    }

    /**
     * @param ipv4PrefixLen the ipv4PrefixLen to set
     */
    public void setIpv4PrefixLen(int ipv4PrefixLen) {
        this.ipv4PrefixLen = ipv4PrefixLen;
    }

    /**
     * @return the ipv4NetworkID
     */
    public int getIpv4NetworkID() {
        return ipv4NetworkID;
    }

    /**
     * @param ipv4NetworkID the ipv4NetworkID to set
     */
    public void setIpv4NetworkID(int ipv4NetworkID) {
        this.ipv4NetworkID = ipv4NetworkID;
    }

    /**
     * @return the portID
     */
    public int getPortID() {
        return portID;
    }

    /**
     * @param portID the portID to set
     */
    public void setPortID(int portID) {
        this.portID = portID;
    }

    /**
     * @return the contextName
     */
    public String getContextName() {
        return contextName;
    }

    /**
     * @param contextName the contextName to set
     */
    public void setContextName(String contextName) {
        this.contextName = contextName;
    }
    
}
