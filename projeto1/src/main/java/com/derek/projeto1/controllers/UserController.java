package com.derek.projeto1.controllers;

import com.derek.projeto1.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String getUsers(Model model){ 

        model.addAttribute("usersList", this.userService.findAll());

        return "user";
    }
}
