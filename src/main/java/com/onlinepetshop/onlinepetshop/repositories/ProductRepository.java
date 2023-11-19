package com.onlinepetshop.onlinepetshop.repositories;

import com.onlinepetshop.onlinepetshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
