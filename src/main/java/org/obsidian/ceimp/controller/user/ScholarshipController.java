package org.obsidian.ceimp.controller.user;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
@Controller
@RequestMapping("/scholarship")
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private AwardService awardService;

    @GetMapping("")
    public String pageScholarship(){
        return "redirect:/scholarship/index";
    }

    @GetMapping("/index")
    public String pageScholarshipIndex(HttpSession session, Model model){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        logger.info("用户" + userLogBean.getAccount() + userLogBean.getUsername() + "进入奖学金首页");
        Long userId = userLogBean.getUserId();
        Integer yearScope = TimeUtil.getInstance().getThisYear();
        List<AwardBean> awardBeanList = awardService.selectAllByUserIdAndYearScope(userId,yearScope);
        logger.info(awardBeanList);
        model.addAttribute("awardBeanList",awardBeanList);
        return "user/scholarship/index";
    }

}
