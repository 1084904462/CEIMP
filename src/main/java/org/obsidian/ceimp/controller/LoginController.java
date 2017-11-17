package org.obsidian.ceimp.controller;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.LogStatusBean;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

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

    private final Map<String,HttpSession> sessionMap = new HashMap<>();

    private final Map<Long,String> userMap = new HashMap<>();

    private final Map<Long,String> managerMap = new HashMap<>();

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

    /**
     * 普通用户登录
     * @param session
     * @param request
     * @param account 用户登录账号
     * @param password 用户登录密码
     * @return 返回普通用户登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/userLogin")
    @ResponseBody
    public String userLogin(
                        HttpSession session,
                        HttpServletRequest request,
                        @RequestParam("account")String account,
                        @RequestParam("password")String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.info("account:"+account+""+"password:"+password);
        ServletContext application = request.getServletContext();
        application.setAttribute("sessionMap",sessionMap);
        application.setAttribute("userMap",userMap);
        UserBasic userBasic = userBasicService.selectByAccount(account);
        LogStatusBean logStatusBean = new LogStatusBean();
        if(userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
            String sessionId = userMap.get(userBasic.getUserId());
            if(sessionId != null && !"".equals(sessionId)){
                sessionMap.get(sessionId).invalidate();
                sessionMap.remove(sessionId);
                userMap.remove(userBasic.getUserId());
            }else {
                userMap.put(userBasic.getUserId(),session.getId());
            }
            sessionMap.put(session.getId(),session);
            UserLogBean userLogBean = new UserLogBean();
            userLogBean.setUserId(userBasic.getUserId());
            session.setAttribute("userLogBean",userLogBean);
            logStatusBean.setStatus("登录成功");
            logger.info(logStatusBean);
            return JSON.toJSONString(logStatusBean);

        }else {
            if(userBasic == null){
                logStatusBean.setStatus("无该用户");
                logger.debug(logStatusBean);
                return JSON.toJSONString(logStatusBean);
            }else {
                logStatusBean.setStatus("密码错误");
                logger.debug(logStatusBean);
                return JSON.toJSONString(logStatusBean);
            }

        }

    }

    /**
     * 退出登录
     * @param session
     * @return 返回登录页面
     */
    @GetMapping("/userLogout")
    public String userLogout(HttpSession session){
        UserLogBean userLogBean =(UserLogBean) session.getAttribute("userLogBean");
        String sessionnId = userMap.get(userLogBean.getUserId());
        HttpSession session1 = sessionMap.get(sessionnId);
        session1.invalidate();
        sessionMap.remove(sessionnId);
        userMap.remove(userLogBean.getUserId());
        return "redirect:/login";
    }

    /**
     * 管理员登录
     * @param session
     * @param request
     * @param account 管理员登录账号
     * @param password 管理员登录密码
     * @return 返回管理员登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/managerLogin")
    @ResponseBody
    public String managerLogin(
                         HttpSession session,
                         HttpServletRequest request,
                         @RequestParam("account")String account,
                         @RequestParam("password")String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.info("account:"+account+""+"password:"+password);
        ServletContext application = request.getServletContext();
        application.setAttribute("sessionMap",sessionMap);
        application.setAttribute("managerMap",managerMap);
        LogStatusBean logStatusBean = new LogStatusBean();
        Manager manager = managerService.selectByAccount(account);
        if(manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
            String sessionId = managerMap.get(manager.getManagerId());
            if(sessionId != null){
                sessionMap.get(sessionId).invalidate();
                sessionMap.remove(sessionId);
                managerMap.remove(manager.getManagerId());
            }else {
                managerMap.put(manager.getManagerId(),session.getId());
            }
            sessionMap.put(session.getId(),session);
            ManagerLogBean managerLogBean = new ManagerLogBean();
            managerLogBean.setManagerId(manager.getManagerId());
            session.setAttribute("managerLogBean",managerLogBean);
            logStatusBean.setStatus("登录成功");
            logger.info(logStatusBean);
            return JSON.toJSONString(logStatusBean);
        }else {
            if(manager == null){
                logStatusBean.setStatus("无该用户");
                logger.debug(logStatusBean);
                return JSON.toJSONString(logStatusBean);
            }else {
                logStatusBean.setStatus("密码错误");
                logger.debug(logStatusBean);
                return JSON.toJSONString(logStatusBean);
            }
        }
    }

    @GetMapping("/managerLogout")
    public String managerLogout(HttpSession session){
        ManagerLogBean managerLogBean =(ManagerLogBean) session.getAttribute("managerLogBean");
        String sessionnId = managerMap.get(managerLogBean.getManagerId());
        HttpSession session1 = sessionMap.get(sessionnId);
        session1.invalidate();
        sessionMap.remove(sessionnId);
        managerMap.remove(managerLogBean.getManagerId());
        return "redirect:/login";
    }
}
