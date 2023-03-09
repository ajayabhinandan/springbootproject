package com.learning.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/firsturl")
    public String printMessage(){
        return "This is a Test Project for Jenkins";
    }
}
