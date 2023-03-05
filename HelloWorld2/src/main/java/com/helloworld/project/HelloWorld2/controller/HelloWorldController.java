package com.helloworld.project.HelloWorld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String getHelloWorld() {

        int[] intArr = {1, 2, 3, 4};
        System.out.println(intArr);
        return "Hello World";
    }
}
