package com.lovers.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("hello")
    public String hello(Model model){
        String name="wangzefeng";
        model.addAttribute("name",name);
        return "hello";
    }

}
