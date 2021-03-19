package com.kaushik.springsecurity.controller;

import com.kaushik.springsecurity.entity.User;
import com.kaushik.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/login")
    public String Login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String store(User user){
        userService.saveOrUpdate(user);
        return "redirect:/login";
    }
}
