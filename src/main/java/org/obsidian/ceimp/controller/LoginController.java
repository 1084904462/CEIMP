package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by BillChen on 2017/11/13.
 */
@Controller
public class LoginController {
    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * 项目根路径
     * @return 重定向至/login
     */
    @GetMapping("/")
    public String pageDefault(){
        return "redirect:/login";
    }

    /**
     * 访问/login
     * @return 返回登录界面
     */
    @GetMapping("/login")
    public String pageLogin(){
        return "login";
    }
}
