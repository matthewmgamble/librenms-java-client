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
package ca.mgamble.librenms.client;

/**
 *
 * @author mgamble
 */
public class  Version {


   
/*
    0.4.1 - Added additional LTE graph for SNR vs SNIR
    0.4.0 - Added methods to pull LTE graphs for Mirotik devices
    0.3.9 - Added two new fields when returning ports - ifAdminStatus and ifAlias to aid in dashboard display
    0.3.8 - Change create logic a bit
    0.3.7 - Added ability to call interface graphs with from and to time in new function.
    0.3.6 - Added ability to delete devices
    0.3.5 - Corrected HTTP response code checkign for create
    0.3.4 - Added ability to filter getDevice so we can hide SNMP communities on some responses.
    0.3.3 - Added CPU and wireless graphs
    0.3.2 - Fixed bug where error was generated creating device - code was checking for a 200 and libre returns a 201
    0.3.1 - Added ability to list generic graphs for a device
    0.3.0 - Added ability to get IP info from ports

    */
        public Version() {

        }

        private final String buildNumber = "0.4.1";
        private final String buildName = "Keep The Car Running";
        private final String author = "Matthew M. Gamble";

        /**
         * @return the buildNumber
         */
        public String getBuildNumber() {
                return buildNumber;
        }

        /**
         * @return the buildName
         */
        public String getBuildName() {
                return buildName;
        }

        /**
         * @return the author
         */
        public String getAuthor() {
                return author;
        }

}
