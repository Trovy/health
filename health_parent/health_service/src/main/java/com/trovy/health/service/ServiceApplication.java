package com.trovy.health.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Trovy
 * @Date: 2020/10/22 21:52
 */

public class ServiceApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:applicationContext-service.xml");
        System.in.read();
    }
}
