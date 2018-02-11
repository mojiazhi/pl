package com.pl.dal.dataobject;

import com.kili.common.core.dao.dataobject.BaseDO;

/**
 * 用户do
 * Created by mo on 2017/10/30.
 */
public class UserDO extends BaseDO<String> {

    private String loginName;
    private String password;
    private String userName;
    private String userStatus;
    private String empNo;

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
}
