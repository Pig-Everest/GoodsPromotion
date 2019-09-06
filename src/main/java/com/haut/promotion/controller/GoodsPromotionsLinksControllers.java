package com.haut.promotion.controller;

import com.haut.promotion.domain.Goods_Promotionlinks;
import com.haut.promotion.service.GoodsPromotionLinksService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class GoodsPromotionsLinksControllers {
    @Resource(name = "goodsPromotionServiceImpl")
    GoodsPromotionLinksService goodsPromotionLinksService;

    @ResponseBody
    @RequestMapping(value = "addgoodspromotionlinkstable")
    public String addGoodsPromotionLinksTable(List<Goods_Promotionlinks> goods_promotionlinks, Integer promotionid) {
       // List<Goods_Promotionlinks> goods_promotionlinks1 = new ArrayList<>();
        for (Goods_Promotionlinks goods_promotionlink1 : goods_promotionlinks) {
            goods_promotionlink1.setPromotionid(promotionid);
        }

        goodsPromotionLinksService.insertGoods(goods_promotionlinks);

        return "商品促销联系表添加成功";
    }
}
