package com.di.app.app_di.controllers;

import com.di.app.app_di.models.Product;
import com.di.app.app_di.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BaseController {
    private ProductService productService = new ProductService();

    @GetMapping("all")
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/findid")
    public Product show(@RequestParam Long id){ //aqui esta @PathVariable
        return productService.findById(id);
    }
}
