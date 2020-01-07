package com.cy.controller;

import com.cy.service.UserLoginService;
import com.cy.system.util.Constans;
import com.cy.system.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


/**
 * @Author cy
 * @Date 2019/12/23 16:18
 * @Description 用户登陆
 * @Version 1.0
 **/
@Controller
@RequestMapping("/userlogin")
public class UserLoginAction {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginAction.class);
    private Result result ;
    @Autowired
    private UserLoginService userLoginService ;
    /**
     * @Author cy
     * @Date 2019/12/23 16:26
     * @Description 验证用户名密码是否正确//TODO
     * @Param 
     * @return 
     **/
    @RequestMapping("/loginin")
    @ResponseBody
    public Result loginIn(@RequestBody Map<String,Object> paraMap){
        Result result = null;
        try {
            logger.info("用户开始登录----------");
            String userName = paraMap.get("userName").toString();
            String password = paraMap.get("password").toString();
            logger.info("用户名："+userName);
            if(userName != null && !userName.isEmpty() && password != null && !password.isEmpty()){
                if (userLoginService.loginIn(userName,password)){
                    result = new Result(Constans.CODE_SUCCESS,Constans.MSG_SUCCESS,null);
                }
                else{
                    result = new Result(Constans.CODE_FAIL,Constans.MSG_FAIL,null);
                }
            }else{
                result = new Result(Constans.CODE_FAIL,Constans.MSG_FAIL,null);
            }
        } catch (Exception e) {
            result = new Result(Constans.CODE_FAIL,Constans.MSG_FAIL,null);
            logger.error("登陆出错："+e.getMessage());
        }
        return result;
    }
}
