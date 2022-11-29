package com.vbharti.springbootcrudpostgres.repository;


import com.vbharti.springbootcrudpostgres.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

