package com.di.app.app_di.services;

import com.di.app.app_di.models.Product;

import java.util.List;


public interface ProductService {
    public List<Product> findAll();
     public Product findById(Long id);
}
