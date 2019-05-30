package com.rebel.firstappdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping(value = "/view-products")
    public String viewProduct(){
        return "view-products";
    }

    @RequestMapping(value = "/add-products")
    public String addProducts(){
        return "add-products";
    }

    @RequestMapping(value = "/locale")
    public String local(){
        return "locale";
    }
}
