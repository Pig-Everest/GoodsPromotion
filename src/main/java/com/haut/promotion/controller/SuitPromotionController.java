package com.haut.promotion.controller;

import com.github.pagehelper.PageHelper;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.SuitPromotion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuitPromotionController {

   @RequestMapping(value = "/insertPromotion")
    public void insertPromotion(SuitPromotion suitPromotion,Promotion promotion){

    }
}
