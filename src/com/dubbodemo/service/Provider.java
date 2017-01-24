package com.dubbodemo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by cuishaojie on 2017/1/16.
 */
public class Provider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[]{"spring-mvc.xml"});
        context.start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] { "applicationContext.xml" });
//        context.start();
//
//        DemoService demoService = (DemoService) context.getBean("demoService");
//        String hello = demoService.sayHello("hejingyuan");
//        System.out.println(hello);
//
//        System.in.read();
//    }
}
