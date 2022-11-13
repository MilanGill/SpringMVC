package com.brunoyam.springmvcdemo.controller;

import com.brunoyam.springmvcdemo.service.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public String greeting(Model model, @RequestParam(name = "name", required = false
    ,defaultValue = " World") String name) {
        final String greeting = greetingService.greeting(name);
        model.addAttribute("greeting",greeting);
        return "greeting";
    }
}
