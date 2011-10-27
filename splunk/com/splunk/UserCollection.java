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

import java.util.List;

public class UserCollection extends EntityCollection<User> {
    public UserCollection(Service service, String path) {
        super(service, path, User.class);
    }
    
    public User create(String name, String password, String role) {
        return create(name, password, role, null);
    }

    public User create(String name, String password, String role, Args extra) {
        Args args = new Args();
        args.put("password", password);
        args.put("roles", role);
        if (extra != null) args.putAll(extra);
        return create(name, args);
    }

/* UNDONE: Args doesnt support list values yet
    public User create(String name, String password, List<String> roles) {
        return create(name, password, roles, null);
    }

    public User 
    create(String name, String password, List<String> roles, Args extra) {
        Args args = new Args();
        args.put("password", password);
        args.put("role", roles);
        if (extra != null) args.putAll(extra);
        return create(name, args);
    }
*/
}
