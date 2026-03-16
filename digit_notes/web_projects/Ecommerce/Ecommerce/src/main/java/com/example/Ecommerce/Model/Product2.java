package com.example.Ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data //Will provide Lombok functionality
@AllArgsConstructor //Creates a Lombok Constructor with all args for me.
//@Component //Converts Simple class to a Bean class
public class Product2 {
    private String prodId;
    private String prodName;

    private String category;
    private String prodDescription;

    private double price;
    private double mrp;
    private int discountPercentage;

    private boolean inStock;
    private int stockQuantity;
    private float rating;
    private int totalRating;

}
