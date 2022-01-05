package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hellocontroller {

    @RequestMapping("/hellospringboot")
    public String str1(){
        return "Hello spring-boot,我是张耀伟";
    }
}
