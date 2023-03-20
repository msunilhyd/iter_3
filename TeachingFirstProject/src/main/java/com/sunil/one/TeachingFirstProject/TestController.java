package com.sunil.one.TeachingFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Sunil";
    }
}
