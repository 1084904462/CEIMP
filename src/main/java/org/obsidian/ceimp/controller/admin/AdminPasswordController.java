package org.obsidian.ceimp.controller.admin;

import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ChangePasswordBean;
import org.obsidian.ceimp.bean.ManagerBean;
import org.obsidian.ceimp.bean.ResetPasswordBean;
import org.obsidian.ceimp.bean.ResetUserssBean;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserssService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/m/admin/changeManagerPassword", method = RequestMethod.POST)
    @ResponseBody
    public ChangePasswordBean changeManagerPassword(HttpSession session,HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        Manager manager = managerService.selectByManagerId(managerId);
        ChangePasswordBean changePasswordBean = null;
		if(manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(oldPassword))){
            if(newPassword.length() >= 6){
                if(newPassword.length() <= 16){
                    if(newPassword.equals(confirmPassword)){
                        managerService.updateManagerPassword(managerId,newPassword);
                        changePasswordBean = new ChangePasswordBean("密码修改成功");
                    }
                    else{
                        changePasswordBean = new ChangePasswordBean("两次新密码输入不相同");
                    }
                }
                else{
                    changePasswordBean = new ChangePasswordBean("新密码必须小于16位");
                }
            }
            else{
                changePasswordBean = new ChangePasswordBean("新密码必须大于6位");
            }
        }
        else{
            changePasswordBean = new ChangePasswordBean("旧密码输入错误");
        }
        return changePasswordBean;
    }

    @RequestMapping(value = "/m/admin/resetPassword", method = RequestMethod.GET)
    public String resetPassword(Model model){
        List<ResetUserssBean> list = userssService.selectAllResetUserssBean();
        model.addAttribute("resetUserssBean",list);
        return "scholarship/admin/resetPassword";
    }

    @RequestMapping(value = "/m/admin/resetPassword/submit", method = RequestMethod.POST)
	@ResponseBody
    public int resetPasswordSubmit(HttpServletRequest request) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String jsonStr = request.getParameter("resetPasswordBean");
        System.out.println(jsonStr);
        List<ResetPasswordBean> resetPasswordBeans = new ArrayList<>(JSONArray.parseArray(jsonStr, ResetPasswordBean.class));
        List<String> list = new ArrayList<>();
        for(int i=0;i<resetPasswordBeans.size();i++){
            list.add(resetPasswordBeans.get(i).getUserId());
        }
        return userssService.updateUserssPassword(list);
    }
}
