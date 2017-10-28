/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.tool.web.common;

import com.pl.tool.web.common.impl.MyCaptchaEngineImpl;
import io.leopard.web.captcha.CaptchaView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 验证码
 *
 * @author george.mo
 * @version $Id: CaptchaController.java, v 0.1 2017/10/28 下午11:37 george.mo Exp $
 */
@Controller
@RequestMapping("/captcha.html")
public class CaptchaController {

    /**
     * 验证码
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public CaptchaView image() {
        return new CaptchaView(160, 60, MyCaptchaEngineImpl.class);
    }


}
