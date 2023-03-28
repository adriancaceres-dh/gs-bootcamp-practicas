package com.JPA.demo.repository;


import com.JPA.demo.entity.Client;
import com.JPA.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {
 /*
    List<Product> findByNameContaining(String name);

    List<Product> findByDescriptionContaining(String description);

  */
}
