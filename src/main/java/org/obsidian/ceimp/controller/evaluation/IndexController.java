package org.obsidian.ceimp.controller.evaluation;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.Userss;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserssService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BillChen on 2017/8/23.
 */
@Controller
public class IndexController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    ManagerService managerService;

    @Autowired
    UserssService userssService;

    /**
     * 访问/index
     * 返回index.html
     * @return
     */
    @RequestMapping(value = "/evaluation/index", method = RequestMethod.GET)
    public String index(){
        return "evaluation/index";
    }

    @GetMapping(value = "/manager")
    public String manager(Model model){

        model.addAttribute("managerList",managerService.selectAllManager());
        return "manager";
    }

    @PostMapping(value = "/addManager")
    @ResponseBody
    public String addManager(HttpServletRequest request, @RequestParam(value = "managerId") String managerId, @RequestParam(value = "password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        managerService.insertManager(managerId,password);
        String manager = JSON.toJSONString(managerService.selectByManagerId(managerId));
        Manager manager1 = JSON.parseObject(manager,Manager.class);
        ServletContext application = request.getServletContext();
        application.setAttribute("userId",managerId);
        return (String) application.getAttribute("userId");
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public int login(HttpServletRequest request,@RequestParam("userId") String userId,@RequestParam("password") String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        ServletContext application = request.getServletContext();
        Userss userss = userssService.selectByUserId(userId);
        if(userss.getPassword().equals(MD5Util.getInstance().EncoderByMd5(password))){
            if(userId.equals(application.getAttribute("userId"+userId))){
                return -1;
            }else {
                application.setAttribute("userId"+userId,userId);
                return 1;
            }
        }else {
            return 0;
        }
    }

}
