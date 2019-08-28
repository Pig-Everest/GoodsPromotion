package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Promotionstyle;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.PromotionstyleMapper;
import com.haut.promotion.service.PromotionstyleService;

@Service
public class PromotionstyleServiceImpl implements PromotionstyleService {

    @Resource
    private PromotionstyleMapper promotionstyleMapper;

    /**
     * 第二部添加促销类型表
     *
     * @param promotionId
     */
    @Override
    public void insertPromotionStyle(Integer promotionId) {
        Promotionstyle promotionstyle = new Promotionstyle();
        promotionstyle.setStylename("优惠券");
        promotionstyle.setPromotionid(promotionId);
        promotionstyleMapper.insertSelective(promotionstyle);
    }
}



