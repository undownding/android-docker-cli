package me.undownding.docker.model;

import java.io.Serializable;

/**
 * Created by undownding on 16-4-11.
 */
public class Version implements Serializable {

    /**
     * Version : 1.9.1
     * ApiVersion : 1.21
     * GitCommit : a34a1d5
     * GoVersion : go1.4.3
     * Os : linux
     * Arch : amd64
     * KernelVersion : 3.19.0-42-generic
     * BuildTime : Fri Nov 20 17:56:04 UTC 2015
     */

    private String Version;
    private String ApiVersion;
    private String GitCommit;
    private String GoVersion;
    private String Os;
    private String Arch;
    private String KernelVersion;
    private String BuildTime;

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getApiVersion() {
        return ApiVersion;
    }

    public void setApiVersion(String ApiVersion) {
        this.ApiVersion = ApiVersion;
    }

    public String getGitCommit() {
        return GitCommit;
    }

    public void setGitCommit(String GitCommit) {
        this.GitCommit = GitCommit;
    }

    public String getGoVersion() {
        return GoVersion;
    }

    public void setGoVersion(String GoVersion) {
        this.GoVersion = GoVersion;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String Os) {
        this.Os = Os;
    }

    public String getArch() {
        return Arch;
    }

    public void setArch(String Arch) {
        this.Arch = Arch;
    }

    public String getKernelVersion() {
        return KernelVersion;
    }

    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    public String getBuildTime() {
        return BuildTime;
    }

    public void setBuildTime(String BuildTime) {
        this.BuildTime = BuildTime;
    }
}
