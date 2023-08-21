package com.atbilibili.ssm.mapper;

import com.atbilibili.ssm.bean.user;
import org.apache.ibatis.annotations.Param;



public interface userMapper {

    public user getUser(@Param("id") Integer id);
}
