package org.obsidian.ceimp.controller.admin;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by BillChen on 2017/10/16.
 */
@Controller
public class AdminPasswordController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ManagerService managerService;

    @Autowired
    private UserssService userssService;

    @RequestMapping(value = "m/admin/changeManagerPassword", method = RequestMethod.POST)
    @ResponseBody
    public String changeManagerPassword(HttpSession session,HttpServletRequest request){
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        return "";
    }

    @RequestMapping(value = "/m/admin/resetPassword", method = RequestMethod.POST)
    @ResponseBody
    public int resetPassword(HttpServletRequest request){

        return 0;
    }
}
