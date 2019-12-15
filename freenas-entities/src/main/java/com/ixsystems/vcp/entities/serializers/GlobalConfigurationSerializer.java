/**
 * Copyright (C) 2018 iXsystems
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of freenas-java-api-client nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.ixsystems.vcp.entities.serializers;

import com.ixsystems.vcp.entities.network.GlobalConfigurations;
import kong.unirest.json.JSONObject;

public class GlobalConfigurationSerializer{


    public GlobalConfigurations decode(JSONObject obj, GlobalConfigurations gc){
        if (obj.get("gc_hostname_virtual")!=null)
            gc.setGcHostnameVirtual(obj.get("gc_hostname_virtual").toString());

        gc.setGcHosts(obj.getString("gc_hosts"));
        gc.setGcDomain(obj.getString("gc_domain"));
        gc.setGcHostname(obj.getString("gc_hostname"));
        gc.setGcNameservers1(obj.getString("gc_nameserver1"));
        gc.setGcNameservers2(obj.getString("gc_nameserver2"));
        gc.setGcHttpProxy(obj.getString("gc_httpproxy"));
        gc.setDomains(obj.getString("gc_domains"));
        gc.setGcNetwaitEnabled(obj.getBoolean("gc_netwait_enabled"));
        gc.setGcIpv4Gateway(obj.getString("gc_ipv4gateway"));
        gc.setId(obj.get("id").toString());
//        gc.setGcHostnameB(obj.getString("gc_hostname_b"));
        gc.setGcIpv4Gateway(obj.getString("gc_ipv6gateway"));
        gc.setGcNetwaitIp(obj.getString("gc_netwait_ip"));
        return gc;
    }

}
