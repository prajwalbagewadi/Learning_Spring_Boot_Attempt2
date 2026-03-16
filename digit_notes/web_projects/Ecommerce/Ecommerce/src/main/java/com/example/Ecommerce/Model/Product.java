package com.example.Ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Data //Will provide Lombok functionality
//@AllArgsConstructor //Creates a Lombok Constructor with all args for me.
@Component //Converts the Simple class to Bean class.
public class Product {
    private int prod_id;
    private String prod_name;
    private double prod_price;

    public Product(int prod_id, String prod_name, double prod_price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_price = prod_price;
    }


    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }
}
