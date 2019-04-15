package com.seckill.service.impl;

import com.seckill.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisTemplateServiceImpl implements RedisTemplateService {

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public void saveString(String key,Object value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String findString(String key) {
        return redisTemplate.opsForValue().get(key,0,-1);
    }

    @Override
    public void saveList(String key, List list) {
        redisTemplate.opsForList().leftPush(key,list);
    }

    @Override
    public List findList(String key) {
        return redisTemplate.opsForList().range(key,0,-1);
    }

}
