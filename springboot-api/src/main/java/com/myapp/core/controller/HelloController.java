package com.myapp.core.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myapp.HelloService;
import com.myapp.core.bean.TestConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :zzb
 * @createDate :2019/6/25 16:04
 * @desc :
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("------------------001---------------------执行api--------------------------------");
        String hello = helloService.sayHello("Hello world "+TestConfig.getTestName());
        return hello;
    }
}
