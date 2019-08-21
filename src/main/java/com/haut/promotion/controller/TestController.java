package com.haut.promotion.controller;

import com.haut.promotion.restful.MyResponseEntity;
import com.haut.promotion.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping(value = "test")
    public MyResponseEntity test(int page){
        return new MyResponseEntity(HttpStatus.OK,"test",testService.test(page));
    }
}
