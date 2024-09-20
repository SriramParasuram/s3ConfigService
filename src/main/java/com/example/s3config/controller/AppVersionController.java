package com.example.s3config.controller;

import com.example.s3config.model.AppVersion;
import com.example.s3config.model.MicroApp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/msil/s3config")
public class AppVersionController {

    @GetMapping
    public AppVersion getAppVersion() {
        MicroApp folioApp = new MicroApp();
        folioApp.setMicroAppDisplayName("Fe-Folio");
        folioApp.setMicroAppS3Url("https://jenkins-awsbucket.s3.us-east-1.amazonaws.com/fe-folio.zip?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAZI2LIVL5RBOHKYVK%2F20240919%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240919T123241Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=87b74303b237c3eceef2dd4adcd7ef6c9a14c6ac94c1f0d897d5602a173e9e3a");
        folioApp.setMicroAppVersion("1.0.0.1");
        folioApp.setOnAppLaunchDownload("true");

        MicroApp orderpadApp = new MicroApp();
        orderpadApp.setMicroAppDisplayName("Fe-Orderpad");
        orderpadApp.setMicroAppS3Url("https://jenkins-awsbucket.s3.us-east-1.amazonaws.com/fe-orderpad.zip?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAZI2LIVL5RBOHKYVK%2F20240920%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240920T075243Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=e862c8902b7f169cb6df888c6f6981d14312a340752eb9b3896ab0517d5ec0d5");
        orderpadApp.setMicroAppVersion("1.0.0.1");
        orderpadApp.setOnAppLaunchDownload("true");

        List<MicroApp> microAppList = new ArrayList<>();
        microAppList.add(folioApp);
        microAppList.add(orderpadApp);

        List<List<MicroApp>> microAppsOuterList = new ArrayList<>();
        microAppsOuterList.add(microAppList);

        AppVersion appVersion = new AppVersion();
        appVersion.setAppVersion("1.0");
        appVersion.setMicroApps(microAppsOuterList);

        return appVersion;
    }
}

