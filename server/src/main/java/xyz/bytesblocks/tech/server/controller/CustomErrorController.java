package xyz.bytesblocks.tech.server.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bytesblocks.tech.server.model.R;

@RestController
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public R<?> handleError() {
        return R.fail("请求失败");
    }
}
