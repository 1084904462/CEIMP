package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.LogStatusBean;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.entity.ClassManager;
import org.obsidian.ceimp.entity.SchoolManager;
import org.obsidian.ceimp.entity.Users;
import org.obsidian.ceimp.service.ClassManagerService;
import org.obsidian.ceimp.service.SchoolManagerService;
import org.obsidian.ceimp.service.UsersService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BillChen on 2017/8/18.
 */
@Controller
public class LogController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UsersService usersService;

    @Autowired
    private ClassManagerService classManagerService;

    @Autowired
    private SchoolManagerService schoolManagerService;

    /**
     * 访问根路径/
     * 返回重定向/login
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultPage(){
        return "redirect:/login";
    }

    /**
     * 访问/login
     * session已有userId，重定向至/evaluation/index
     * session已有managerId，重定向至/admin/index
     * 都没有，返回login.html
     * @param session
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpSession session){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(userLogBean != null && !"".equals(userLogBean.getUserId())){
            return "redirect:/evaluation/index";
        }
        if(managerLogBean != null && !"".equals(managerLogBean.getManagerId())){
            return "redirect:/admin/index";
        }
        return "login";
    }

    /**
     * 表单POST
     * 访问/userLogin
     * 登录成功，将userLogBean存入session，并重定向至/evaluation/index
     * 登录失败，发送失败原因，重定向至/login
     * @param session
     * @param userId
     * @param password
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogIn(HttpSession session, Model model, @RequestParam(value = "userId") String userId, @RequestParam(value = "password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
	    UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
	    ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
	    if(userLogBean != null){
	        session.removeAttribute("userLogBean");
        }
        if(managerLogBean != null){
	        session.removeAttribute("managerLogBean");
        }

        Users users = usersService.selectByUserId(userId);
        if(users != null){
            if(users.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
                logger.info("用户 " + userId + " 登录成功");
                userLogBean = new UserLogBean(userId);
                session.setAttribute("userLogBean",userLogBean);
                return "redirect:/evaluation/index";
            }
            else {
                logger.info("用户 " + userId + " 密码错误");
                LogStatusBean logStatusBean = new LogStatusBean("密码错误");
                model.addAttribute("logStatusBean",logStatusBean);
            }
        }
        else {
            logger.info("没有 " + userId + " 该用户");
            LogStatusBean logStatusBean = new LogStatusBean("无该用户");
            model.addAttribute("logStatusBean",logStatusBean);
        }
        return "redirect:/login";
    }

    /**
     * 用户登出
     * 清空session中的userLogBean
     * @param session
     * @return
     */
    @RequestMapping(value = "/userLogout", method = RequestMethod.GET)
    public String userLogOut(HttpSession session){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        if(userLogBean != null){
            logger.info("用户 " + userLogBean.getUserId() + " 登出");
            session.removeAttribute("userLogBean");
        }
        return "redirect:/login";
    }

    /**
     * 表单POST
     * 访问/managerLogin
     * 登录成功，将managerLogBean存入session，并重定向至/index
     * 登录失败，发送失败原因，重定向至/login
     * @param session
     * @param managerId
     * @param password
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @RequestMapping(value = "/managerLogin", method = RequestMethod.POST)
    public String managerLogIn(HttpSession session, Model model, @RequestParam(value = "managerId") String managerId,@RequestParam(value = "password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(userLogBean != null){
            session.removeAttribute("userLogBean");
        }
        if(managerLogBean != null){
            session.removeAttribute("managerLogBean");
        }

        ClassManager classManager = classManagerService.selectByClassManagerId(managerId);
        if(classManager != null){
            if(classManager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
                logger.info("班级管理员 " + managerId + " 登录成功");
                managerLogBean = new ManagerLogBean(managerId,1);
                session.setAttribute("managerLogBean",managerLogBean);
                return "redirect:/admin/index";
            }
            else{
                logger.info("班级管理员 " + managerId + " 密码错误");
                LogStatusBean logStatusBean = new LogStatusBean("密码错误");
                model.addAttribute("logStatusBean",logStatusBean);
            }
        }
        else{
            SchoolManager schoolManager = schoolManagerService.selectBySchoolManagerId(managerId);
            if(schoolManager != null){
                if(schoolManager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
                    logger.info("学院管理员 " + managerId + " 登录成功");
                    managerLogBean = new ManagerLogBean(managerId,2);
                    session.setAttribute("managerLogBean",managerLogBean);
                    return "redirect:/admin/index";
                }
                else{
                    logger.info("学院管理员 " + managerId + " 密码错误");
                    LogStatusBean logStatusBean = new LogStatusBean("密码错误");
                    model.addAttribute("logStatusBean",logStatusBean);
                }
            }
            else{
                logger.info("没有 " + managerId + " 该管理员");
                LogStatusBean logStatusBean = new LogStatusBean("无该用户");
                model.addAttribute("logStatusBean",logStatusBean);
            }
        }
        return "redirect:/login";
    }

    /**
     * 管理员登出
     * 清空session中的managerLogBean
     * @param session
     * @return
     */
    @RequestMapping(value = "/managerLogout", method = RequestMethod.GET)
    public String managerLogOut(HttpSession session){
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean != null){
            logger.info("管理员 " + managerLogBean.getManagerId() + " 登出");
            session.removeAttribute("managerLogBean");
        }
        return "redirect:/login";
    }
}
