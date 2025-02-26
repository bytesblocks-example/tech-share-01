package xyz.bytesblocks.tech.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bytesblocks.tech.StatsUtil;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/yoy")
    public double yoy() {
        return StatsUtil.yearOnYear(2, 1);
    }
}
