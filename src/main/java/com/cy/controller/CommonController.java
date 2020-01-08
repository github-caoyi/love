package com.cy.controller;

import com.cy.system.file.FileUploadUtils;
import com.cy.system.util.Constans;
import com.cy.system.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * @Author cy
 * @Date 2020/1/7 15:37
 * @Description 通用请求处理：文件上传
 * @Version 1.0
 **/
@RestController
public class CommonController {
    private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

    /**
     * @return
     * @Author cy
     * @Date 2020/1/7 15:41
     * @Description 通用文件上传请求
     * @Param
     **/
    @PostMapping("/common/upload")
    public Result uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        Result result = null;
        //上传文件路径 暂时写死
        try {
            String filePath = "H:/upload";
            //上传并返回新文件路径
            String fileName = FileUploadUtils.upload(filePath,file);
            result = new Result(Constans.CODE_SUCCESS,Constans.MSG_SUCCESS,"上传成功："+fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;
    }


}
