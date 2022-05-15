package com.example.demo.model.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rating {
    private double rate;
    private double count;

    @Override
    public String toString() {
        return "{" +
                "rate:" + rate +
                ", count:" + count +
                '}';
    }
}
