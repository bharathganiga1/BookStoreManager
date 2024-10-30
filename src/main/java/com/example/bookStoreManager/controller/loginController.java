package com.example.bookStoreManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {

    @GetMapping("/")
    public String home(){
        System.out.println("HomePage Loading");
        return "home";
    }

    @GetMapping("/login")
    public String showLoginPage(){
        System.out.println("Login Loading");
        return "login";
    }
    @PostMapping("/login")
    public String loginUser(String email, String password) {
        // Logic to authenticate the user
        return "redirect:/home";
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        System.out.println("signup Loading");
        return "signup";
    }

    @PostMapping("/signup")
    public String signupUser(String name, String email, String password) {
        // Logic to register the user
        return "redirect:/login";
    }
}
