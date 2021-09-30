package com.dcube.croffle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello, world";
    }

    @GetMapping("/croffle")
    public String croffle() {
        return "hello, croffle";
    }
}
