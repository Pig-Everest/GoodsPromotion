package com.haut.promotion.controller;

import com.haut.promotion.domain.Coupon;
import com.haut.promotion.domain.Goods;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.restful.MyResponseEntity;
import com.haut.promotion.service.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Resource
    CashCouponService cashCouponService;
    @Resource
    DiscountCouponService discountCouponService;
    @Resource
    FullCouponService fullCouponService;

    /**
     * 新增优惠券
     * @param coupon 选择优惠券信息
     * @param a 值a
     * @param b 值b
     * @return
     */
    @PostMapping("newCoupon")
    public MyResponseEntity newCoupon(Coupon coupon,String a,String b){
        String type = coupon.getCouponname();
        if (type.equals("现金券")){
            couponService.insertCoupon(coupon);
            cashCouponService.createCashCoupon(Integer.parseInt(a));;
        }else if (type.equals("折扣券")){
            couponService.insertCoupon(coupon);
            discountCouponService.createDiscountCouponService(Double.parseDouble(a));
        }else if (type.equals("满减券")){
            couponService.insertCoupon(coupon);
            fullCouponService.createFullCoupon(Integer.parseInt(a),Integer.parseInt(b));
        }else {
            return new MyResponseEntity(HttpStatus.OK,"new Error",233);
        }
        return new MyResponseEntity(HttpStatus.OK,"new success",233);
    }

    /**
     * 发布优惠券
     * @return
     */
    @PostMapping("createCoupon")
    public MyResponseEntity createCoupon(Promotion promotion,Coupon coupon,String startTime,String endTime){
        String time1=startTime.substring(0,10)+"T"+startTime.substring(10,12)+":"+startTime.substring(15,17);
        String time2=endTime.substring(0,9)+"T"+endTime.substring(10,12)+":"+endTime.substring(15,17);
        /*Integer promotionId = promotionService.insertPromotion(promotion);*/
        /*coupon.setPromotionid(promotionId);*/
        Integer couponId = couponService.insertCoupon(coupon);
        /*timemanagerService.insertTimeManager(time1,time2,promotionId,couponId);*/
        return  new MyResponseEntity(HttpStatus.OK,"success",233);
    }

    /**
     * 通过类型查询参与该类型的商品信息
     */
    @GetMapping(value = "selectGoodsByCoupon")
    public MyResponseEntity selectGoodsByCoupon(){
        //先查询type为8的promotion表，获取其promotionId
        List<Integer> ids = promotionService.selectPromotionByCouponType();
        //再通过promotionIds查询其相关的商品skuIds(重复使用方法)
        List<Integer> skuIds = goodsService.selectSkuIdsByPromotionIds(ids);
        return new MyResponseEntity(HttpStatus.OK,"skuIds查询成功",skuIds);
    }
}
