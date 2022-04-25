package com.example.levaymelobackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @GetMapping("/getUser")
    public ResponseEntity<String> getUser() {
        return ResponseEntity.ok("it works");
    }
}
