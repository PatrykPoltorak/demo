package com.example.demo.controller;

import com.example.demo.service.usersService.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List users(){
        return usersService.getUsers();
    }

    @GetMapping("/users/furthest")
    public String getFurthest(){
       return usersService.getUsersFurthest();
    }
}
