package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.SchoolService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;


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

    @Autowired
    private SchoolService schoolService;

    /**
     * 进入重置密码页面
     * @return 重置密码页面
     */
    @GetMapping("/resetPassword")
    public String pageResetPassword(){
        return "manager/resetPassword";
    }

    /**
     * 管理员重置用户密码为888888
     * @param userAccountBean
     * @return 重置密码成功
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/resetPassword")
    @ResponseBody
    public String resetPassword(@RequestBody UserAccountBean userAccountBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        logger.debug(userAccountBean);
        String password = "888888";
        return JSON.toJSONString(managerService.resetPassword(userAccountBean,password));
    }

    /**
     * 默认只能搜索本学院用户
     * 先去除searchKey中的空格及转义字符
     * 再截取中文、数字，并在两头添加'%'
     * @param searchBean
     * @param session 从session中的managerLogBean获取schoolId
     * @return
     */
    @PostMapping("/search")
    @ResponseBody
    public String searchUser(@RequestBody SearchBean searchBean,HttpSession session){
        logger.debug("searchKey:" + searchBean.getSearchKey());
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(userBasicService.searchUser(searchBean,managerLogBean.getSchoolId(),yearScope));
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
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        return JSON.toJSONString(managerService.changePassword(managerLogBean.getManagerId(),passwordBean));
    }

    /**
     * 进入新增管理员页面
     * @param model
     * @return
     */
    @GetMapping("/insertManager")
    public String pageInsertManager(Model model){
        List<School> schoolList = schoolService.getAll();
        model.addAttribute("schoolList",schoolList);
        return "manager/insertManager";
    }

    /**
     * 新增管理员
     * @return
     */
    @PostMapping("/insertManager")
    @ResponseBody
    public String insertManager(InsertManagerBean insertManagerBean){
        return JSON.toJSONString(managerService.insert(insertManagerBean));
    }
}
