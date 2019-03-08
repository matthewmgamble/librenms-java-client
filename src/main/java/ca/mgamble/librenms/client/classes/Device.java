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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class Device {
  
    @SerializedName("device_id")
    private String deviceID;
    private String hostname;
    private String sysName;
    private String ip;
    private String community;
    private String authlevel;
    private String authname;
    private String authpass;
    private String authalgo;
    private String cryptopass;
    private String cryptoalgo;
    private String snmpver;
    private String port;
    private String transport;
    private String timeout;
    private String retries;
    @SerializedName("snmp_disable")
    private String snmpDisable;
    private String bgpLocalAs;
    private String sysObjectID;
    private String sysDescr;
    private String sysContact;
    private String version;
    private String hardware;
    private String features;
    private String location_id;
    private String os;
    private String status;
    @SerializedName("status_reason")
    private String statusReason;
    private String ignore;
    private String disabled;
    private String uptime;
    @SerializedName("agent_uptime")
    private String agentUptime;
    @SerializedName("last_polled")
    private String lastPolled;
    @SerializedName("last_poll_attempted")
    private String lastPollAttempted;
    @SerializedName("last_polled_timetaken")
    private String lastPolledTimeTaken;
    @SerializedName("last_discovered_timetaken")
    private String lastDiscoveredTimeTaken;
    @SerializedName("last_discovered")
    private String lastDiscovered;
    @SerializedName("last_ping")
    private String lastPing;
    @SerializedName("last_ping_timetaken")
    private String lastPingTimeTaken;
    private String purpose;
    private String type;
    private String serial;
    private String icon;
    @SerializedName("poller_group")
    private String pollerGroup;
    @SerializedName("override_sysLocation")
    private String overrideSysLocation;
    private String notes;
    @SerializedName("port_association_mode")
    private String portAssociationMode;
    @SerializedName("max_depth")
    private String maxDepth;
    @SerializedName("dependency_parent_id")
    private String dependencyParentID;
    @SerializedName("dependency_parent_hostname")
    private String dependencyParentHostname;
    private String lat;
    private String lng;

    /**
     * @return the deviceID
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * @param deviceID the deviceID to set
     */
    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
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
     * @return the sysName
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * @param sysName the sysName to set
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
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

    /**
     * @return the authlevel
     */
    public String getAuthlevel() {
        return authlevel;
    }

    /**
     * @param authlevel the authlevel to set
     */
    public void setAuthlevel(String authlevel) {
        this.authlevel = authlevel;
    }

    /**
     * @return the authname
     */
    public String getAuthname() {
        return authname;
    }

    /**
     * @param authname the authname to set
     */
    public void setAuthname(String authname) {
        this.authname = authname;
    }

    /**
     * @return the authpass
     */
    public String getAuthpass() {
        return authpass;
    }

    /**
     * @param authpass the authpass to set
     */
    public void setAuthpass(String authpass) {
        this.authpass = authpass;
    }

    /**
     * @return the authalgo
     */
    public String getAuthalgo() {
        return authalgo;
    }

    /**
     * @param authalgo the authalgo to set
     */
    public void setAuthalgo(String authalgo) {
        this.authalgo = authalgo;
    }

    /**
     * @return the cryptopass
     */
    public String getCryptopass() {
        return cryptopass;
    }

    /**
     * @param cryptopass the cryptopass to set
     */
    public void setCryptopass(String cryptopass) {
        this.cryptopass = cryptopass;
    }

    /**
     * @return the cryptoalgo
     */
    public String getCryptoalgo() {
        return cryptoalgo;
    }

    /**
     * @param cryptoalgo the cryptoalgo to set
     */
    public void setCryptoalgo(String cryptoalgo) {
        this.cryptoalgo = cryptoalgo;
    }

    /**
     * @return the snmpver
     */
    public String getSnmpver() {
        return snmpver;
    }

    /**
     * @param snmpver the snmpver to set
     */
    public void setSnmpver(String snmpver) {
        this.snmpver = snmpver;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the transport
     */
    public String getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(String transport) {
        this.transport = transport;
    }

    /**
     * @return the timeout
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * @param timeout the timeout to set
     */
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    /**
     * @return the retries
     */
    public String getRetries() {
        return retries;
    }

    /**
     * @param retries the retries to set
     */
    public void setRetries(String retries) {
        this.retries = retries;
    }

    /**
     * @return the snmpDisable
     */
    public String getSnmpDisable() {
        return snmpDisable;
    }

    /**
     * @param snmpDisable the snmpDisable to set
     */
    public void setSnmpDisable(String snmpDisable) {
        this.snmpDisable = snmpDisable;
    }

    /**
     * @return the bgpLocalAs
     */
    public String getBgpLocalAs() {
        return bgpLocalAs;
    }

    /**
     * @param bgpLocalAs the bgpLocalAs to set
     */
    public void setBgpLocalAs(String bgpLocalAs) {
        this.bgpLocalAs = bgpLocalAs;
    }

    /**
     * @return the sysObjectID
     */
    public String getSysObjectID() {
        return sysObjectID;
    }

    /**
     * @param sysObjectID the sysObjectID to set
     */
    public void setSysObjectID(String sysObjectID) {
        this.sysObjectID = sysObjectID;
    }

    /**
     * @return the sysDescr
     */
    public String getSysDescr() {
        return sysDescr;
    }

    /**
     * @param sysDescr the sysDescr to set
     */
    public void setSysDescr(String sysDescr) {
        this.sysDescr = sysDescr;
    }

    /**
     * @return the sysContact
     */
    public String getSysContact() {
        return sysContact;
    }

    /**
     * @param sysContact the sysContact to set
     */
    public void setSysContact(String sysContact) {
        this.sysContact = sysContact;
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
     * @return the hardware
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * @param hardware the hardware to set
     */
    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    /**
     * @return the features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(String features) {
        this.features = features;
    }

    /**
     * @return the location_id
     */
    public String getLocation_id() {
        return location_id;
    }

    /**
     * @param location_id the location_id to set
     */
    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the statusReason
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * @param statusReason the statusReason to set
     */
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * @return the ignore
     */
    public String getIgnore() {
        return ignore;
    }

    /**
     * @param ignore the ignore to set
     */
    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    /**
     * @return the disabled
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * @param disabled the disabled to set
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    /**
     * @return the uptime
     */
    public String getUptime() {
        return uptime;
    }

    /**
     * @param uptime the uptime to set
     */
    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    /**
     * @return the agentUptime
     */
    public String getAgentUptime() {
        return agentUptime;
    }

    /**
     * @param agentUptime the agentUptime to set
     */
    public void setAgentUptime(String agentUptime) {
        this.agentUptime = agentUptime;
    }

    /**
     * @return the lastPolled
     */
    public String getLastPolled() {
        return lastPolled;
    }

    /**
     * @param lastPolled the lastPolled to set
     */
    public void setLastPolled(String lastPolled) {
        this.lastPolled = lastPolled;
    }

    /**
     * @return the lastPollAttempted
     */
    public String getLastPollAttempted() {
        return lastPollAttempted;
    }

    /**
     * @param lastPollAttempted the lastPollAttempted to set
     */
    public void setLastPollAttempted(String lastPollAttempted) {
        this.lastPollAttempted = lastPollAttempted;
    }

    /**
     * @return the lastPolledTimeTaken
     */
    public String getLastPolledTimeTaken() {
        return lastPolledTimeTaken;
    }

    /**
     * @param lastPolledTimeTaken the lastPolledTimeTaken to set
     */
    public void setLastPolledTimeTaken(String lastPolledTimeTaken) {
        this.lastPolledTimeTaken = lastPolledTimeTaken;
    }

    /**
     * @return the lastDiscoveredTimeTaken
     */
    public String getLastDiscoveredTimeTaken() {
        return lastDiscoveredTimeTaken;
    }

    /**
     * @param lastDiscoveredTimeTaken the lastDiscoveredTimeTaken to set
     */
    public void setLastDiscoveredTimeTaken(String lastDiscoveredTimeTaken) {
        this.lastDiscoveredTimeTaken = lastDiscoveredTimeTaken;
    }

    /**
     * @return the lastDiscovered
     */
    public String getLastDiscovered() {
        return lastDiscovered;
    }

    /**
     * @param lastDiscovered the lastDiscovered to set
     */
    public void setLastDiscovered(String lastDiscovered) {
        this.lastDiscovered = lastDiscovered;
    }

    /**
     * @return the lastPing
     */
    public String getLastPing() {
        return lastPing;
    }

    /**
     * @param lastPing the lastPing to set
     */
    public void setLastPing(String lastPing) {
        this.lastPing = lastPing;
    }

    /**
     * @return the lastPingTimeTaken
     */
    public String getLastPingTimeTaken() {
        return lastPingTimeTaken;
    }

    /**
     * @param lastPingTimeTaken the lastPingTimeTaken to set
     */
    public void setLastPingTimeTaken(String lastPingTimeTaken) {
        this.lastPingTimeTaken = lastPingTimeTaken;
    }

    /**
     * @return the purpose
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * @param purpose the purpose to set
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the pollerGroup
     */
    public String getPollerGroup() {
        return pollerGroup;
    }

    /**
     * @param pollerGroup the pollerGroup to set
     */
    public void setPollerGroup(String pollerGroup) {
        this.pollerGroup = pollerGroup;
    }

    /**
     * @return the overrideSysLocation
     */
    public String getOverrideSysLocation() {
        return overrideSysLocation;
    }

    /**
     * @param overrideSysLocation the overrideSysLocation to set
     */
    public void setOverrideSysLocation(String overrideSysLocation) {
        this.overrideSysLocation = overrideSysLocation;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the portAssociationMode
     */
    public String getPortAssociationMode() {
        return portAssociationMode;
    }

    /**
     * @param portAssociationMode the portAssociationMode to set
     */
    public void setPortAssociationMode(String portAssociationMode) {
        this.portAssociationMode = portAssociationMode;
    }

    /**
     * @return the maxDepth
     */
    public String getMaxDepth() {
        return maxDepth;
    }

    /**
     * @param maxDepth the maxDepth to set
     */
    public void setMaxDepth(String maxDepth) {
        this.maxDepth = maxDepth;
    }

    /**
     * @return the dependencyParentID
     */
    public String getDependencyParentID() {
        return dependencyParentID;
    }

    /**
     * @param dependencyParentID the dependencyParentID to set
     */
    public void setDependencyParentID(String dependencyParentID) {
        this.dependencyParentID = dependencyParentID;
    }

    /**
     * @return the dependencyParentHostname
     */
    public String getDependencyParentHostname() {
        return dependencyParentHostname;
    }

    /**
     * @param dependencyParentHostname the dependencyParentHostname to set
     */
    public void setDependencyParentHostname(String dependencyParentHostname) {
        this.dependencyParentHostname = dependencyParentHostname;
    }

    /**
     * @return the lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return the lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * @param lng the lng to set
     */
    public void setLng(String lng) {
        this.lng = lng;
    }


}
