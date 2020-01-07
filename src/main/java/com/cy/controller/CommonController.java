package com.cy.controller;

import com.cy.system.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;


/**
 * @Author cy
 * @Date 2020/1/7 15:37
 * @Description 通用请求处理：文件上传
 * @Version 1.0
 **/
public class CommonController {
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    /**
     * @return
     * @Author cy
     * @Date 2020/1/7 15:41
     * @Description 通用上传请求
     * @Param
     **/
    @PostMapping("/common/upload")
    public Result uploadFile(MultipartFile file) throws Exception {
        Result result = null;
        //上传文件路径 暂时写死
        String filePath = "H:/upload";
        //上传并返回新文件路径
        String fileName =  "hh.txt";


        return result;
    }


}
