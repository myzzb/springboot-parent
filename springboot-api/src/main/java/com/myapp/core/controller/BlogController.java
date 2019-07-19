package com.myapp.core.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myapp.BlogService;
import com.myapp.core.model.pojo.Blog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author :zzb
 * @createDate :2019/7/19 10:28
 * @desc :
 */
@RestController
public class BlogController {

    @Reference
    private BlogService blogService;

    @RequestMapping("/add")
    public String add() {
        System.out.println("------------------001---------------------执行api--------------------------------");
        Integer count = blogService.count()+1;
        Blog blog = new Blog();
        blog.setBid(count);
        blog.setName("zzb");
        blog.setPwd("zzb");
        Timestamp time = new Timestamp(Calendar.getInstance().getTimeInMillis());
        blog.setCreateTime(time);
        System.out.println(time+"===========时间------"+LocalDateTime.now());
        blogService.insert(blog);
        return "添加成功"+count;
    }
}
