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
    public MyResponseEntity createCoupon(Promotion promotion,Coupon coupon,String startTime,String endTime){
        String time1=startTime.substring(0,9)+" "+startTime.substring(10,11)+":"+startTime.substring(15,16);
        String time2=endTime.substring(0,9)+" "+endTime.substring(10,11)+":"+endTime.substring(15,16);
        Integer promotionId = promotionService.insertPromotion(promotion);
        coupon.setPromotionid(promotionId);
        Integer couponId = couponService.insertCoupon(coupon);
        timemanagerService.insertTimeManager(time1,time2,promotionId,couponId);
        return  new MyResponseEntity(HttpStatus.OK,"success",promotionId);
    }

    /**
     * 通过类型查询参与该类型的商品信息
     */
}
