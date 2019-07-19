package com.myapp.core.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.myapp.BlogService;
import com.myapp.core.model.pojo.Blog;
import com.myapp.core.service.BlogAService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author :zzb
 * @createDate :2019/7/19 10:38
 * @desc :
 */
@Component
@Service
public class BlogServiceImpl implements BlogService {

    @Resource
    private BlogAService blogAService;

    @Override
    public int insert(Blog record) {
        return blogAService.insert(record);
    }

    @Override
    public Integer count() {
        return blogAService.count();
    }
}
