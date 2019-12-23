package com.cy.dao;

import com.cy.entity.CustInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CustInfoDao {
    /*
    *查询客户信息列表
    * */
    List<CustInfo> queryCustInfoList(@Param("custNum") String custNum);
    List<Map<String,Object>>  query();
}
