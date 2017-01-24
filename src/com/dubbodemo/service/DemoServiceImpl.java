package com.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuishaojie on 2017/1/16.
 */
@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
