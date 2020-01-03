package com.newheart.service.impl;

import com.newheart.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author newHeart
 * @Create 2020/1/2 23:16
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String hello() {
        System.out.println("被调用");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello Dubbo";
    }
}
