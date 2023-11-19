package com.onlinepetshop.onlinepetshop.repositories;

import com.onlinepetshop.onlinepetshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
