package com.myapp.core.service.impl;

import com.myapp.core.model.pojo.Blog;
import com.myapp.core.service.BlogAService;
import org.springframework.stereotype.Service;

/**
 * @author :zzb
 * @createDate :2020/7/5 10:06 下午
 * @desc :
 */
@Service("blogAService")
public class BlogAServiceImpl implements BlogAService {

    @Override
    public int insert(Blog record) {
        return 0;
    }

    @Override
    public Integer count() {
        return null;
    }
}
