/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.biz.common;

import org.springframework.beans.factory.InitializingBean;

/**
 * 配置文件初始化
 *
 * @author george.mo
 * @version $Id: RunConfigInitialize.java, v 0.1 2017/10/29 上午1:35 george.mo Exp $
 */
public class RunConfigInitialize extends RunConfig implements InitializingBean {

    private String run_mode;
    private String app_url;
    private String static_url;

    @Override
    public void afterPropertiesSet() throws Exception {
        super.setAppUrl(app_url);
        super.setStaticUrl(static_url);
        super.setRunMode(run_mode);
    }


    /**
     * Setter method for property <tt>run_mode</tt>.
     *
     * @param run_mode value to be assigned to property run_mode
     */
    public void setRun_mode(String run_mode) {
        this.run_mode = run_mode;
    }

    /**
     * Setter method for property <tt>app_url</tt>.
     *
     * @param app_url value to be assigned to property app_url
     */
    public void setApp_url(String app_url) {
        this.app_url = app_url;
    }

    /**
     * Setter method for property <tt>static_url</tt>.
     *
     * @param static_url value to be assigned to property static_url
     */
    public void setStatic_url(String static_url) {
        this.static_url = static_url;
    }
}
