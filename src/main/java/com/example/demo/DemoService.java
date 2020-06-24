package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {
    private List<User> users = new ArrayList<>();


    public void saveUser(User user) {
        users.add(0, user);
    }

    public List<User> getUsers() {
        return users;
    }
}
