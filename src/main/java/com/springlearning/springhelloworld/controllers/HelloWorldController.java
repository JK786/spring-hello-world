package com.springlearning.springhelloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/SayHello.json")
    public String getHello() {
        return "Hello Jibran";
    }
}
