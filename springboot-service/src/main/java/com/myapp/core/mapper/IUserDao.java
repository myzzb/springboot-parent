package com.myapp.core.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author :zzb
 * @createDate :2019/6/26 17:57
 * @desc :
 */
@Mapper
public interface IUserDao {

    int addUser(String name,String pwd);
}
