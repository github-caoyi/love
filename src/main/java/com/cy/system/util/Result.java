package com.cy.system.util;

import java.util.HashMap;

/**
 * @Author cy
 * @Date 2020/1/6 15:31
 * @Description
 * @Version 1.0
 **/
public class Result {
    private int code;
    private String content;
    private Object data;

    /**
     * @Author cy
     * @Date 2020/1/6 15:58
     * @Description 响应结果的无参构造器 响应码默认为“0”，响应内容默认为“交易成功”，响应数据默认为“null”
     * @Param
     * @return
     **/
    public Result() {
        this.code = Constans.CODE_SUCCESS;
        this.content = Constans.MSG_SUCCESS;
        this.data = null;
    }

    /**
     * @Author cy
     * @Date 2020/1/6 16:02
     * @Description 响应结果的有参构造器
     * @Param 响应码，响应内容，响应数据
     * @return
     **/
    public Result(int code, String content, Object data) {
        this.code = code;
        this.content = content;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
