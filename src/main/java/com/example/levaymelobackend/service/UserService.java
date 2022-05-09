package com.example.levaymelobackend.service;

import com.example.levaymelobackend.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    ArrayList<UserModel>users = new ArrayList<>();

    public List<UserModel> getAllUser() {

        return users;
    }

    public void addUser(UserModel userModel) {
        users.add(userModel);
    }
}
