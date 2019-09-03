package com.haut.promotion.controller;

import com.haut.promotion.conf.DBRedis;
import com.haut.promotion.domain.Goods;
import com.haut.promotion.dto.FrontPromotionDto;
import com.haut.promotion.dto.GoodsInfosDto;
import com.haut.promotion.httpclient.HttpClientUtils;
import com.haut.promotion.service.FrontPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class FrontPromotionController {

    @Autowired
    DBRedis dbRedis;

    @Autowired
    FrontPromotionService frontPromotionService;

    @PostMapping("promotion_rule") //url命名采用蛇形命名法
    public String getPromotionRule(String id,FrontPromotionDto frontPromotionDto){
        dbRedis.set(id,frontPromotionDto);
        System.out.println(frontPromotionDto.getPromotionplatfrom());
        return "selectGoods";
    }

    @GetMapping("goods_infos")
    @ResponseBody
    public List<GoodsInfosDto> selGoodsInfo(String businessid){
        Goods goods = new Goods();
        goods.setBusinessid(Integer.parseInt(businessid));
        List<GoodsInfosDto> goodsInfosDtos = frontPromotionService.selGoodsInfo(goods);
        return goodsInfosDtos;
    }

    @PostMapping("ins_promotion")
    public void insPromotion(){


    }

    @DeleteMapping("del_promotion")
    public void delPromotion(){

    }

    @PutMapping("upd_promotion")
    public void updPromotion(){

    }


}
