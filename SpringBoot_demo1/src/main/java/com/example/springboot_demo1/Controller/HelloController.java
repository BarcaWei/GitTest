package com.example.springboot_demo1.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello")

    public String hello(){

        return "Hello Springboot";
    }
}
