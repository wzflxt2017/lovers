package com.lovers.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    public String hello(@RequestParam(name = "name")String name, ModelAndView modelAndView){
        modelAndView.addObject("name",name);
        return "hello";
    }

}
