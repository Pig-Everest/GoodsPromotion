package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.BuymorePromotionMapper;
import com.haut.promotion.service.BuymorePromotionService;
@Service
public class BuymorePromotionServiceImpl implements BuymorePromotionService{

    @Resource
    private BuymorePromotionMapper buymorePromotionMapper;

}
