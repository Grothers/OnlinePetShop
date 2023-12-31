package com.onlinepetshop.onlinepetshop.services;

import com.onlinepetshop.onlinepetshop.models.Image;
import com.onlinepetshop.onlinepetshop.models.Product;
import com.onlinepetshop.onlinepetshop.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> listProducts(String title) {
        if (title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void saveProducts(Product product,
                             MultipartFile file1, MultipartFile file2, MultipartFile file3)
            throws IOException {
        Image image1;

        Image image2;

        Image image3;

        if (file1.getSize() != 0) {
            image1 = toImageEntity(file1);
            image1.setPreviewImage(true);
            product.addImageToProduct(image1);
        }

        if (file2.getSize() != 0) {
            image2 = toImageEntity(file2);
            image2.setPreviewImage(true);
        }


        if (file3.getSize() != 0) {
            image3 = toImageEntity(file3);
            image3.setPreviewImage(true);
        }

        log.info("Saving new Product. Title : {}; Author : {}", product.getTitle(),product.getAuthor());
        productRepository.save(product);
    }

    private Image toImageEntity(MultipartFile file1)
            throws IOException {
        Image image = new Image();
        image.setName(file1.getName());
        image.setOriginalFileName(file1.getOriginalFilename());
        image.setContentType(file1.getContentType());
        image.setSize(file1.getSize());
        image.setBytes(file1.getBytes());
        return image;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void saveProducts(Product product) {
    }
}
