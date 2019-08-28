package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.FrontPromotionMapper;
import com.haut.promotion.service.FrontPromotionService;
@Service
public class FrontPromotionServiceImpl implements FrontPromotionService{

    @Resource
    private FrontPromotionMapper frontPromotionMapper;

}
