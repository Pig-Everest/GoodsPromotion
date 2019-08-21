package com.haut.promotion.controller;

import com.haut.promotion.exception.CustomException;
import com.haut.promotion.restful.MyResponseEntity;
import com.haut.promotion.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping(value = "test")
    public MyResponseEntity test(int page){
        if (page==0){
            throw new CustomException(401,"page错误");
        }
        return new MyResponseEntity(HttpStatus.OK,"test",testService.test(page));
    }
}

