package xyz.bytesblocks.tech.server.controller;

import cn.idev.excel.FastExcel;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FastByteArrayOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.bytesblocks.tech.StatsUtil;
import xyz.bytesblocks.tech.server.model.User;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/yoy")
    public double yoy() {
        return StatsUtil.yearOnYear(2, 1);
    }

    @GetMapping("/export")
    public void exportUser(HttpServletResponse response) throws IOException {
        final FastByteArrayOutputStream fos = new FastByteArrayOutputStream();
        ClassPathResource classPathResource = new ClassPathResource("user-template.xlsx");
        FastExcel.write(fos)
                .withTemplate(classPathResource.getInputStream())
                .sheet()
                .doFill(fakeUsers());
        final byte[] data = fos.toByteArray();
        fos.close();
        response.setHeader("Content-Disposition", "attachment; filename=user.xlsx");
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setContentLength(data.length);
        response.getOutputStream()
                .write(data);
    }

    private List<User> fakeUsers() {
        return List.of(
                new User(1L, "张三"),
                new User(2L, "李四"),
                new User(3L, "王五"),
                new User(4L, "赵六")
        );
    }
}
