package com.example.Ecommerce.Repository;
import com.example.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DbProductRepo extends JpaRepository<Product, Integer> {
/*
* JpaRepository<T, ID>
* T - Entity Class
* ID - Type of primary key
* */
}
