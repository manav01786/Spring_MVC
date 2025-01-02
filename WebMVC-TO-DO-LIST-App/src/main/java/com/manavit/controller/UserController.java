package com.manavit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manavit.entity.UserEntity;
import com.manavit.servicelayer.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser( UserEntity user, Model model) {
        userService.registerUser(user);
        model.addAttribute("message", "User Registered Successfully!");
        return "login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
        UserEntity user = userService.loginUser(email, password);
        if (user != null) {
            session.setAttribute("loggedInUser", user);
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid Email or Password");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
