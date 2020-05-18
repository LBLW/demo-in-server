package com.demo.controller;

import com.demo.redis.RedisLinkTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author wangzezhou
 * @create 2020-05-15 1:44 AM
 * @desc redis实例操作的入口
 *
 **/
@Controller
@RequestMapping("/redis")
public class RedisController {

    @Resource
    RedisLinkTestService redisLinkTestService;

    @RequestMapping("/test-link")
    public boolean testRedisLink() {

        return redisLinkTestService.testLink();
    }
}
