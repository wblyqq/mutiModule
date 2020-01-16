package com.example.dao.mapper;

import com.example.dao.entity.UserDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    @Select("select * from t_user where user_id = #{id}")
    UserDo selectById(String id);
}
