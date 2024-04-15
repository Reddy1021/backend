package com.example.spring.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/demotest")
public class Controller {

    @GetMapping
    public String test(){
        return "get api work";
    }

    @PostMapping
    public  String test1(){
        return "post api work";
    }
    @PutMapping
    public String test2(){
        return "put api work";
    }
    @DeleteMapping
    public String test3(){
        return "delete api work";
    }
}
