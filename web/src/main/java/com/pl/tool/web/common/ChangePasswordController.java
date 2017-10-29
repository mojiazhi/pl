package com.pl.tool.web.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 修改密码
 * Created by mo on 2017/10/29.
 */
@Controller
@RequestMapping("/changePassword.html")
public class ChangePasswordController {

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(){
        return "common/changePassword";
    }
}
