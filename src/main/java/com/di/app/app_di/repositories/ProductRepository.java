package com.di.app.app_di.repositories;

import com.di.app.app_di.models.Product;

import java.util.List;

public interface ProductRepository {
    public List<Product> findAll() ;
    public Product findById(Long id);
}
