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
        return "hello Dubbo";
    }
}
