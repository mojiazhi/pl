/**
 * kilimall.com Inc.
 * Copyright (c) 2015-2017 All Rights Reserved.
 */
package com.pl.tool.web.common;

import com.kili.common.util.StringUtil;
import com.kili.common.web.session.OperationContext;
import com.kili.common.web.session.OperationPrincipal;
import com.kili.common.web.session.SecurityContext;
import com.kili.common.web.session.impl.SecurityContextImpl;
import com.pl.biz.common.RunConfig;
import com.pl.dal.dao.UserDAO;
import com.pl.dal.dataobject.UserDO;
import com.pl.tool.web.base.BaseAjaxResponse;
import io.leopard.web.captcha.CaptchaUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

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
     * userDAO
     */
    @Autowired
    private UserDAO userDAO;


    /**
     * 页面初始化
     *
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(ModelMap model) {
        return "common/login";
    }

    /**
     * 登陆
     *
     * @param userName
     * @param password
     * @param capt
     */
    @RequestMapping(method = RequestMethod.POST)
    public BaseAjaxResponse<Void> doPost(String userName, String password, String capt, HttpServletRequest request) {
        BaseAjaxResponse<Void> response = new BaseAjaxResponse<>();
        //验证用户名密码和验证码是否填写
        if (StringUtil.isBlank(userName) || StringUtil.isBlank(password) || StringUtil.isBlank(capt)) {
            response.setErrorMsg("用户名密码不能为空，验证码必填。");
            return response;
        }
        //检查验证码是否正确
        if (RunConfig.hasProdMode()) {
            String codeValidate = CaptchaUtil.getCode(request);
            if (!com.kili.common.util.StringUtil.equalsIgnoreCase(capt, codeValidate)) {
                response.setErrorMsg("验证码输入错误");
                return response;
            }
        }
        //
        UserDO userDO = userDAO.queryUserByName(userName);
        if (userDO == null) {
            response.setErrorMsg("用户不存在");
            return response;
        }
        if (!StringUtil.equals(userDO.getPassword(), DigestUtils.sha256Hex(password))) {
            response.setErrorMsg("密码错误");
            return response;
        }
        request.getSession().setAttribute("pl-tools-session-id", assemblySessionObject(userDO));
        response.setSuccess(true);
        return response;
    }

    /**
     * 构建session对象
     *
     * @param userDO
     * @return
     */
    private SecurityContext assemblySessionObject(UserDO userDO) {
        OperationPrincipal principal = new OperationPrincipal();
        principal.setUserId(userDO.getId());
        principal.setUserName(userDO.getLoginName());
        principal.setFirstName(userDO.getUserName());
        OperationContext context = new OperationContext(principal);
        SecurityContext securityContext = new SecurityContextImpl();
        securityContext.setAuthentication(context);
        securityContext.setLanguage(Locale.CHINA.getCountry());
        return securityContext;

    }
}
