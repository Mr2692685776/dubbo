package com.newheart.service.impl;

import com.newheart.service.FileService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 基于rest调用
 * @Author newHeart
 * @Create 2020/1/3 23:19
 */
@Service(version = "1.0.0",protocol = {"http"})
public class FileServiceImpl implements FileService {
    @Override
    public void upload(String msg) {
        System.out.println(msg);
    }
}
