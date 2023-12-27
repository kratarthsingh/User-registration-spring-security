package com.kratarthcodes.client.controller;

import com.kratarthcodes.client.entity.User;
import com.kratarthcodes.client.model.UserModel;
import com.kratarthcodes.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){

        User user = userService.registerUser(userModel);
        return "Success!";
    }

    @GetMapping("/test")
    public String sayHello(){
        return "Hello, Kratarth!";
    }
}
