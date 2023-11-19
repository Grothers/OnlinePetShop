package com.onlinepetshop.onlinepetshop.services;

import com.onlinepetshop.onlinepetshop.models.Product;
import com.onlinepetshop.onlinepetshop.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "IPhone 14 pro", "test",
                50000,"Maksym Mahera","Kyiv"));

        products.add(new Product(++ID,"IPhone 15 pro", "test",
                70000,"Grothers","Dunaivtsi"));
    }

    public List<Product> listProducts(String title){
        if (title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void saveProducts(Product product){
        log.info("Saving new {}", product);
        productRepository.save(product);
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
