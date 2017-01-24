package com.dubbodemo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by cuishaojie on 2017/1/16.
 */
@Component
public class Consumer {

    @Reference(version="1.0.0")
    static DemoService demoService;

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-mvc.xml" });
        context.start();
        demoService.sayHello("lai");

        System.in.read();
    }
}
