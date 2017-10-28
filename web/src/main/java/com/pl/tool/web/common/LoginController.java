/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.tool.web.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户登陆
 *
 * @author george.mo
 * @version $Id: LoginController.java, v 0.1 2017/10/28 下午11:09 george.mo Exp $
 */
@Controller
@RequestMapping("login.html")
public class LoginController {


    /**
     * 页面初始化
     *
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        return "";
    }
}
