package com.example.s3config.model;




public class MicroApp {
    private String microAppDisplayName;
    private String microAppS3Url;
    private String microAppVersion;
    private String onAppLaunchDownload;

    // Getters and Setters
    public String getMicroAppDisplayName() { return microAppDisplayName; }
    public void setMicroAppDisplayName(String microAppDisplayName) { this.microAppDisplayName = microAppDisplayName; }

    public String getMicroAppS3Url() { return microAppS3Url; }
    public void setMicroAppS3Url(String microAppS3Url) { this.microAppS3Url = microAppS3Url; }

    public String getMicroAppVersion() { return microAppVersion; }
    public void setMicroAppVersion(String microAppVersion) { this.microAppVersion = microAppVersion; }

    public String getOnAppLaunchDownload() { return onAppLaunchDownload; }
    public void setOnAppLaunchDownload(String onAppLaunchDownload) { this.onAppLaunchDownload = onAppLaunchDownload; }
}
