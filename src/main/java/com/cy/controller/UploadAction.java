package com.cy.controller;


import com.cy.system.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cy
 * @Date 2020/1/7 14:22
 * @Description 图片上传和下载
 * @Version 1.0
 **/
@Controller
@RequestMapping("/upload")
public class UploadAction {
    private static final Logger logger = LoggerFactory.getLogger(UploadAction.class);

    @RequestMapping("/images")
    public Result upLoadImages(){
        Result result = null;
        try{

        }catch (Exception e){

        }

        return result;
    }
}
