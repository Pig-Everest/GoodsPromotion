package com.haut.promotion.redisConf;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

//dao组件注解
@Repository
public class DBRedis {
    @Resource(name = "redisTemplate")
    private RedisTemplate redisTemplate;

    /**
     *
     * @param key
     * @param value
     */
    public void set(String key,Object value){
        redisTemplate.opsForValue().set(key,value);
    }

    /**
     *
     * @param key
     * @param value
     * @param time
     * @param timeUnit 枚举类型
     */
    public void set(String key, Object value, long time, TimeUnit timeUnit){
        redisTemplate.opsForValue().set(key,value,time,timeUnit);
    }
    /**
     *  返回String类型
     * @param key
     * @return String
     */
    public String get(String key){
        return redisTemplate.opsForValue().get(key).toString();
    }

    /**
     *  返回泛型类型
     * @param key
     * @param <T>对象类型
     * @return
     */
    public <T>T get1(String key){
        return (T)redisTemplate.opsForValue().get(key).toString();
    }


}
