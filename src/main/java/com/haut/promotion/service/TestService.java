package com.haut.promotion.service;

import com.github.pagehelper.PageInfo;

public interface TestService{
    public PageInfo test(int page);
    public String testRedis(String key,String value);
}
