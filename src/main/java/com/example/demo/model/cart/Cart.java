package com.example.demo.model.cart;

import com.example.demo.model.cart.Products;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
public class Cart {

    private int id;
    private int userId;
    private OffsetDateTime date;
    private List<Products> products;

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                "userId:" + id +
                ", date:" + date +
                ", products:" + products +
                '}';
    }
}
