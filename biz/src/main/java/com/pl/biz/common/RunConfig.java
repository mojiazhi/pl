/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.biz.common;

/**
 * 运行配置
 *
 * @author george.mo
 * @version $Id: RunConfig.java, v 0.1 2017/10/28 下午11:28 george.mo Exp $
 */
public class RunConfig {

    /**
     * 运行模式（test/prod）
     */
    private static String runMode;
    /**
     * 系统请求地址
     */
    private static String appUrl;
    /**
     * 静态文件地址
     */
    private static String staticUrl;

    /**
     * Setter method for property <tt>appUrl</tt>.
     *
     * @param appUrl value to be assigned to property appUrl
     */
    protected static void setAppUrl(String appUrl) {
        RunConfig.appUrl = appUrl;
    }


    /**
     * Setter method for property <tt>staticUrl</tt>.
     *
     * @param staticUrl value to be assigned to property staticUrl
     */
    protected static void setStaticUrl(String staticUrl) {
        RunConfig.staticUrl = staticUrl;
    }

    /**
     * Setter method for property <tt>runMode</tt>.
     *
     * @param runMode value to be assigned to property runMode
     */
    protected static void setRunMode(String runMode) {
        if (!("test".equalsIgnoreCase(runMode) || "prod".equalsIgnoreCase(runMode))) {
            throw new RuntimeException("System initialize error");
        }
        RunConfig.runMode = runMode;
    }

    /**
     * Getter method for property <tt>appUrl</tt>.
     *
     * @return property value of appUrl
     */
    public static String getAppUrl() {
        return appUrl;
    }


    /**
     * Getter method for property <tt>runMode</tt>.
     *
     * @return property value of runMode
     */
    public static String getRunMode() {
        return runMode;
    }

    /**
     * Getter method for property <tt>staticUrl</tt>.
     *
     * @return property value of staticUrl
     */
    public static String getStaticUrl() {
        return staticUrl;
    }


    /**
     * 当前运行模式是否为生产模式
     *
     * @return
     */
    public static boolean hasProdMode() {
        return "prod".equalsIgnoreCase(runMode);
    }

}
