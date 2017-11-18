package org.obsidian.ceimp.controller.manager;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.ShowScholarshipBean;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.service.MajorService;
import org.obsidian.ceimp.service.NgService;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Controller
public class ManagerScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private NgService ngService;

    /**
     * showScholarshipBean
     * 根据subName从数据库中表scholarship查询奖学金名称
     * 根据session中managerLogBean的schoolId查询数据库中表major对应所有年级
     * 默认年份为当前年份
     *
     * ScholarshipFormBeanList
     * 根据subName判断从ng、nis、pgs、ss、tas哪张表查询数据，并从数据库中表scholarship查询奖学金名称
     * 根据查询结果从userBasic表中查询用户信息
     * @param subName
     * @return
     */
    @GetMapping("/manager/scholarship/{subName}")
    public String showScholarship(@PathVariable("subName") String subName, HttpSession session, Model model){
        logger.info("subName:" + subName);
        ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
        ShowScholarshipBean showScholarshipBean = this.getShowScholarshipBean(subName,managerLogBean.getSchoolId());
        model.addAttribute("showScholarshipBean",showScholarshipBean);
        ScholarshipFormBean scholarshipFormBean = this.getScholarshipFormBean(subName);
        model.addAttribute("scholarshipFormBean",scholarshipFormBean);
        return "manager/showScholarship";
    }


    private ShowScholarshipBean getShowScholarshipBean(String subName,Long schoolId){
        ShowScholarshipBean showScholarshipBean = new ShowScholarshipBean();
        Scholarship scholarship = scholarshipService.selectBySubName(subName);
        logger.info(scholarship);
        if(scholarship != null){
            showScholarshipBean.setScholarshipName(scholarship.getName());
        }
        showScholarshipBean.setSubName(subName);
        List<String> grade = majorService.selectAllGradeBySchoolId(schoolId);
        logger.info(grade);
        if(!grade.isEmpty()){
            showScholarshipBean.setGrade(grade);
        }
        showScholarshipBean.setYearScope(TimeUtil.getInstance().getThisYear());
        return showScholarshipBean;
    }

    private ScholarshipFormBean getScholarshipFormBean(String subName){
        ScholarshipFormBean scholarshipFormBean = new ScholarshipFormBean();
        int yearScope = TimeUtil.getInstance().getThisYear();
        if(subName.equals("ng")){
//            List<Long> userIdList = ngService.selectAllUserIdByYearScope(yearScope);
        }
        else if(subName.equals("nis")){

        }
        else if(subName.equals("pgs")){

        }
        else if(subName.equals("ss")){

        }
        else if(subName.equals("tas")){

        }
        return scholarshipFormBean;
    }
}
