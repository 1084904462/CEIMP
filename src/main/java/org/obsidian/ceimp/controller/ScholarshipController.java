package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipBlockBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipBlock;
import org.obsidian.ceimp.entity.ScholarshipItem;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/8/20.
 */
@Controller
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private ScholarshipBlockService scholarshipBlockService;

    @Autowired
    private ScholarshipItemService scholarshipItemService;

    @Autowired
    private FillInTypeService fillInTypeService;

    @Autowired
    private AwardService awardService;

    @RequestMapping(value = "/scholarship",method = RequestMethod.GET)
    public String showScholarship(HttpSession session,Model model){
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        String userId = userLogBean.getUserId();
        List<Award> awardList = awardService.selectAllByUserIdAndThisYear(userId);
        List<ScholarshipBean> scholarshipBeanList = new ArrayList<>();
        if(awardList != null){
            for(int i=0;i<awardList.size();i++){
                ScholarshipBean scholarshipBean = new ScholarshipBean();
                int scholarshipId = awardList.get(i).getScholarshipId();
                Scholarship scholarship = scholarshipService.selectByScholarshipId(scholarshipId);
                scholarshipBean.setScholarship(scholarship);
                List<ScholarshipBlock> scholarshipBlockList = scholarshipBlockService.selectAllByScholarshipId(scholarshipId);
                List<ScholarshipBlockBean> scholarshipBlockBeanList = new ArrayList<>();
                for(int j=0;j<scholarshipBlockList.size();j++){
                    ScholarshipBlockBean scholarshipBlockBean = new ScholarshipBlockBean();
                    scholarshipBlockBean.setScholarshipBlock(scholarshipBlockList.get(j));
                    int scholarshipBlockId = scholarshipBlockList.get(j).getScholarshipBlockId();
                    List<ScholarshipItem> scholarshipItemList = scholarshipItemService.selectAllByScholarshipBlockId(scholarshipBlockId);
                    scholarshipBlockBean.setScholarshipItemList(scholarshipItemList);
                    scholarshipBlockBeanList.add(scholarshipBlockBean);
                }
                scholarshipBean.setScholarshipBlockBeanList(scholarshipBlockBeanList);
                scholarshipBeanList.add(scholarshipBean);
            }
        }
        System.out.println(scholarshipBeanList);
        model.addAttribute("scholarshipBeanList",scholarshipBeanList);
        return "test";
    }
}
