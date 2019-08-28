package com.haut.promotion.controller;

import com.haut.promotion.domain.Coupon;
import com.haut.promotion.domain.Goods;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.restful.MyResponseEntity;
import com.haut.promotion.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CouponController {
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

    /**
     * 生成优惠券
     * @return
     */
    @PostMapping("createCoupon")
    public MyResponseEntity createCoupon(Promotion promotion,Coupon coupon, List<Goods> goodsInfo,String startTime,String endTime){
        Integer promotionId = promotionService.insertPromotion(promotion);
        promotionstyleService.insertPromotionStyle(promotionId);
        goodsService.insertGoods(goodsInfo);
        Integer couponId = couponService.insertCoupon(coupon);
        timemanagerService.insertTimeManager(startTime,endTime,couponId);
        return  new MyResponseEntity(HttpStatus.OK,"success","优惠券添加成功");
    }
}
