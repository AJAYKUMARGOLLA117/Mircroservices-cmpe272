package com.assignment.worldservice.controller;


import com.assignment.worldservice.service.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorldController {

    @Autowired
    private WorldService worldService;


    @GetMapping("/getWorldMessage")
    public String getWorldMessage(){

        return worldService.getWorldMessage();
    }


}
