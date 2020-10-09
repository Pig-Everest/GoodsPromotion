package com.haut.promotion.service;

import com.haut.promotion.domain.Promotion;

import java.util.List;
import java.util.Map;

public interface PromotionService {

        /**
         * 第一步添加促销表
         *
         * @param promotion
         * @return
         */
        Integer insertPromotion(Promotion promotion);

        /**
         * 添加多买促销表
         *
         * @param promotion
         * @return
         */
        Integer insertBuyMorePromotion(Promotion promotion);

        /*

         * 添加促销，返回主键*/
        Integer isertPromotion(Promotion promotion);

        /**
         * 通过促销id查询促销表信息 封装成map
         *
         * @param promotionId 促销id
         * @return 促销表
         */
        Map<String, Object> selectPromotionById(Integer promotionId);


        /**
         * 通过促销信息组合查询查询促销表信息 封装成对象
         *
         * @param promotionId 促销id
         * @return 促销信息
         */
        Promotion selectPromotion(Integer promotionId);

        /**
         * 通过promotionid来查询该订单的所有信息
         *
         * @param promotion
         * @return
         */
        public List<Promotion> selectBuymorePromotion(Promotion promotion);

        /**
         * 通过优惠券类型查询促销表信息
         *
         * @return 促销ids
         */
        List<Integer> selectPromotionByCouponType();

        int addPromotion(Promotion p);

}



