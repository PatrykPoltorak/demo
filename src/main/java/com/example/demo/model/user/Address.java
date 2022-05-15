package com.example.demo.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private Geolocation geolocation ;
    private String city;
    private String street;
    private int number;
    private String zipcode;

    @Override
    public String toString() {
        return "{" +
                "geolocation:" + geolocation +
                ", city:" + city + '\'' +
                ", street:" + street + '\'' +
                ", number:" + number +
                ", zipCode:" + zipcode + '\'' +
                '}';
    }
}
