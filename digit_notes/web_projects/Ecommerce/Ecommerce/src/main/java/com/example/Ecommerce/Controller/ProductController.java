package com.example.Ecommerce.Controller;

import java.util.List;
import com.example.Ecommerce.Model.Product;
import com.example.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
//    @RequestMapping("/getproduct")
//    public String getProducts() {
//        return "getproduct controller";
//    }

    @RequestMapping("/products")
    public List<Product> showProducts() {
        return productService.getProducts();
    }

    @RequestMapping("/products/{id}") //default GET method
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    //@RequestMapping(value = "/products", method = RequestMethod.POST)
    @PostMapping("/products")
    public String addProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.addProduct(product);
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
}
