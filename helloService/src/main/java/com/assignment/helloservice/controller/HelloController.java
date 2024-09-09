package com.assignment.helloservice.controller;

import com.assignment.helloservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {


    @Autowired
    private HelloService helloService;

    @GetMapping("/getHelloWorldMessage")
    public String getHelloWorldMessage(){

        return helloService.getHelloWorldMessage();
    }


    @GetMapping("/getMessage")
    public String getMessage(){

        return "Hello-Service Running Successfully!!";
    }


}
