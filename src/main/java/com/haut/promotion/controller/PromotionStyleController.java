package com.haut.promotion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PromotionStyleController {
/*
* 根据不同促销类型跳转到不同页面*/
    @RequestMapping(value = "/choosePromotionStyle")
    public String choosePromotionStyle(int style){
        switch (style)
        {
            case 1:
                return "";
            case  2:
                return "";
            case 3:
                return "";
            case  4:
                return "suitPromotion";
            case 5:
                return "";
            case  6:
                return "";
            case 7:
                return "";
                default:
                    return "";
        }


    }
}
