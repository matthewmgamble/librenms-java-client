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
public class Port {


    private String ifName;
    private String port_id;
    private String ifOperStatus;
    private String ifDescr;
    private String ifAdminStatus;
    private String ifAlias;
    /**
     * @return the ifName
     */
    public String getIfName() {
        return ifName;
    }

    /**
     * @param ifName the ifName to set
     */
    public void setIfName(String ifName) {
        this.ifName = ifName;
    }

    /**
     * @return the port_id
     */
    public String getPort_id() {
        return port_id;
    }

    /**
     * @param port_id the port_id to set
     */
    public void setPort_id(String port_id) {
        this.port_id = port_id;
    }

    /**
     * @return the ifOperStatus
     */
    public String getIfOperStatus() {
        return ifOperStatus;
    }

    /**
     * @param ifOperStatus the ifOperStatus to set
     */
    public void setIfOperStatus(String ifOperStatus) {
        this.ifOperStatus = ifOperStatus;
    }

    /**
     * @return the ifDescr
     */
    public String getIfDescr() {
        return ifDescr;
    }

    /**
     * @param ifDescr the ifDescr to set
     */
    public void setIfDescr(String ifDescr) {
        this.ifDescr = ifDescr;
    }
    
        /**
     * @return the ifAdminStatus
     */
    public String getIfAdminStatus() {
        return ifAdminStatus;
    }

    /**
     * @param ifAdminStatus the ifAdminStatus to set
     */
    public void setIfAdminStatus(String ifAdminStatus) {
        this.ifAdminStatus = ifAdminStatus;
    }

    /**
     * @return the ifAlias
     */
    public String getIfAlias() {
        return ifAlias;
    }

    /**
     * @param ifAlias the ifAlias to set
     */
    public void setIfAlias(String ifAlias) {
        this.ifAlias = ifAlias;
    }
}
