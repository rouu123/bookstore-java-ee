package com.example.bookstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import com.example.bookstore.models.User;

@Controller
public class UserController {

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String submitSignUpForm(@ModelAttribute User user) {
        // Logic to save the user to the database
        return "redirect:/login";  // Redirect to login page after signup
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String submitLoginForm(@ModelAttribute User user, Model model) {
        // Replace with real authentication logic (e.g., querying the DB)
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return "redirect:/books";  // Assuming this is the main page after login
        }

        model.addAttribute("loginError", true);
        return "login";  // Stay on the login page and show an error
    }
}
