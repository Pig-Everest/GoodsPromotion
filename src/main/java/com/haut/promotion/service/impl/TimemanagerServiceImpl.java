package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.TimemanagerMapper;
import com.haut.promotion.service.TimemanagerService;
@Service
public class TimemanagerServiceImpl implements TimemanagerService{

    @Resource
    private TimemanagerMapper timemanagerMapper;

    @Override
    public int addTimeByGiftPromotion() {
         return 0;
    }
}
