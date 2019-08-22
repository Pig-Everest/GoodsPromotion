package com.haut.promotion.redisConf;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
}
