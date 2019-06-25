package com.myapp.core.service.impl;

import com.myapp.core.service.HelloAService;
import org.springframework.stereotype.Service;

/**
 * @author :zzb
 * @createDate :2019/6/25 15:55
 * @desc :
 */
@Service("helloAService")
public class HelloAServiceImpl implements HelloAService {
    @Override
    public String sayHello(String name) {
        System.out.println("----------------------002-----------------执行BIZ层service--------------------------------");
        return name+"-------Service";
    }
}
