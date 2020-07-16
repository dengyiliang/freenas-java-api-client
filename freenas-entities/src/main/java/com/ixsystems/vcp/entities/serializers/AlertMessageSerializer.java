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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.ixsystems.vcp.entities.AlertMessage;

import org.json.JSONObject;

import java.io.IOException;

public class AlertMessageSerializer extends StdSerializer<AlertMessage> implements EntitySerializer<AlertMessage>  {

    public AlertMessageSerializer(Class<AlertMessage> t) {
        super(t);
    }

    public AlertMessageSerializer(JavaType type) {
        super(type);
    }

    public AlertMessageSerializer(Class<?> t, boolean dummy) {
        super(t, dummy);
    }

    public AlertMessageSerializer(StdSerializer<?> src) {
        super(src);
    }

    public AlertMessage decode(JSONObject obj, AlertMessage instance) {
        System.out.println("[decode alertmessage] decoding alert message.");

        instance.setId(obj.getString("id"));
        instance.setDismissed(obj.getBoolean("dismissed"));
        instance.setLevel(obj.getString("level"));
        instance.setText(obj.getString("text"));
        instance.setFormatted(obj.getString("formatted"));
        instance.setSource(obj.getString("source"));
        instance.setNode(obj.getString("node"));

        return instance;
    }

    public void serialize(AlertMessage volume,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException {
    }
}
