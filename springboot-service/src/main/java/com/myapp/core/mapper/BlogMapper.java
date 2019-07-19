package com.myapp.core.mapper;
import org.apache.ibatis.annotations.Param;

import com.myapp.core.model.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);

    Integer count();



}