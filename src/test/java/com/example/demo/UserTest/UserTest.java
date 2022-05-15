package com.example.demo.UserTest;
import com.example.demo.model.user.User;
import com.example.demo.service.usersService.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserTest {
    UsersService usersService = new UsersService();
    @Test
    void userNotEmpty(){
        List<User> list = usersService.getUsers();
        assertNotNull(list.size());
    }


}
