package com.info.config_demo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BuildInfoController {
    private final BuildInfo buildInfo;

    @GetMapping("/build-info")
    public String getBuildInfo() {
        return "Build Id: " + buildInfo.getId() + ", Version: " + buildInfo.getVersion() + ", Name: " + buildInfo.getName();
    }
}
