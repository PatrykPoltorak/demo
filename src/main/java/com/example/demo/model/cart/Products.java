package com.example.demo.model.cart;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
    private int productId;
    private int quantity;

    @Override
    public String toString() {
        return "{" +
                "productId:" + productId +
                ", quantity:" + quantity +
                '}';
    }
}
