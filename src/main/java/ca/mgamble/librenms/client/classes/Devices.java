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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgamble
 */
public class Devices {
    private List<Device> devices;
    
    public Devices() {
        this.devices = new ArrayList<>();
    }
    public void addDevice(Device device) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(device);
    }
    
    public List<Device> getDevices() {
        return devices;
    }

    /**
     * @param data the data to set
     */
    public void setDevices(List<Device> data) {
        this.devices = data;
    }
}
