package com.example.demo.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Name {
    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return "{" +
                "firstname:" + firstname + '\'' +
                ", lastname:" + lastname + '\'' +
                '}';
    }
}
