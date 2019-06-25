package com.myapp.core;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiApplication.class, args);
    }

}
