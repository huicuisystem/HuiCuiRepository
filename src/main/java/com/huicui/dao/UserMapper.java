package com.huicui.dao;

import com.huicui.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    TbUser chenkUsername(@Param("userName") String userName);
}

