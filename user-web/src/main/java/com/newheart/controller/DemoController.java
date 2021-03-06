package com.newheart.controller;

import com.newheart.service.DemoService;
import com.newheart.service.FileService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author newHeart
 * @Create 2020/1/2 23:29
 */
@RestController
public class DemoController {

    @Reference(version = "1.0.0",timeout = 3000,registry = "3",cluster = "failsafe")
    private DemoService demoService;

    @Reference(version = "1.0.0")
    private FileService fileService;

    @RequestMapping("/hello")
    public String hello(){
        return demoService.hello();
    }


    @RequestMapping("/upload")
    public void upload(String msg){
        fileService.upload(msg);
    }
}
