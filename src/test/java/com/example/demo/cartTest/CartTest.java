package com.example.demo.cartTest;

import com.example.demo.model.cart.Cart;
import com.example.demo.model.cart.Products;
import com.example.demo.model.product.Product;
import com.example.demo.model.user.User;
import com.example.demo.service.cartsService.CartsService;
import com.example.demo.service.usersService.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class CartTest {
    CartsService cartService = new CartsService();
    UsersService usersService = new UsersService();


    @Test
    void CartIsNotEmpty(){
        List<Cart> cart = cartService.getCarts();
        assertNotNull(cart.size());
    }


    @Test
    void userNotFound(){
        User user = cartService.searchUser(usersService.getUsers(),20);
        assertNull(user);
    }
    @Test
    void userFound(){
        User user = cartService.searchUser(usersService.getUsers(),3);
        assertNotNull(user);
    }


    private float searchPrice(List<Product> products, Products tmpProducts){
        for (Product tmpProduct : products){
            if(tmpProduct.getId() == tmpProducts.getProductId()){
                return tmpProduct.getPrice();
            }
        }
        return 0;
    }

}





