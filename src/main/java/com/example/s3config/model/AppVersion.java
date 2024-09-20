package com.example.s3config.model;

import java.util.List;

public class AppVersion {
    private String appVersion;
    private List<List<MicroApp>> microApps;

    // Getters and Setters
    public String getAppVersion() { return appVersion; }
    public void setAppVersion(String appVersion) { this.appVersion = appVersion; }

    public List<List<MicroApp>> getMicroApps() { return microApps; }
    public void setMicroApps(List<List<MicroApp>> microApps) { this.microApps = microApps; }
}

