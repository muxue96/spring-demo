package com.ljc.springbootdemo4.mapper;


import com.ljc.springbootdemo4.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from t_user where id = #{id}")
    public User getById(Integer id);
}
