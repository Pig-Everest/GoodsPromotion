package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.PromotionstateMapper;
import com.haut.promotion.service.PromotionstateService;
@Service
public class PromotionstateServiceImpl implements PromotionstateService{

    @Resource
    private PromotionstateMapper promotionstateMapper;

}
