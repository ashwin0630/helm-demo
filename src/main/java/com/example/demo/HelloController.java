package com.example.demo;

import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class HelloController {

    @RequestMapping("/home")
    public String home(){
        return "Hello World";
    }
}
