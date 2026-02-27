package com.prajwal.SimpleRestApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @RequestMapping("/Rest")
    public String response() {
        return "Hello from RestTestController!";
    }
}
