package com.helloworld.project.HelloWorld.controller;


@RestController
@RequestMapping("/api/user")
public class HelloWorldController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello World";
    }
}
