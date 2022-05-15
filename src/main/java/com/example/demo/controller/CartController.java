package com.example.demo.controller;

import com.example.demo.model.cart.Cart;
import com.example.demo.service.cartsService.CartsService;
import com.example.demo.service.producttsService.ProductsService;
import com.example.demo.service.usersService.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    private final ProductsService productsService;
    private final CartsService cartService;

    private final UsersService usersService;

    public CartController(ProductsService productsService, CartsService cartService, UsersService usersService) {
        this.productsService = productsService;
        this.cartService = cartService;
        this.usersService = usersService;
    }

    @GetMapping("/carts")
    public List<Cart> users(){
        return cartService.getCarts();
    }

    @GetMapping("/highestValue")
    public String getHighestValue(){
        return cartService.getHighestValue(productsService.getProducts(), usersService.getUsers());
    }
}
