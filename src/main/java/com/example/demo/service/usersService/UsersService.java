package com.example.demo.service.usersService;

import com.example.demo.model.user.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {
    private String url = "https://fakestoreapi.com/users";
    private RestTemplate restTemplate = new RestTemplate();

    public List<User> getUsers() {
         User[] users = restTemplate.getForObject(url, User[].class);
         List<User> list = new ArrayList<User>(Arrays.asList(users));

         return list;
    }

    public String getUsersFurthest(){
        List<User> users = this.getUsers();
        User user1 = new User();
        User user2 = new User();
        double furthest = 0;
        for(User user : users){
            for(User tmpuser : users){
                if(user.getId() == tmpuser.getId()){
                    continue;
                }
                Point point = new Point();
                point.setLocation(user.getAddress().getGeolocation().getLat(), user.getAddress().getGeolocation().getLong());

                Point point2 = new Point();
                point2.setLocation(tmpuser.getAddress().getGeolocation().getLat(),tmpuser.getAddress().getGeolocation().getLong());

                double tmpFurthest = point.distance(point2);
                if(furthest < tmpFurthest){
                    furthest = tmpFurthest;
                    user1 = user;
                    user2 = tmpuser;
                }
            }
        }
        return "users1: "+ user1.getId() +
                ", user1 name: " + user1.getName() +
                ", users2: " + user2.getId() +
                ", user2 name: " + user2.getName() +
                ", furthest: " + furthest;
    }
}
