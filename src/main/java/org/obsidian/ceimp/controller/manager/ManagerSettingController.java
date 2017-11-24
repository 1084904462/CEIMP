package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Administrator on 2017/11/20.
 */
@Controller
@RequestMapping("/manager/settings")
public class ManagerSettingController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private ManagerService managerService;

    /**
     * 进入重置密码页面
     * @return 重置密码页面
     */
    @GetMapping("/resetPassword")
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
    @PostMapping("/resetPassword")
    @ResponseBody
    public String resetPassword(@RequestBody LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.info("account:" + logBean.getAccount());
        UserBasic userBasic = new UserBasic();
        userBasic.setAccount(logBean.getAccount());
        userBasic.setPassword(logBean.getPassword());
        int isReset = userBasicService.updateUserBasic(userBasic);
        StatusBean statusBean = new StatusBean();
        if(isReset == 0){
            statusBean.setStatus("重置密码失败");
        }
        else{
            statusBean.setStatus("重置密码成功");
        }
        logger.info(statusBean);
        return JSON.toJSONString(statusBean);
    }

    /**
     *
     * @param searchBean
     * @param session 从session中的managerLogBean获取schoolId
     * @return
     */
    @PostMapping("/search")
    @ResponseBody
    public String search(@RequestBody SearchBean searchBean,HttpSession session){
        logger.info("searchKey:" + searchBean.getSearchKey());
        Long schoolId = ((ManagerLogBean)session.getAttribute("managerLogBean")).getSchoolId();
        String searchKey = searchBean.getSearchKey().replaceAll("\\s+", "");
        List<String> searchKeyList = new ArrayList<>();
        Pattern pattern1 = Pattern.compile("\\D+");
        Matcher matcher1 = pattern1.matcher(searchKey);
        while(matcher1.find()){
            searchKeyList.add(matcher1.group());
        }
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher2 = pattern2.matcher(searchKey);
        while(matcher2.find()){
            searchKeyList.add(matcher2.group());
        }

        return "1";
    }

    /**
     * 管理员修改自己的密码
     * @param passwordBean 新密码，确认密码
     * @param session 从session中的managerLogBean获取managerId
     * @return 修改结果
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/changePassword")
    @ResponseBody
    public String changePassword(PasswordBean passwordBean, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Long managerId = ((ManagerLogBean) session.getAttribute("managerLogBean")).getManagerId();
        Manager manager = managerService.selectByManagerId(managerId);
        StatusBean statusBean = new StatusBean();
        if(passwordBean.getPassword().length() >= 6){
            if(passwordBean.getPassword().length() <= 16){
                if(passwordBean.getPassword().equals(passwordBean.getConfirmPassword())){
                    if(!manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(passwordBean.getPassword()))){
                        manager.setPassword(passwordBean.getPassword());
                        managerService.updateManager(manager);
                        statusBean.setStatus("修改成功");
                    }
                    else{
                        statusBean.setStatus("新密码与原密码相同");
                    }
                }
                else {
                    statusBean.setStatus("两次密码输入不同");
                }
            }
            else{
                statusBean.setStatus("新密码不能大于16位");
            }
        }
        else{
            statusBean.setStatus("新密码不能小于6位");
        }
        return JSON.toJSONString(statusBean);
    }
}
