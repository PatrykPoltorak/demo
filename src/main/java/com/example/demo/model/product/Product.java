package com.example.demo.model.product;

import com.example.demo.model.product.Rating;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private float price;
    private String description;
    private String category;
    private String image;
    private Rating rating;

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", title:'" + title + '\'' +
                ", price:" + price +
                ", description:'" + description + '\'' +
                ", category:'" + category + '\'' +
                ", image:'" + image + '\'' +
                ", rating:" + rating +
                '}';
    }
}
