package com.example.Ecommerce.Service;

import com.example.Ecommerce.Model.Product2;
import com.example.Ecommerce.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service //Converts simple java class to a Service layer class
public class ProductService {
    //Contains the logic for returning Data to ProductController.

    //List of Products
     private List<Product2> products2 =  Arrays.asList(
            new Product2("G006","Kissan Mixed Fruit Jam","groceries","Kissan Mixed Fruit Jam , With Real Fruit Ingredients, 200 g",67.00,80.00,16,true,1500,4.4f,4193),
            new Product2("G001","Daawat Biryani Basmati Rice","groceries","Daawat Biryani Basmati Rice, 5 Kg| World s Longest Rice Grain expands 24mm* | Tasty, Non-sticky & Rich Aroma |Naturally Aged",989.00,1245.00,21,true,800,4.0f,2452),
            new Product2("G003","ABHI EGGS","groceries","ABHI EGGS Gold+ Brown Eggs Box (Pack of 6)",105.00,115.00,9,true,200,4.1f,586),
            new Product2("G004","Fortune Sugar","groceries","Fortune Sugar, 1 kg",58.00,75.00,23,true,3000,4.5f,6005),
            new Product2("G005","GEMINI REF SUNFLOWER OIL","groceries","GEMINI REF SUNFLOWER OIL 840g-840ML Pouch",159.00,192.00,17,true,2500,4.4f,2554)
    );
//    private List<Product> products = Arrays.asList(
//            new Product(1,"Kitkat",10.00d),
//            new Product(2,"Lays",20.00d)
//    );
    private List<Product> products = new ArrayList<Product>(Arrays.asList(
            new Product(1,"Kitkat",10.00d),
            new Product(2,"Lays",20.00d)
    ));
    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        // JavaStreamAPI
//        return products.stream()
//                .filter(p -> p.getProd_id() == prodId)
//                .findFirst()
//                .get();
        return products.stream()
                .filter(p -> p.getProd_id() == prodId)
                .findFirst()
                .orElse(new Product(0, "noItem",0));
        // Or you can use a normal For loop.
    }

    public String addProduct(Product product) {
        products.add(product);
        return this.getProductById(product.getProd_id()).toString()+"\n"+"Product added successfully";
    }

    public String updateProduct(Product product) {
        int index = 0;
//        for(Product p : products) {
//            if(p.getProd_id() == product.getProd_id()) {
//                index = p.getProd_id();
//            }
//        }
        for(int i = 0; i < products.size(); i++) {
            if(products.get(i).getProd_id() == product.getProd_id()) {
                index = i;
            }
        }
        products.set(index, product);
        return this.getProductById(product.getProd_id()).toString()+"\n"+"Product updated successfully";
    }
}
