package xyz.bytesblocks.tech.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bytesblocks.tech.StatsUtil;
import xyz.bytesblocks.tech.server.config.OssProperties;

@RestController
@RequestMapping("/test")
@EnableConfigurationProperties({OssProperties.class})
public class TestController {

    @Autowired
    private OssProperties ossProperties;

    @Autowired
    private Environment environment;

    @Value("${oss.endpoint}")
    private String endpoint;

    @GetMapping("/yoy")
    public double yoy() {
        return StatsUtil.yearOnYear(2, 1);
    }

    @GetMapping("/config")
    public void config() {
        System.out.println("ossProperties.getEndpoint() = " + ossProperties.getEndpoint());
        System.out.println("environment.getProperty(\"oss.endpoint\") = " + environment.getProperty("oss.endpoint"));
        System.out.println("endpoint = " + endpoint);
    }

}
