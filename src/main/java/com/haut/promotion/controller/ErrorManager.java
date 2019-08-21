package com.haut.promotion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorManager {

    @RequestMapping(value = "errorManager")
    public ModelAndView errorManager(ModelAndView modelAndView,String code,String message){
        modelAndView.setViewName("errorInfo");
        modelAndView.addObject("code",code);
        modelAndView.addObject("message",message);
        return modelAndView;
    }
}
