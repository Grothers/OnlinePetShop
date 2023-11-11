package com.onlinepetshop.onlinepetshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainProductController {

    @GetMapping("/")
    public String products(){
        return "products";


    }
}
