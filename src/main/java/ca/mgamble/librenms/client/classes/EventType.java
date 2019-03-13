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

import java.io.Serializable;

/**
 *
 * @author mgamble
 */
public enum EventType implements Serializable {
    bgpPeer("bgpPeer"),
    discovery("discovery"),
    down("down"),
    Voltage("Voltage"),
    State("State"),
    Dbm("Dbm"),
    up("up"),
    error("error"),
    alert("alert"),
    component("component"),
    Temperature("Temperature"),
    Current("Current"),
    reboot("reboot"),
    processors("processors"),
    system("system"),
    mempool("mempool"),
    stp("stp"),
    entityPhysical("entity-physical"),
    sensor("sensor"),
    wirelessSensors("wireless_sensors"),
    iface("interface")
   ;
    
    private String text;

    EventType(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static EventType fromString(String text) {
        if (text != null) {
            for (EventType b : EventType.values()) {
                if (text.equalsIgnoreCase(b.getText())) {
                    return b;
                }
            }
        }
        return null;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    
}