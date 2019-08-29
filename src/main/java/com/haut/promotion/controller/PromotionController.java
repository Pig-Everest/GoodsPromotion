package com.haut.promotion.controller;

import com.haut.promotion.domain.Promotionstyle;
import com.haut.promotion.service.*;
import com.haut.promotion.service.PromotionstyleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class PromotionController {

    @Resource(name = "promotionstyleServiceImpl")
    PromotionstyleService promotionstyleService;
    @Resource
    PromotionService promotionService;
    @Resource
    GoodsService goodsService;
    @Resource
    CouponService couponService;

    @RequestMapping(value = "/selectAllPromotionStyle")
    @ResponseBody
    public List<Promotionstyle> selectAllPromotionStyle() {
        return promotionstyleService.selectAllPromotionStyle();
    }

    /**
     * 通过三个id查询所关联的促销信息
     *
     * @param sku_id 型号id
     * @param spu_id 商品id
     * @param id     店铺id
     * @return list中每个map对应一个活动信息
     */
    @GetMapping(value = "/selectPromotionById")
    @ResponseBody
    public List<Map<String, Object>> selectPromotionById(Integer sku_id, Integer spu_id, Integer id) {
        List<Integer> promotionIds = goodsService.selectGoodsByIds(sku_id,spu_id,id);
        List<Map<String,Object>> list = new ArrayList<>();
        for (Integer promotionId : promotionIds) {
            Map<String,Object> map = promotionService.selectPromotionById(promotionId);
            int type = (int)map.get("promotionStyle");
            if(type==1){
                map.put("promotionStyle","满减促销");
            }else if (type==3){
                map.put("promotionStyle","单品促销");
            }else if (type==4){
                map.put("promotionStyle","套装促销");
            }else if (type==5){
                map.put("promotionStyle","赠品促销");
            }else if (type==6){
                map.put("promotionStyle","满赠促销");
            }else if (type==7){
                map.put("promotionStyle","多买优惠");
            }else if (type==8){
                map.put("promotionStyle","定金促销");
            }else if (type==9){
                map.put("promotionStyle","优惠券");
                map = couponService.selectCouponByPromotionId(map);
            }
            list.add(map);
        }
        return list;
    }
}
