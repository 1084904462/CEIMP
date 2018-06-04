package org.obsidian.ceimp.controller.manager;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.UserSearchBean;
import org.obsidian.ceimp.service.MajorService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BillChen on 2017/11/17.
 */
@Controller
@RequestMapping("/manager")
public class ManagerIndexController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private MajorService majorService;

    @Autowired
    private UserBasicService userBasicService;

    @GetMapping("")
    public String manager(){
        return "redirect:/manager/index";
    }

    @GetMapping("/index")
    public String managerIndex(HttpSession session, Model model){
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        List<String> gradeList = majorService.getLastThree(managerLogBean.getSchoolId());
        int yearScope = TimeUtil.getInstance().getThisYear();
        String grade = gradeList.isEmpty()? "":gradeList.get(0);
        List<UserSearchBean> userSearchBeanList = userBasicService.getUserSearchBeanList(managerLogBean.getSchoolId(),grade,yearScope);
        model.addAttribute("gradeList",gradeList);
        model.addAttribute("userSearchBeanList",userSearchBeanList);
        return "manager/index";
    }

    @GetMapping("/index/{grade}")
    @ResponseBody
    public String showIndexByGrade(@PathVariable("grade") String grade, HttpSession session){
        logger.debug("grade:" + grade);
        ManagerLogBean managerLogBean = (ManagerLogBean)session.getAttribute("managerLogBean");
        int yearScope = TimeUtil.getInstance().getThisYear();
        return JSON.toJSONString(userBasicService.getUserSearchBeanList(managerLogBean.getSchoolId(),grade,yearScope));
    }
}