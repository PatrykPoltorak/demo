package com.example.demo.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private Address address;

    private String email;
    private String username;
    private String password;
    private Name name;
    private String phone;

    @Override
    public String toString() {
        return " {" +
                "address:" + address +
                ", id:" + id +
                ", email:'" + email + '\'' +
                ", username:'" + username + '\'' +
                ", password:'" + password + '\'' +
                ", name:" + name +
                ", phone:'" + phone + '\'' +
                '}';
    }
}
