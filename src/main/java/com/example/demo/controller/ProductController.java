package com.example.demo.controller;

import com.example.demo.model.product.Product;
import com.example.demo.service.producttsService.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {
    private final ProductsService productsService;

    public ProductController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public List<Product> users(){
        return productsService.getProducts();
    }
    @GetMapping("/products/category")
    public Map productCategory(){
        return productsService.getProductCategory();
    }
}
