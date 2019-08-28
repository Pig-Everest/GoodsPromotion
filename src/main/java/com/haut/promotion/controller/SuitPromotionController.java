package com.haut.promotion.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.github.pagehelper.PageHelper;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.Suit;
import com.haut.promotion.domain.SuitPromotion;
import com.haut.promotion.domain.Timemanager;
import com.haut.promotion.service.PromotionService;
import com.haut.promotion.service.SuitPromotionService;
import com.haut.promotion.service.SuitService;
import com.haut.promotion.service.TimemanagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SuitPromotionController {
    @Resource(name = "suitPromotionServiceImpl")
    SuitPromotionService suitPromotionService;
@Resource(name = "promotionServiceImpl")
    PromotionService promotionService;
@Resource(name = "suitServiceImpl")
    SuitService suitService;
    @Resource
    TimemanagerService timemanagerService;

    @ResponseBody
   @RequestMapping(value = "/insertPromotion")
    public void insertPromotion(SuitPromotion suitPromotion,Promotion promotion,Timemanager timemanager,Integer[] goods){


       int promotionid= promotionService.insertPromotion(promotion);

        suitPromotion.setPromotionid(promotionid);
        String str="";
        for (Integer s:goods
        ) {
            str+=s;
            str+=",";
        }
        suitPromotion.setGoodsids(str);

       int suitPromotionid= suitPromotionService.insert(suitPromotion);

        for (Integer s:goods
             ) {
            Suit suit=new Suit();
suit.setGoodid(s);
suit.setSuitid(suitPromotionid);
            suitService.insert(suit);
        }
        timemanagerService.insertTimeManager(timemanager);




    }
}
