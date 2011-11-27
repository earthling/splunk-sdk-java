/*
 * Copyright 2011 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.splunk;

public class Password extends Entity {
    Password(Service service, String path) {
        super(service, path);
    }

    public String getClearPassword() {
        return getString("clear_password");
    }

    public String getEncryptedPassword() {
        return getString("encr_password");
    }

    @Override public String getName() {
        return getUsername();
    }

    public String getPassword() {
        return getString("password");
    }

    public String getRealm() {
        return getString("realm", null);
    }

    public String getUsername() {
        return getString("username");
    }
}