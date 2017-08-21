package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
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
    private Logger logger = Logger.getLogger(LogController.class);

    @Autowired
    private UsersService usersService;

    @Autowired
    private ClassManagerService classManagerService;

    @Autowired
    private SchoolManagerService schoolManagerService;

    @RequestMapping(value = "/", method = {RequestMethod.GET,RequestMethod.POST})
    public String login(HttpSession session){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        if(userLogBean != null && !"".equals(userLogBean.getUserId())){
            return "index";
        }
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean != null && !"".equals(managerLogBean.getManagerId())){
            return "admin";
        }
        return "login";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogIn(HttpSession session, @RequestParam(value = "userId") String userId, @RequestParam(value = "password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        if(userLogBean != null && !"".equals(userLogBean.getUserId())){
            return "index";
        }
        Users users = usersService.selectByUserId(userId);
        if(users != null){
            if(users.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
                logger.info("user " + userId + " login success");

                userLogBean = new UserLogBean(userId,"登录成功");
                session.setAttribute("userLogBean",userLogBean);
                return "index";
            }
            else {
                logger.info("user " + userId + " password is not correct");

                userLogBean = new UserLogBean("","密码错误");
                session.setAttribute("userLogBean",userLogBean);
            }
        }
        else {
            logger.info("user " + userId + " is not in database");

            userLogBean = new UserLogBean("","没有该用户");
            session.setAttribute("userLogBean",userLogBean);
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/userLogout", method = RequestMethod.GET)
    public String userLogOut(HttpSession session){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        logger.info("user " + userLogBean.getUserId() + " logOut");

        session.removeAttribute("userLogBean");
        return "redirect:/";
    }

    @RequestMapping(value = "/managerLogin", method = RequestMethod.POST)
    public String managerLogIn(HttpSession session, @RequestParam(value = "managerId") String managerId,@RequestParam(value = "password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        if(managerLogBean != null && !"".equals(managerLogBean.getManagerId())){
            return "admin";
        }
        ClassManager classManager = classManagerService.selectByClassManagerId(managerId);
        if(classManager != null){
            if(classManager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
                logger.info("classManager " + managerId + " login success");

                managerLogBean = new ManagerLogBean(managerId,"班级管理员","登录成功");
                session.setAttribute("managerLogBean",managerLogBean);
                return "admin";
            }
            else{
                logger.info("classManager " + managerId + " password is not correct");

                managerLogBean = new ManagerLogBean("","","密码错误");
                session.setAttribute("managerLogBean",managerLogBean);
            }
        }
        else{
            SchoolManager schoolManager = schoolManagerService.selectBySchoolManagerId(managerId);
            if(schoolManager != null){
                if(schoolManager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
                    logger.info("schoolManager " + managerId + " login success");

                    managerLogBean = new ManagerLogBean(managerId,"学院管理员","登录成功");
                    session.setAttribute("managerLogBean",managerLogBean);
                    return "admin";
                }
                else{
                    logger.info("schoolManager " + managerId + " password is not correct");

                    managerLogBean = new ManagerLogBean("","","密码错误");
                    session.setAttribute("managerLogBean",managerLogBean);
                }
            }
            else{
                logger.info("manager " + managerId + " is not in database");

                managerLogBean = new ManagerLogBean("","","没有该用户");
                session.setAttribute("managerLogBean",managerLogBean);
            }
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/managerLogout", method = RequestMethod.GET)
    public String managerLogOut(HttpSession session){
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        logger.info("manager " + managerLogBean.getManagerId() + " logOut");

        session.removeAttribute("managerLogBean");
        return "redirect:/";
    }
}
