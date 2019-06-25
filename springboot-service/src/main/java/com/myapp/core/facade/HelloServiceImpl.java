package com.myapp.core.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.myapp.HelloService;
import com.myapp.core.service.HelloAService;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

/**
 * @author :zzb
 * @createDate :2019/6/25 15:39
 * @desc :
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private HelloAService helloAService;
    @Override
    public String sayHello(String name) {
        System.out.println("-------------001-----------------执行API层Service---------------------------");
        return helloAService.sayHello(name);
    }
}
