package com.haut.promotion.controller;

import com.haut.promotion.domain.GiftPromotion;
import com.haut.promotion.service.GiftPromotionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@CrossOrigin
@Controller
public class Gift_PromotionController {
@Resource(name="giftPromotionServiceImpl")
GiftPromotionService giftPromotionService;
//注入goodsService

@ResponseBody
@RequestMapping(value="addgiftpromotion")
public String addGiftPromotion(String goodsIds,Integer  promotionid ){
    GiftPromotion giftPromotion=null;
    giftPromotion.setGiftids(goodsIds);
    giftPromotion.setPromotionid(promotionid);
    giftPromotionService.addGiftPromotion(giftPromotion);
    return "添加gift_Promotion表成功";
}

}
