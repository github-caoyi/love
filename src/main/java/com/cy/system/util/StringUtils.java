package com.cy.system.util;

/**
 * @Author cy
 * @Date 2020/1/7 16:56
 * @Description字符串工具类
 * @Version 1.0
 **/
public class StringUtils {
    /** 空字符串 */
    private static final String NULLSTR = "";

    /**
     * * 判断一个对象是否为空
     *
     * @param object Object
     * @return true：为空 false：非空
     */
    public static boolean isNull(Object object)
    {
        return object == null;
    }

    /**
     * * 判断一个字符串是否为空串
     *
     * @param str String
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(String str)
    {
        return isNull(str) || NULLSTR.equals(str.trim());
    }
}
