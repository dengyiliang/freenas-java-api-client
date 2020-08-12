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
package org.freenas.client.v2.storage;

import com.ixsystems.vcp.entities.Extent;
import com.ixsystems.vcp.entities.AssociatedTarget;
import com.ixsystems.vcp.entities.Target;
import java.util.List;
import java.util.Map;

/**
 * Manage the shares for datasets
 */
public interface SharingISCSIConnector {
    public Extent createExtent(String name, Map<String, String> args);
    public Extent updateExtent(int id);
    public Extent deleteExtent(String name);
    public Extent getExtent(int id);
    public List<Extent> listExtents();

    public AssociatedTarget createAssociatedTarget(String name, Map<String, String> args);
    public AssociatedTarget updateAssociatedTarget(int id);
    public AssociatedTarget deleteAssociatedTarget(String name);
    public AssociatedTarget getAssociatedTarget(int id);
    public List<AssociatedTarget> listAssociatedTargets();

    public Target createTarget(String name, Map<String, String> args);
    public Target updateTarget(int id);
    public Target deleteTarget(String name);
    public Target getTarget(int id);
    public List<Target> listTargets();
}