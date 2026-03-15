package com.example.Ecommerce.Repository;

import com.example.Ecommerce.Model.Product2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product2, Integer> {
}
