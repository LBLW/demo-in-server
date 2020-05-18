package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "file:${CONFIG_PATH}/redis.properties" )
public class DemoInServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoInServerApplication.class, args);
    }

}
