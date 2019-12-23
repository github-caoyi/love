package com.cy.service.impl;

import com.cy.dao.CustInfoDao;
import com.cy.entity.CustInfo;
import com.cy.service.CustInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustInfoServiceImpl implements CustInfoService {
    @Resource
    private CustInfoDao custInfoDao;
    @Override
    public List<CustInfo> queryCustInfoList(String custNum) {
       return custInfoDao.queryCustInfoList(custNum);
    }
}
