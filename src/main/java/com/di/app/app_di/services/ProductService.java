package com.di.app.app_di.services;

import com.di.app.app_di.models.Product;
import com.di.app.app_di.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll(){
        return productRepository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice()*1.45d;
            p.setPrice(priceImp.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
