package com.cy.entity;

import java.sql.Timestamp;

/**
 * 客户信息
 *
 * @author jilin
 */
public class CustInfo {
    private String custNum; // 客户编号
    private String custAlias; // 客户别名
    private String custName; // 姓名
    private int custSex; // 性别;0-未知；1-男；2-女
    private String custBirth; // 出生日期
    private String custPhone; // 手机号
    private String custCertnum; // 身份证号
    private String custPassport; // 护照编号
    private Timestamp custRegiDate; // 注册日期
    private String custCerttype;//证件类型01身份证02港澳通行证03军官证

    public String getCustNum() {
        return custNum;
    }

    public void setCustNum(String custNum) {
        this.custNum = custNum;
    }

    public String getCustAlias() {
        return custAlias;
    }

    public void setCustAlias(String custAlias) {
        this.custAlias = custAlias;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustSex() {
        return custSex;
    }

    public void setCustSex(int custSex) {
        this.custSex = custSex;
    }

    public String getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(String custBirth) {
        this.custBirth = custBirth;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustPassport() {
        return custPassport;
    }

    public void setCustPassport(String custPassport) {
        this.custPassport = custPassport;
    }

    public Timestamp getCustRegiDate() {
        return custRegiDate;
    }

    public void setCustRegiDate(Timestamp custRegiDate) {
        this.custRegiDate = custRegiDate;
    }

    public String getCustCertnum() {
        return custCertnum;
    }

    public void setCustCertnum(String custCertnum) {
        this.custCertnum = custCertnum;
    }

    public String getCustCerttype() {
        return custCerttype;
    }

    public void setCustCerttype(String custCerttype) {
        this.custCerttype = custCerttype;
    }
}
