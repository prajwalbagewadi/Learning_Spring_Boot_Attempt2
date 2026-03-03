package com.prajwal.SimpleRestApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String login(String pass) { //data from client is accepted in arguments.
        System.out.println("pass:"+pass);
        return "login page demo."+"clientData:"+pass;
    }
}
