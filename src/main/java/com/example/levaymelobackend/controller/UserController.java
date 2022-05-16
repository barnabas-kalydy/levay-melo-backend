package com.example.levaymelobackend.controller;

import com.example.levaymelobackend.model.UserModel;
import com.example.levaymelobackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping()
    public ResponseEntity<List<UserModel>> getUsers() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @RequestMapping(method = POST, path = "/add")
    public ResponseEntity<Void> addUser(@RequestBody UserModel userModel){
        userService.addUser(userModel);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = DELETE, path = "/delete/{userName}")
    public ResponseEntity<Void> deleteUser(@PathVariable(name = "userName") String userName) {
        userService.deleteUser(userName);
        return ResponseEntity.ok().build();
    }
}
