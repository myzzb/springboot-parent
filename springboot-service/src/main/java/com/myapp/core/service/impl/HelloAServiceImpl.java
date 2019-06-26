package com.myapp.core.service.impl;

import com.myapp.core.mapper.IUserDao;
import com.myapp.core.service.HelloAService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :zzb
 * @createDate :2019/6/25 15:55
 * @desc :
 */
@Service("helloAService")
public class HelloAServiceImpl implements HelloAService {

    @Resource
    private IUserDao userDao;

    @Override
    public String sayHello(String name) {
        System.out.println("----------------------002-----------------执行BIZ层service--------------------------------");
        userDao.addUser("zzb0001","zzb0001");
        return name+"-------Service";
    }
}
