package com.demo.redis.impl;

import com.demo.redis.RedisLinkTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author wangzezhou
 * @create 2020-05-15 1:48 AM
 * @desc 测试redis连接的服务
 **/
@Service
public class RedisLinkTestServiceImpl implements RedisLinkTestService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public boolean testLink() {

        Set<String> keys = redisTemplate.keys("books*");

        return keys.isEmpty()?false:true;
    }
}
