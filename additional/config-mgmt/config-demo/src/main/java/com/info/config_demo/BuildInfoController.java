package com.info.config_demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@AllArgsConstructor
@RefreshScope
public class BuildInfoController {
//    private final BuildInfo buildInfo;

    @Value("${build.id:default}")
    private String buildId;

    @Value("${build.version:default}")
    private String buildVersion;

    @Value("${build.name:default}")
    private String buildName;

    @GetMapping("/build-info")
    public String getBuildInfo() {
//        return "Build Id: " + buildInfo.getId() + ", Version: " + buildInfo.getVersion() + ", Name: " + buildInfo.getName();
        return "Build Id: " + buildId + ", Version: " + buildVersion + ", Name: " + buildName;
    }
}
