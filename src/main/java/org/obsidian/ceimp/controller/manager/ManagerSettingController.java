package org.obsidian.ceimp.controller.manager;

import org.obsidian.ceimp.bean.*;
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
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Logger;


/**
 * Created by Administrator on 2017/11/20.
 */
@Controller
public class ManagerSettingController {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(this.getClass());



    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private ManagerService managerService;

    /**
     * 进入重置密码页面
     * @return 重置密码页面
     */
    @GetMapping("/manager/resetPassword")
    public String pageResetPassword(){
        return "manager/resetPassword";
    }

    /**
     * 管理员重置密码
     * @param logBean 用户账号，用户密码
     * @return 重置成功
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */

    @PostMapping("/manager/resetPassword")
    @ResponseBody
    public String resetPassword(LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.info("account:"+logBean.getAccount());
        StatusBean statusBean = new StatusBean();
        UserBasic userBasic = userBasicService.selectByAccount(logBean.getAccount());
        userBasic.setPassword(logBean.getPassword());
        userBasicService.updateUserBasic(userBasic);
        statusBean.setStatus("重置成功");
        return JSON.toJSONString(statusBean);
    }

    @GetMapping("/manager/search")
    @ResponseBody
    public List<UserSearchBean> search(SearchBean searchBean){
        logger.info("searchKey:"+searchBean.getSearchKey());
        String [] accountSplit = searchBean.getSearchKey().split("\\D");
        String account = "";
        for(String accounts:accountSplit){
            account = account + accounts;
        }
        logger.info(account);
        String [] usernameSplit = searchBean.getSearchKey().split("\\d");
        String username = "";
        for(String usernames:usernameSplit){
            username = username + usernames;
        }
        logger.info(username);
        return userBasicService.selectByAccountAndUsername(account,username);
    }

    /**
     * 管理员修改密码
     * @param passwordBean 密码，确认密码
     * @param session 管理员信息
     * @return 修改结果
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/manager/changePassword")
    @ResponseBody
    public String changePassword(PasswordBean passwordBean, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Long managerId = ((ManagerLogBean) session.getAttribute("managerLogBean")).getManagerId();
        Manager manager = managerService.selectByManagerId(managerId);
        StatusBean statusBean = new StatusBean();
        if(passwordBean.getPassword().equals(passwordBean.getConfirmPassword())){
            if(!manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(passwordBean.getPassword()))){
                manager.setPassword(passwordBean.getPassword());
                managerService.update(manager);
                statusBean.setStatus("修改成功");
            }
            else{
                statusBean.setStatus("新密码与原密码相同");
            }
        }
        else {
            statusBean.setStatus("两次密码输入不同");
        }
        return JSON.toJSONString(statusBean);
    }
}
