package com.cy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserLoginDao {
    /**
     * @Author cy
     * @Date 2019/12/23 17:40
     * @Description //TODO
     * @Param 用户名、密码
     * @return 根据用户名密码返回符合条件的用户数量
     **/
    public int countUser(@Param("userName") String userName,@Param("password") String password);
}
