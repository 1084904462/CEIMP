package org.obsidian.ceimp.controller;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.LogBean;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.StatusBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BillChen on 2017/11/13.
 */
@Controller
public class LoginController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private ManagerService managerService;

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
     * 如果当前用户已登录，则重定向至用户端首页
     * 如果当前管理员已登录，则重定向至管理员端首页
     * 否则返回登录界面
     * @return 返回登录界面
     */
    @GetMapping("/login")
    public String pageLogin(HttpSession session){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        if(userLogBean != null){
            return "redirect:/evaluation/index";
        }
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean != null){
            return "redirect:/manager/index";
        }
        return "login";
    }

    /**
     * * 普通用户登录
     * @param session
     * @param logBean 登录账号密码
     * @return 返回普通用户登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/userLogin")
    @ResponseBody
    public String userLogin(HttpSession session, LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.debug("sessionId:" + session.getId() + " userAccount:" + logBean.getAccount());
        StatusBean statusBean = userBasicService.userLogin(session,logBean);
        return JSON.toJSONString(statusBean);
    }

    /**
     * 退出登录
     * @param session
     * @return 重定向至登录页面
     */
    @GetMapping("/userLogout")
    public String userLogout(HttpSession session){
        UserLogBean userLogBean = (UserLogBean)session.getAttribute("userLogBean");
        if(userLogBean != null){
            session.setAttribute("userLogBean",null);
        }
        return "redirect:/login";
    }

    /**
     * 管理员登录
     * @param session
     * @param logBean 登录账号密码
     * @return 返回管理员登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/managerLogin")
    @ResponseBody
    public String managerLogin(HttpSession session,LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.debug("sessionId:" + session.getId() + " managerAccount:" + logBean.getAccount());
        StatusBean statusBean = managerService.managerLogin(session,logBean);
        return JSON.toJSONString(statusBean);
    }

    /**
     * 管理员退出登录
     * @param session
     * @return 重定向至登录界面
     */
    @GetMapping("/managerLogout")
    public String managerLogout(HttpSession session){
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        if(managerLogBean != null){
            session.setAttribute("managerLogBean",null);
        }
        return "redirect:/login";
    }
}
