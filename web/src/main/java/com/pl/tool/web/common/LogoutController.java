/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.tool.web.common;

import com.pl.tool.web.base.BaseAjaxResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 用户登出
 *
 * @author george.mo
 * @version $Id: LogoutController.java, v 0.1 2017/10/29 下午5:53 george.mo Exp $
 */
@Controller
@RequestMapping("/logout.html")
public class LogoutController {

    /**
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public BaseAjaxResponse<Void> doPost() {

        return null;
    }
}
