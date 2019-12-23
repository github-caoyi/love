package com.cy.service;

import org.springframework.stereotype.Service;

@Service
public interface UserLoginService {

    /**
     * @Author cy
     * @Date 2019/12/23 17:25
     * @Description 用户登录//TODO
     * @Param
     * @return
     **/
    public boolean loginIn(String userName,String password);
}
