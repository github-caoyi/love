package com.cy.controller;

import com.cy.entity.CustInfo;
import com.cy.service.CustInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustInfoAction {
    private static final Logger logger = LoggerFactory.getLogger(CustInfoAction.class);
    private Map<String, Object> result;
    @Autowired
    private CustInfoService custInfoService;

    /*
    * 客户信息查询
    * */
    @ResponseBody
    @RequestMapping("/ActionfoLis_queryCustInt")
    public Map<String,Object> queryCustInfoList(@RequestBody Map<String,Object> paraMap){
        result = new HashMap<>();
        try{
            logger.info("#出行人信息列表--------");
            String custNum=paraMap.get("custNum").toString();
            logger.info("custNum="+custNum);
            List<CustInfo> custInfoList = custInfoService.queryCustInfoList(custNum);
            result.put("custInfoList",custInfoList);
        }catch (Exception e){
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        return result;
    }
}
