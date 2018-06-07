package org.obsidian.ceimp.controller.user;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.bean.PasswordBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.service.BasicScholarshipService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
@Controller
@RequestMapping("/scholarship")
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private AwardService awardService;

    @Autowired
    private BasicScholarshipService basicScholarshipService;

    /**
     * 接收/scholarship请求，重定向至/scholarship/index
     * @return
     */
    @GetMapping("")
    public String pageScholarshipRoot(){
        return "redirect:/scholarship/index";
    }


    /**
     * 进入奖学金列表首页
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/index")
    public String pageScholarshipIndex(HttpSession session, Model model){
        Long userId = ((UserLogBean) session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<AwardBean> awardBeanList = awardService.getList(userId,yearScope);
        model.addAttribute("awardBeanList",awardBeanList);
        return "user/scholarship/index";
    }


    /**
     * 修改用户密码
     * @param passwordBean
     * @param session
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    @PostMapping("/changePassword")
    @ResponseBody
    public String changeUserPassword(PasswordBean passwordBean, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Long userId = ((UserLogBean) session.getAttribute("userLogBean")).getUserId();
        return JSON.toJSONString(userBasicService.changeUserPassword(userId,passwordBean));
    }


    /**
     * 根据subName确定奖学金
     * 从session中获取userId
     * 默认查询当前综测的奖学金
     * 如果该用户没有获得奖学金，则重定向至/scholarship/index
     * @param subName
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/{subName}")
    public String pageScholarship(@PathVariable("subName") String subName, HttpSession session, Model model){
        logger.debug("subName:" + subName);
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        if(!awardService.exist(userId,subName,yearScope)){
            return "redirect:/scholarship/index";
        }
        BasicScholarshipBean bean = basicScholarshipService.getBean(subName,userId,yearScope);
        model.addAttribute("basicScholarshipBean",bean);
        return "user/scholarship/" + subName;
    }

    /**
     * 插入或更新用户提交的奖学金填写信息
     * 生成规范格式的奖学金word文档
     * @param subName
     * @param postBean
     * @param session
     * @throws IOException
     */
    @PostMapping("/{subName}")
    public ResponseEntity<byte[]> scholarshipSubmit(@PathVariable("subName") String subName, BasicScholarshipBean postBean, HttpSession session) throws IOException {
        logger.debug("subName:" + subName);
        logger.debug("postBean:" + postBean);
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        BasicScholarshipBean bean = basicScholarshipService.copyBean(subName,userId,yearScope,postBean);
        if(!basicScholarshipService.exist(subName,userId,yearScope)){
            basicScholarshipService.insert(subName,userId,yearScope,bean);
            awardService.updateIsFilled(userId,yearScope,subName);
        }
        else{
            basicScholarshipService.update(subName,userId,yearScope,bean);
        }
        return basicScholarshipService.generateWord(subName,bean);
    }
}
