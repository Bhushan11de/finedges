package com.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/api/")
    public String home() {
        return "Portfolio Tracker API is running! Access /api/stocks for stock endpoints";
    }
}
