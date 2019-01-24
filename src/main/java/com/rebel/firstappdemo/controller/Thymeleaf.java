package com.rebel.firstappdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class Thymeleaf {

    //查一些数据显示在页面上
    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        map.put("hey","红帆你！");
        map.put("users", Arrays.asList("Time","Application","Awesome"));
        return  "success";
    }
}
