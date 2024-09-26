package com.ljc.springbootdemo5.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljc.springbootdemo5.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
