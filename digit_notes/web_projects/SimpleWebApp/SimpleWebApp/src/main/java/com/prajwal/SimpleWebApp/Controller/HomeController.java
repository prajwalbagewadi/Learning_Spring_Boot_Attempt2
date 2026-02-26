package com.prajwal.SimpleWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //Error Whitelabelpage
@RestController //fix
public class HomeController {
    //In this class we can accept the request and response.
    //To do the request and response we need a method.

    @RequestMapping("/")
    public String greet() {
        return "Welcome to simple web app!";
        //Return-type as "String" as it returns a text.
    }
}
