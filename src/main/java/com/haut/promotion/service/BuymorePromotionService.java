package com.haut.promotion.service;

import com.haut.promotion.domain.BuymorePromotion;

import java.util.Map;

public interface BuymorePromotionService {
 /**
  * 提交多买促销
  * @param buymorePromotion
  * @return
  */
 public Integer insertBuyMore(BuymorePromotion buymorePromotion);

 /**
  * 根据传入的promption类型的Map对象查询buymore表的数据，返回Map对象
  * @param map
  * @return
  */
 public Map<String,Object> selectBuyMore(Map<String,Object> map);
}

