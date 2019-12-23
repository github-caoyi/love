package com.cy.service;

import com.cy.entity.CustInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustInfoService {
    /*
     *查询客户信息列表
     * */
    List<CustInfo> queryCustInfoList(String custNum);
}
