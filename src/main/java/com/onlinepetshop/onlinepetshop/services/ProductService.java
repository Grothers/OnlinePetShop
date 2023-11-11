package com.onlinepetshop.onlinepetshop.services;

import com.onlinepetshop.onlinepetshop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "IPhone 14 pro", "test",
                50000,"Maksym Mahera","Kyiv"));

        products.add(new Product(++ID,"IPhone 15 pro", "test",
                70000,"Grothers","Dunaivtsi"));
    }

    public List<Product> listProducts(){
        return products;
    }

    public void saveProducts(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id))
    }
}
