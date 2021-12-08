package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnimalsController {
    @GetMapping("/")
    public ModelAndView testjs(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
