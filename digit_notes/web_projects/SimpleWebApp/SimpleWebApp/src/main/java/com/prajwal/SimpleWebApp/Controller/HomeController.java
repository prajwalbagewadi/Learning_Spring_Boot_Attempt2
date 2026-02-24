package com.prajwal.SimpleWebApp.Controller;

public class HomeController {
    //In this class we can accept the request and response.
    //To do the request and response we need a method.

    public String greet() {
        return "Welcome to simple web app!";
        //Return-type as "String" as it returns a text.
    }
}
