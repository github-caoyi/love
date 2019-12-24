package com.cy.controller;

import com.cy.service.UserLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author cy
 * @Date 2019/12/23 16:18
 * @Description 用户登陆
 * @Version 1.0
 **/
@Controller
public class UserLoginAction {
    private static final Logger logger = LoggerFactory.getLogger(UserLoginAction.class);
    @Autowired
    private UserLoginService userLoginService ;




    /**
     * @Author cy
     * @Date 2019/12/23 16:26
     * @Description 验证用户名密码是否正确//TODO
     * @Param 
     * @return 
     **/
    @RequestMapping("/action_loginin")
    @ResponseBody
    public Map<String,Object> loginIn(@RequestBody Map<String,Object> paraMap){
        Map<String,Object> result = new HashMap<>();
        try {
            logger.info("用户开始登录----------");
            String userName = paraMap.get("userName").toString();
            String password = paraMap.get("password").toString();
            logger.info("用户名："+userName);
            if(userName != null && !userName.isEmpty() && password != null && !password.isEmpty()){
                if (userLoginService.loginIn(userName,password)){
                    result.put("message","登陆成功!");
                }
                else{
                    result.put("message","登陆失败!");
                }
            }else{
                result.put("message","请输入用户名和密码!");
            }
        } catch (Exception e) {
            result.put("message","登陆出错!");
            e.printStackTrace();
        }
        return result;
    }
}
