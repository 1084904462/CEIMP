package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
<<<<<<< HEAD
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 109a7e8ce339c3b4b86e113f41ecb56f18aa4abe
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
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
<<<<<<< HEAD

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private ManagerService managerService;

    private final Map<String,HttpSession> sessionMap = new HashMap<>();

    private final Map<Long,String> userMap = new HashMap<>();

    private final Map<Long,String> managerMap = new HashMap<>();
=======
>>>>>>> 109a7e8ce339c3b4b86e113f41ecb56f18aa4abe

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
     * @param model
     * @param session
     * @param request
     * @param account 用户登录账号
     * @param password 用户登录密码
     * @return 返回普通用户登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/userLogin")
    public String userLogin(
                        Model model,
                        HttpSession session,
                        HttpServletRequest request,
                        @RequestParam("account")Long account,
                        @RequestParam("password")String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.debug("account:"+account+""+"password:"+password);
        ServletContext application = request.getServletContext();
        application.setAttribute("sessionMap",sessionMap);
        application.setAttribute("userMap",userMap);
        application.setAttribute("managerMap",managerMap);
        UserBasic userBasic = userBasicService.selectByUserId(account);
        if(userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
            String sessionId = userMap.get(account);
            if(sessionId != null){
                sessionMap.get(sessionId).invalidate();
                sessionMap.remove(sessionId);
                userMap.remove(account);
            }else {
                userMap.put(account,session.getId());
            }
            sessionMap.put(session.getId(),session);
            session.setAttribute("userAccount",account);
            return "user/index";
        }else {
            if(userBasic == null){
                model.addAttribute("result","该账户不存在");
            }else {
                model.addAttribute("result","密码错误");
            }
            return "login";
        }
    }

    /**
     * 退出登录
     * @param session
     * @return 返回登录页面
     */
    @GetMapping("/Logout")
    public String userLogout(HttpSession session){
        session.invalidate();
        return "redirect:/login";
    }

    /**
     * 管理员登录
     * @param model
     * @param session
     * @param request
     * @param account 管理员登录账号
     * @param password 管理员登录密码
     * @return 返回管理员登录首页
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/managerLogin")
    public String managerLogin(
                         Model model,
                         HttpSession session,
                         HttpServletRequest request,
                         @RequestParam("account")Long account,
                         @RequestParam("password")String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.debug("account:"+account+""+"password:"+password);
        ServletContext application = request.getServletContext();
        application.setAttribute("sessionMap",sessionMap);
        application.setAttribute("userMap",userMap);
        application.setAttribute("managerMap",managerMap);
        Manager manager = managerService.selectByManagerId(account);
        if(manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
            String sessionId = managerMap.get(account);
            if(sessionId != null){
                sessionMap.get(sessionId).invalidate();
                sessionMap.remove(sessionId);
                managerMap.remove(account);
            }else {
                managerMap.put(account,session.getId());
            }
            sessionMap.put(session.getId(),session);
            session.setAttribute("managerAccount",account);
            return "manager/index";
        }else {
            if(manager == null){
                model.addAttribute("result","该账户不存在");
            }else {
                model.addAttribute("result","密码错误");
            }
            return "login";
        }
    }

}
