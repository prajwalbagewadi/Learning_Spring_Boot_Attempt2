package com.example.Ecommerce.Service;

import com.example.Ecommerce.Model.Product2;
import com.example.Ecommerce.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service //Converts simple java class to a Service layer class
public class ProductService {
    //Contains the logic for returning Data to ProductController.

    public List<Product> getProducts() {
        //List of Products
        List<Product2> products2 =  Arrays.asList(
                new Product2("G006","Kissan Mixed Fruit Jam","groceries","Kissan Mixed Fruit Jam , With Real Fruit Ingredients, 200 g",67.00,80.00,16,true,1500,4.4f,4193),
                new Product2("G001","Daawat Biryani Basmati Rice","groceries","Daawat Biryani Basmati Rice, 5 Kg| World s Longest Rice Grain expands 24mm* | Tasty, Non-sticky & Rich Aroma |Naturally Aged",989.00,1245.00,21,true,800,4.0f,2452),
                new Product2("G003","ABHI EGGS","groceries","ABHI EGGS Gold+ Brown Eggs Box (Pack of 6)",105.00,115.00,9,true,200,4.1f,586),
                new Product2("G004","Fortune Sugar","groceries","Fortune Sugar, 1 kg",58.00,75.00,23,true,3000,4.5f,6005),
                new Product2("G005","GEMINI REF SUNFLOWER OIL","groceries","GEMINI REF SUNFLOWER OIL 840g-840ML Pouch",159.00,192.00,17,true,2500,4.4f,2554)
        );
        List<Product> products = Arrays.asList(
          new Product(1,"Kitkat",10.00d),
          new Product(2,"Lays",20.00d)
        );
        return products;
    }

    public Product getProductById(int prodId) {
    }
}
