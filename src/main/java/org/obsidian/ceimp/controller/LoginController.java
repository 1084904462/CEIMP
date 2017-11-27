package org.obsidian.ceimp.controller;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.LogBean;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.StatusBean;
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
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
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

    /*存放所有登录用户的session*/
    private static final Map<Long,HttpSession> userSessionMap = new HashMap<>();

    /*存放所有登录管理员的session*/
    private static final Map<Long,HttpSession> managerSessionMap = new HashMap<>();

    /*只用于UserLogInterceptor拦截用户请求*/
    public static Map<Long, HttpSession> getUserSessionMap() {
        return userSessionMap;
    }

    /*只用于ManagerLogInterceptor拦截管理员请求*/
    public static Map<Long, HttpSession> getManagerSessionMap() {
        return managerSessionMap;
    }

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
     * 普通用户登录
     * @param session
     * @param logBean 登录账号密码
     * @return 返回普通用户登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/userLogin")
    @ResponseBody
    public String userLogin(HttpSession session, LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException, IllegalAccessException, ParseException, InvocationTargetException {
        session.setAttribute("userLogBean",null);   //防止同一个浏览器窗口同时登录用户和管理员身份
        session.setAttribute("managerLogBean",null);
        logger.info("userAccount:" + logBean.getAccount());
        StatusBean statusBean = new StatusBean();
        UserBasic userBasic = userBasicService.selectByAccount(logBean.getAccount());
        if(userBasic != null){
            if(userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(logBean.getPassword()))){
                Long userId = userBasic.getUserId();
                HttpSession preSession = userSessionMap.get(userId);
                if(preSession != null){ //如果原先已有该用户登录的session
                    preSession.invalidate();     //把原登录用户的session失效
                    userSessionMap.remove(userId);  //移出userSessionMap中的userId对应的session
                    logger.info("用户" + userBasic.getAccount() + userBasic.getUsername() + "重复登录");
                }
                UserLogBean userLogBean = new UserLogBean(userBasic.getUserId(),userBasic.getAccount(),userBasic.getUsername());
                session.setAttribute("userLogBean",userLogBean);
                System.out.println(session.getMaxInactiveInterval());
                userSessionMap.put(userId,session); //把当前登录用户的userId和session放入userSessionMap
                statusBean.setStatus("登录成功");
            }
            else{
                statusBean.setStatus("密码错误");
            }
        }
        else{
            statusBean.setStatus("无该用户");
        }
        logger.info(statusBean);
        return JSON.toJSONString(statusBean);
    }

    /**
     * 退出登录
     * @param session
     * @return 重定向至登录页面
     */
    @GetMapping("/userLogout")
    public String userLogout(HttpSession session){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        if(userLogBean != null){
            Long userId = userLogBean.getUserId();
            userSessionMap.get(userId).invalidate();
            userSessionMap.remove(userId);
            logger.info("用户" + userLogBean.getAccount() + userLogBean.getUsername() + "退出登录");
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
        session.setAttribute("userLogBean",null);
        session.setAttribute("managerLogBean",null);
        logger.info("managerAccount:" + logBean.getAccount());
        StatusBean statusBean = new StatusBean();
        Manager manager = managerService.selectByAccount(logBean.getAccount());
        if(manager != null){
            if(manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(logBean.getPassword()))) {
                Long managerId = manager.getManagerId();
                HttpSession preSession = managerSessionMap.get(managerId);
                if(preSession != null){ //如果原先已有该管理员登录的session
                    preSession.invalidate();     //把原登录管理员的session失效
                    managerSessionMap.remove(managerId);  //移出managerSessionMap中的managerId对应的session
                    logger.info("管理员" + manager.getAccount() + "重复登录");
                }
                ManagerLogBean managerLogBean = new ManagerLogBean(manager.getManagerId(),manager.getAccount(),manager.getSchoolId(),manager.getGrade());
                session.setAttribute("managerLogBean",managerLogBean);
                managerSessionMap.put(managerId,session); //把当前登录管理员的managerId和session放入managerSessionMap
                statusBean.setStatus("登录成功");
            }
            else {
                statusBean.setStatus("密码错误");
            }
        }
        else{
            statusBean.setStatus("无该管理员");
        }
        logger.info(statusBean);
        return JSON.toJSONString(statusBean);
    }

    /**
     * 管理员退出登录
     * @param session
     * @return 重定向至登录界面
     */
    @GetMapping("/managerLogout")
    public String managerLogout(HttpSession session){
        ManagerLogBean managerLogBean =(ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean != null){
            Long managerId = managerLogBean.getManagerId();
            managerSessionMap.get(managerId).invalidate();
            managerSessionMap.remove(managerId);
            logger.info("管理员" + managerLogBean.getAccount() + "退出登录");
        }
        return "redirect:/login";
    }
}
