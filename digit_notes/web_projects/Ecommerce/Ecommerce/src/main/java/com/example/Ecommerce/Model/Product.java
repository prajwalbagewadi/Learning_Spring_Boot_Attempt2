package com.example.Ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Data //Will provide Lombok functionality
//@AllArgsConstructor //Creates a Lombok Constructor with all args for me.
@Component //Converts the Simple class to Bean class.
public class Product {
    private int id;
    private String name;
    private double price;
}
