/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.tool.web.base;

import java.util.List;

/**
 * 基础ajax请求返回
 *
 * @author george.mo
 * @version $Id: BaseAjaxResponse.java, v 0.1 2017/10/29 下午10:34 george.mo Exp $
 */
public class BaseAjaxResponse<T> {
    private String respCode = "200";
    private boolean success;
    private String errorCode;
    private String errorMsg;
    private T data;
    private List<T> listDate;

    /**
     * Getter method for property <tt>respCode</tt>
     *
     * @return property value of respCode
     */

    public String getRespCode() {
        return respCode;
    }

    /**
     * Setter method for property <tt>respCode</tt>.
     *
     * @param respCode value to be assigned to property respCode
     */
    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    /**
     * Getter method for property <tt>errorCode</tt>
     *
     * @return property value of errorCode
     */

    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>errorMsg</tt>
     *
     * @return property value of errorMsg
     */

    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Setter method for property <tt>errorMsg</tt>.
     *
     * @param errorMsg value to be assigned to property errorMsg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * Getter method for property <tt>data</tt>
     *
     * @return property value of data
     */

    public T getData() {
        return data;
    }

    /**
     * Setter method for property <tt>data</tt>.
     *
     * @param data value to be assigned to property data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Getter method for property <tt>listDate</tt>
     *
     * @return property value of listDate
     */

    public List<T> getListDate() {
        return listDate;
    }

    /**
     * Setter method for property <tt>listDate</tt>.
     *
     * @param listDate value to be assigned to property listDate
     */
    public void setListDate(List<T> listDate) {
        this.listDate = listDate;
    }
}
