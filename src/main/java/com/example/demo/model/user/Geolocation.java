package com.example.demo.model.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Geolocation {

    private double lat;
    private double Long;

    @Override
    public String toString() {
        return "{" +
                "lat:" + lat +
                ", long:" + Long +
                '}';
    }
}
