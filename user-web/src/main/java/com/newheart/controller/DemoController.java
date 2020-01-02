package com.newheart.controller;

import com.newheart.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author newHeart
 * @Create 2020/1/2 23:29
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello(){
        return demoService.hello();
    }
}
