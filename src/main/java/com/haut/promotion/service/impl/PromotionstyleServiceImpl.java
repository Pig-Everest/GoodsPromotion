package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.PromotionstyleMapper;
import com.haut.promotion.service.PromotionstyleService;
@Service
public class PromotionstyleServiceImpl implements PromotionstyleService{

    @Resource
    private PromotionstyleMapper promotionstyleMapper;

}
