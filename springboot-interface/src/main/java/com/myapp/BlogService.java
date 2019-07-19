package com.myapp;

import com.myapp.core.model.pojo.Blog;

/**
 * @author :zzb
 * @createDate :2019/7/19 10:32
 * @desc :
 */
public interface BlogService {
    int insert(Blog record);
    /**
     * @author zzb
     * @createDate 2019-07-19 16:20
     * @desc 
     * @param  * @param null
     * @return 
     */
    Integer count();
    
}
