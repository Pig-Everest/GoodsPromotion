package com.haut.promotion.controller;

import com.haut.promotion.conf.DBRedis;
import com.haut.promotion.dto.FrontPromotionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontPromotionController {

    @Autowired
    DBRedis dbRedis;

    @PostMapping("getPromotionRule")
    @ResponseBody
    public String getPromotionRule(String id,FrontPromotionDto frontPromotionDto){
        System.out.println("FrontPromotionController.getPromotionRule");
        dbRedis.set(id,frontPromotionDto);
        return "selectGoods";
    }


}
