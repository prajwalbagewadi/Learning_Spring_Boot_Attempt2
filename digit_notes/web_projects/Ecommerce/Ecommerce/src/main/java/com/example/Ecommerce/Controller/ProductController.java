package com.example.Ecommerce.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/getproduct")
    public String getProducts() {
        return "getproduct controller";
    }
}
