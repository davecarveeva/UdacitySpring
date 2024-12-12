package com.udacity.jdnd.javacourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Instant;

@Controller
public class HomeController {
    // Declare the boolean value to track the first visit status
    public boolean firstVisit = true;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("firstVisit", firstVisit);
        return "home";
    }

    @PostMapping("/switchfirstvisit")
    public String switchFirstVisit() {
        // Switch the firstVisit value
        firstVisit = false;
        return "redirect:/home";
        // Redirect back to the home page to see the updated value
    }

}
