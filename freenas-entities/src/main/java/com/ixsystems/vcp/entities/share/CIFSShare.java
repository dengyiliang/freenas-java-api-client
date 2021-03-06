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
package com.ixsystems.vcp.entities.share;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;



public class CIFSShare {




    @JsonProperty("cifs_hostsallow")
    private String hostAllow ;

    @JsonProperty("cifs_name")
    private String name;

    @JsonProperty("cifs_home")
    private Boolean home;

    @JsonProperty("cifs_default_permissions")
    private String defaultPermissions;

    @JsonProperty("cifs_guestok")
    private Boolean guestOk ;

    @JsonProperty("cifs_showhiddenfiles")
    private Boolean showHiddenFiles;


    @JsonProperty("cifs_hostsdeny")
    private Boolean hostsDeny;

    @JsonProperty("cifs_recyclebin")
    private Boolean recycleBin;


    @JsonProperty("cifs_auxsmbconf")
    private String auxSmbConf;


    @JsonProperty("cifs_comment")
    private String comment;

    @JsonProperty("cifs_path")
    private String path;


    @JsonProperty("cifs_ro")
    private Boolean readOnly;

    @JsonProperty("cifs_guestonly")
    private Boolean guestOnly;


    @JsonProperty("cifs_storage_task")
    private Boolean storageTask;


    @JsonProperty("id")
    private Long id;

    @JsonProperty("cifs_browsable")
    private Boolean browseble;

    public String getHostAllow() {
        return hostAllow;
    }

    public void setHostAllow(String hostAllow) {
        this.hostAllow = hostAllow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHome() {
        return home;
    }

    public void setHome(Boolean home) {
        this.home = home;
    }

    public String getDefaultPermissions() {
        return defaultPermissions;
    }

    public void setDefaultPermissions(String defaultPermissions) {
        this.defaultPermissions = defaultPermissions;
    }

    public Boolean getGuestOk() {
        return guestOk;
    }

    public void setGuestOk(Boolean guestOk) {
        this.guestOk = guestOk;
    }

    public Boolean getShowHiddenFiles() {
        return showHiddenFiles;
    }

    public void setShowHiddenFiles(Boolean showHiddenFiles) {
        this.showHiddenFiles = showHiddenFiles;
    }

    public Boolean getHostsDeny() {
        return hostsDeny;
    }

    public void setHostsDeny(Boolean hostsDeny) {
        this.hostsDeny = hostsDeny;
    }

    public Boolean getRecycleBin() {
        return recycleBin;
    }

    public void setRecycleBin(Boolean recycleBin) {
        this.recycleBin = recycleBin;
    }

    public String getAuxSmbConf() {
        return auxSmbConf;
    }

    public void setAuxSmbConf(String auxSmbConf) {
        this.auxSmbConf = auxSmbConf;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Boolean getGuestOnly() {
        return guestOnly;
    }

    public void setGuestOnly(Boolean guestOnly) {
        this.guestOnly = guestOnly;
    }

    public Boolean getStorageTask() {
        return storageTask;
    }

    public void setStorageTask(Boolean storageTask) {
        this.storageTask = storageTask;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getBrowseble() {
        return browseble;
    }

    public void setBrowseble(Boolean browseble) {
        this.browseble = browseble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CIFSShare cifsShare = (CIFSShare) o;

        if (hostAllow != null ? !hostAllow.equals(cifsShare.hostAllow) : cifsShare.hostAllow != null) return false;
        if (name != null ? !name.equals(cifsShare.name) : cifsShare.name != null) return false;
        if (home != null ? !home.equals(cifsShare.home) : cifsShare.home != null) return false;
        if (defaultPermissions != null ? !defaultPermissions.equals(cifsShare.defaultPermissions) : cifsShare.defaultPermissions != null)
            return false;
        if (guestOk != null ? !guestOk.equals(cifsShare.guestOk) : cifsShare.guestOk != null) return false;
        if (showHiddenFiles != null ? !showHiddenFiles.equals(cifsShare.showHiddenFiles) : cifsShare.showHiddenFiles != null)
            return false;
        if (hostsDeny != null ? !hostsDeny.equals(cifsShare.hostsDeny) : cifsShare.hostsDeny != null) return false;
        if (recycleBin != null ? !recycleBin.equals(cifsShare.recycleBin) : cifsShare.recycleBin != null) return false;
        if (auxSmbConf != null ? !auxSmbConf.equals(cifsShare.auxSmbConf) : cifsShare.auxSmbConf != null) return false;
        if (comment != null ? !comment.equals(cifsShare.comment) : cifsShare.comment != null) return false;
        if (path != null ? !path.equals(cifsShare.path) : cifsShare.path != null) return false;
        if (readOnly != null ? !readOnly.equals(cifsShare.readOnly) : cifsShare.readOnly != null) return false;
        if (guestOnly != null ? !guestOnly.equals(cifsShare.guestOnly) : cifsShare.guestOnly != null) return false;
        if (storageTask != null ? !storageTask.equals(cifsShare.storageTask) : cifsShare.storageTask != null)
            return false;
        if (id != null ? !id.equals(cifsShare.id) : cifsShare.id != null) return false;
        return browseble != null ? browseble.equals(cifsShare.browseble) : cifsShare.browseble == null;
    }

    @Override
    public int hashCode() {
        int result = hostAllow != null ? hostAllow.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (home != null ? home.hashCode() : 0);
        result = 31 * result + (defaultPermissions != null ? defaultPermissions.hashCode() : 0);
        result = 31 * result + (guestOk != null ? guestOk.hashCode() : 0);
        result = 31 * result + (showHiddenFiles != null ? showHiddenFiles.hashCode() : 0);
        result = 31 * result + (hostsDeny != null ? hostsDeny.hashCode() : 0);
        result = 31 * result + (recycleBin != null ? recycleBin.hashCode() : 0);
        result = 31 * result + (auxSmbConf != null ? auxSmbConf.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (readOnly != null ? readOnly.hashCode() : 0);
        result = 31 * result + (guestOnly != null ? guestOnly.hashCode() : 0);
        result = 31 * result + (storageTask != null ? storageTask.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (browseble != null ? browseble.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CIFSShare{" +
                "hostAllow='" + hostAllow + '\'' +
                ", name='" + name + '\'' +
                ", home=" + home +
                ", defaultPermissions='" + defaultPermissions + '\'' +
                ", guestOk=" + guestOk +
                ", showHiddenFiles=" + showHiddenFiles +
                ", hostsDeny=" + hostsDeny +
                ", recycleBin=" + recycleBin +
                ", auxSmbConf='" + auxSmbConf + '\'' +
                ", comment='" + comment + '\'' +
                ", path='" + path + '\'' +
                ", readOnly=" + readOnly +
                ", guestOnly=" + guestOnly +
                ", storageTask=" + storageTask +
                ", id=" + id +
                ", browseble=" + browseble +
                '}';
    }
}
