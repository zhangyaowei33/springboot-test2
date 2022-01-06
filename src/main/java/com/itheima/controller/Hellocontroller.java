package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hellocontroller {

    @Value("${name}")
    private String name1;

    @Value("${person.name}")
    private String name;

    @Value("${address[0]}")
    private String add1;

    @RequestMapping("/name")
    public String str2(){
        System.out.println(name);
        return name;
    }

    @RequestMapping("/add")
    public String add(){
        System.out.println(add1);
        return add1;
    }


    @Autowired
    private Environment env;

    @RequestMapping("/hellospringboot")
    public String str1(){

        System.out.println(env.getProperty("person.name1"));
        System.out.println(env.getProperty("person.age"));
        System.out.println(env.getProperty("address[1]"));
        return "Hello spring-boot,我是张耀伟";


    }

    @Autowired
    private Person person;

    @RequestMapping("/sss")
    public String sss(){
        System.out.println(person);
        return "测试ConfigurationProperties";

    }
}
