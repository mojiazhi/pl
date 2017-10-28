/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.tool.web.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页
 *
 * @author george.mo
 * @version $Id: IndexController.java, v 0.1 2017/10/29 上午1:55 george.mo Exp $
 */
@Controller
@RequestMapping("index.html")
public class IndexController {

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String doGet() {
        return "common/index";
    }
}
