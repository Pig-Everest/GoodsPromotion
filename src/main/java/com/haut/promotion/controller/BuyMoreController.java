package com.haut.promotion.controller;

import com.haut.promotion.domain.Promotion;
import com.haut.promotion.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BuyMoreController {
    @Resource
    CouponService couponService;
    @Resource
    CoupontypeService coupontypeService;
    @Resource
    GoodsService goodsService;
    @Resource
    PromotionService promotionService;
    @Resource
    PromotionstyleService promotionstyleService;
    @Resource
    TimemanagerService timemanagerService;

    @RequestMapping(value="/insertBuyMore")
    public String insertBuyMore(Promotion promotion){
        System.out.println(promotion.getPromotionchannels()+promotion.getPromotionplatfrom());
        return "ok";
    }
}
