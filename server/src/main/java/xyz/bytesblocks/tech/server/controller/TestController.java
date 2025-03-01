package xyz.bytesblocks.tech.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bytesblocks.tech.StatsUtil;
import xyz.bytesblocks.tech.server.model.BizException;
import xyz.bytesblocks.tech.server.model.R;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/yoy")
    public double yoy() {
        return StatsUtil.yearOnYear(2, 1);
    }

    @GetMapping("/error")
    public R<?> error() {
        throw new BizException("自定义异常");
    }
}
