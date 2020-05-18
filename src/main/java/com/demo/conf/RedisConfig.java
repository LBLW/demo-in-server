package com.demo.conf;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzezhou
 * @create 2020-05-13 6:59 PM
 * @desc redis 配置
 **/
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            StringBuilder builder = new StringBuilder();
            builder.append(target.getClass().getName());
            builder.append(method.getName());
            for (Object object : params) {
                builder.append(object.toString());
            }

            return builder.toString();
        };
    }

}
