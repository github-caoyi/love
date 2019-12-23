package com.cy.service.impl;

import com.cy.dao.UserLoginDao;
import com.cy.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Resource
    private UserLoginDao userLoginDao;

    @Override
    public boolean loginIn(String userName, String password) {
        int countUser = userLoginDao.countUser(userName,password);
        if (countUser <1){
            return false;
        }else{
            return true;
        }
        //return false;
    }
}
