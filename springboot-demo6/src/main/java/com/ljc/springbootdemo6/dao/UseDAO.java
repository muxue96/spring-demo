package com.ljc.springbootdemo6.dao;


import com.ljc.springbootdemo6.beans.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UseDAO {

    /*根据id查询用户*/
    @Select("select * from t_user where id=#{id}")
    public User getById(Integer id);

    /*添加用户*/
    @Insert("insert into t_user values (null,#{username},#{password})")
    public void addUser(User user);

    /*更新用户信息*/
    @Update("update t_user set usename=#{username}, password=#{password} where id=#{id}")
    public void updateUser(User user);

    /*删除用户*/
    @Delete("delete from t_user where id=#{id}")
    public void deleteUser(Integer id);
}
