package com.example.controller;/*
 *
 *create by  on 2019/8/22
 */


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world";
    }

}
