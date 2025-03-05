package com.marshsoftwaregeeks.javaknowledge.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/devops")

    public String getDevops(){
        return "Welcome to Devops";
    }

}
