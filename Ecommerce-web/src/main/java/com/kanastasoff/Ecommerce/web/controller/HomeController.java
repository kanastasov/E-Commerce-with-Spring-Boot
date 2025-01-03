package com.kanastasoff.Ecommerce.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "RestController";
    }
@RequestMapping("/about")
    public String about(){
        return "About";
    }
}
