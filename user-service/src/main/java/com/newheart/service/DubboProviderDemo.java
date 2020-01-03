package com.newheart.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Author newHeart
 * @Create 2020/1/2 23:17
 */
@EnableAutoConfiguration
public class DubboProviderDemo {
    public static void main(String[] args) {
//        非web方式启动
        new SpringApplicationBuilder(DubboProviderDemo.class).web(WebApplicationType.NONE).run();
//        SpringApplication.run(DubboProviderDemo.class);
    }
}
