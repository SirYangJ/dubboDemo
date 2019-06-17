package com.example.demo1.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo1.service.Demo1Service;

/**
 * @Description
 * @Author yangjie
 * @Create 2019-06-14 10:38
 */
@Service(version = "1.0.0")
public class Demo1ServiceImpl implements Demo1Service {

    @Override
    public String find() {
        return "你好dubbo";
    }
}
