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

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class PortDetail {
    
    @SerializedName("port_id")
    private int portId;
    @SerializedName("device_id")
    private int deviceId;
    @SerializedName("port_descr_type")
    private String portDescrType;
    @SerializedName("port_descr_descr")
    private String portDescr;
    @SerializedName("port_descr_circuit")
    private String portDescrCircuit;
    @SerializedName("port_descr_speed")
    private String portDescrSpeed;
    @SerializedName("port_descr_notes")
    private String portDescrNotes;
    private String ifDescr;
    private String ifName;
    private String portName;
    private String ifIndex;
    private String ifSpeed;
    private boolean ifConnectorPresent;
    private boolean ifPromiscuousMode;
    private String ifHighSpeed;
    private String ifOperStatus;
    private String ifAdminStatus;
    private String ifDuplex;
    private int ifMtu;
    private String ifType;
    private String ifAalias;
    private String ifPhysAddress;
    private String ifInUcastPkts;
    private String ifOutUcastPkts;
    private String ifInErrors;
    private String ifOutErrors;
    private String ifInOctets;
    private String ifOutOctets;

    /**
     * @return the portId
     */
    public int getPortId() {
        return portId;
    }

    /**
     * @param portId the portId to set
     */
    public void setPortId(int portId) {
        this.portId = portId;
    }

    /**
     * @return the deviceId
     */
    public int getDeviceId() {
        return deviceId;
    }

    /**
     * @param deviceId the deviceId to set
     */
    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * @return the portDescrType
     */
    public String getPortDescrType() {
        return portDescrType;
    }

    /**
     * @param portDescrType the portDescrType to set
     */
    public void setPortDescrType(String portDescrType) {
        this.portDescrType = portDescrType;
    }

    /**
     * @return the portDescr
     */
    public String getPortDescr() {
        return portDescr;
    }

    /**
     * @param portDescr the portDescr to set
     */
    public void setPortDescr(String portDescr) {
        this.portDescr = portDescr;
    }

    /**
     * @return the portDescrCircuit
     */
    public String getPortDescrCircuit() {
        return portDescrCircuit;
    }

    /**
     * @param portDescrCircuit the portDescrCircuit to set
     */
    public void setPortDescrCircuit(String portDescrCircuit) {
        this.portDescrCircuit = portDescrCircuit;
    }

    /**
     * @return the portDescrSpeed
     */
    public String getPortDescrSpeed() {
        return portDescrSpeed;
    }

    /**
     * @param portDescrSpeed the portDescrSpeed to set
     */
    public void setPortDescrSpeed(String portDescrSpeed) {
        this.portDescrSpeed = portDescrSpeed;
    }

    /**
     * @return the portDescrNotes
     */
    public String getPortDescrNotes() {
        return portDescrNotes;
    }

    /**
     * @param portDescrNotes the portDescrNotes to set
     */
    public void setPortDescrNotes(String portDescrNotes) {
        this.portDescrNotes = portDescrNotes;
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
     * @return the portName
     */
    public String getPortName() {
        return portName;
    }

    /**
     * @param portName the portName to set
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * @return the ifIndex
     */
    public String getIfIndex() {
        return ifIndex;
    }

    /**
     * @param ifIndex the ifIndex to set
     */
    public void setIfIndex(String ifIndex) {
        this.ifIndex = ifIndex;
    }

    /**
     * @return the ifSpeed
     */
    public String getIfSpeed() {
        return ifSpeed;
    }

    /**
     * @param ifSpeed the ifSpeed to set
     */
    public void setIfSpeed(String ifSpeed) {
        this.ifSpeed = ifSpeed;
    }

    /**
     * @return the ifConnectorPresent
     */
    public boolean isIfConnectorPresent() {
        return ifConnectorPresent;
    }

    /**
     * @param ifConnectorPresent the ifConnectorPresent to set
     */
    public void setIfConnectorPresent(boolean ifConnectorPresent) {
        this.ifConnectorPresent = ifConnectorPresent;
    }

    /**
     * @return the ifPromiscuousMode
     */
    public boolean isIfPromiscuousMode() {
        return ifPromiscuousMode;
    }

    /**
     * @param ifPromiscuousMode the ifPromiscuousMode to set
     */
    public void setIfPromiscuousMode(boolean ifPromiscuousMode) {
        this.ifPromiscuousMode = ifPromiscuousMode;
    }

    /**
     * @return the ifHighSpeed
     */
    public String getIfHighSpeed() {
        return ifHighSpeed;
    }

    /**
     * @param ifHighSpeed the ifHighSpeed to set
     */
    public void setIfHighSpeed(String ifHighSpeed) {
        this.ifHighSpeed = ifHighSpeed;
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
     * @return the ifDuplex
     */
    public String getIfDuplex() {
        return ifDuplex;
    }

    /**
     * @param ifDuplex the ifDuplex to set
     */
    public void setIfDuplex(String ifDuplex) {
        this.ifDuplex = ifDuplex;
    }

    /**
     * @return the ifMtu
     */
    public int getIfMtu() {
        return ifMtu;
    }

    /**
     * @param ifMtu the ifMtu to set
     */
    public void setIfMtu(int ifMtu) {
        this.ifMtu = ifMtu;
    }

    /**
     * @return the ifType
     */
    public String getIfType() {
        return ifType;
    }

    /**
     * @param ifType the ifType to set
     */
    public void setIfType(String ifType) {
        this.ifType = ifType;
    }

    /**
     * @return the ifAalias
     */
    public String getIfAalias() {
        return ifAalias;
    }

    /**
     * @param ifAalias the ifAalias to set
     */
    public void setIfAalias(String ifAalias) {
        this.ifAalias = ifAalias;
    }

    /**
     * @return the ifPhysAddress
     */
    public String getIfPhysAddress() {
        return ifPhysAddress;
    }

    /**
     * @param ifPhysAddress the ifPhysAddress to set
     */
    public void setIfPhysAddress(String ifPhysAddress) {
        this.ifPhysAddress = ifPhysAddress;
    }

    /**
     * @return the ifInUcastPkts
     */
    public String getIfInUcastPkts() {
        return ifInUcastPkts;
    }

    /**
     * @param ifInUcastPkts the ifInUcastPkts to set
     */
    public void setIfInUcastPkts(String ifInUcastPkts) {
        this.ifInUcastPkts = ifInUcastPkts;
    }

    /**
     * @return the ifOutUcastPkts
     */
    public String getIfOutUcastPkts() {
        return ifOutUcastPkts;
    }

    /**
     * @param ifOutUcastPkts the ifOutUcastPkts to set
     */
    public void setIfOutUcastPkts(String ifOutUcastPkts) {
        this.ifOutUcastPkts = ifOutUcastPkts;
    }

    /**
     * @return the ifInErrors
     */
    public String getIfInErrors() {
        return ifInErrors;
    }

    /**
     * @param ifInErrors the ifInErrors to set
     */
    public void setIfInErrors(String ifInErrors) {
        this.ifInErrors = ifInErrors;
    }

    /**
     * @return the ifOutErrors
     */
    public String getIfOutErrors() {
        return ifOutErrors;
    }

    /**
     * @param ifOutErrors the ifOutErrors to set
     */
    public void setIfOutErrors(String ifOutErrors) {
        this.ifOutErrors = ifOutErrors;
    }

    /**
     * @return the ifInOctets
     */
    public String getIfInOctets() {
        return ifInOctets;
    }

    /**
     * @param ifInOctets the ifInOctets to set
     */
    public void setIfInOctets(String ifInOctets) {
        this.ifInOctets = ifInOctets;
    }

    /**
     * @return the ifOutOctets
     */
    public String getIfOutOctets() {
        return ifOutOctets;
    }

    /**
     * @param ifOutOctets the ifOutOctets to set
     */
    public void setIfOutOctets(String ifOutOctets) {
        this.ifOutOctets = ifOutOctets;
    }
    
}
