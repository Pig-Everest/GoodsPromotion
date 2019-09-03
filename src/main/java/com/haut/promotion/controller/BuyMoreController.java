package com.haut.promotion.controller;

import com.haut.promotion.domain.BuymorePromotion;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.Timemanager;
import com.haut.promotion.service.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
    @Resource
    BuymorePromotionService buymorePromotionService;

    /**
     * 提交多买促销活动
     *
     * @param promotion
     * @return
     */
    @RequestMapping(value = "/insertBuyMore")
    public String insertBuyMore(Promotion promotion, BuymorePromotion buymorePromotion, Timemanager timemanager, int require1[], int discount1[]) {
        promotion.setPromotionstyle(7);
        Integer proid = promotionService.insertBuyMorePromotion(promotion);
        buymorePromotion.setPromotionid(proid);
        timemanager.setPromotionid(proid);

        for (int i = 0; i < require1.length; i++) {
            buymorePromotion.setRequire(require1[i]);
            buymorePromotion.setDiscount(discount1[i]);
            buymorePromotion.setId(null);
            timemanager.setId(null);
            buymorePromotionService.insertBuyMore(buymorePromotion);
            timemanager.setBuymoreid(buymorePromotion.getId());
            timemanagerService.insertTimeManager(timemanager);
        }
        return "ok";
    }

    @RequestMapping("/Testn")
    public List<Promotion> Testn() {
        Promotion promotion=new Promotion();
        return promotionService.selectBuymorePromotion(promotion);
    }
}
