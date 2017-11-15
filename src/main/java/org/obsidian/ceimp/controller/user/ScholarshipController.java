package org.obsidian.ceimp.controller.user;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
    private ScholarshipService scholarshipService;

    @GetMapping("/index")
    public String pageIndex(HttpSession session, Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<Award> list = awardService.selectAllByUserIdAndYearScope(userId,yearScope);
        List<AwardBean> awardBeanList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            Scholarship scholarship = scholarshipService.selectByScholarshipId(list.get(i).getScholarshipId());
            AwardBean awardBean = new AwardBean(scholarship.getName(),scholarship.getSubName());
            awardBeanList.add(awardBean);
        }
        model.addAttribute("awardBeanList",awardBeanList);
        return "user/scholarship/index";
    }

    @GetMapping("/ng")
    public String pageNg(HttpSession session){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        return "user/scholarship/ng";
    }
}
