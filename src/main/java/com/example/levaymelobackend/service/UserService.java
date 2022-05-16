package com.example.levaymelobackend.service;

import com.example.levaymelobackend.model.UserModel;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {

    ArrayList<UserModel> users = new ArrayList<>();

    public List<UserModel> getAllUser() {

        return users;
    }

    public void addUser(UserModel userModel) {
        users.add(userModel);
    }

    public void deleteUser(String userName) {
        Iterator<UserModel> i = users.iterator();
        while (i.hasNext()) {
            UserModel userModel = i.next();
            if (userModel.getUsername().equals(userName)) {
                i.remove();
            }
        }
    }
}
