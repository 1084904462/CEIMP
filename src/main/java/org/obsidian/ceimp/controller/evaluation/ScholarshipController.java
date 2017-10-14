package org.obsidian.ceimp.controller.evaluation;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipBeanList;
import org.obsidian.ceimp.bean.ScholarshipDetailBean;
import org.obsidian.ceimp.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by BillChen on 2017/9/11.
 */
@Controller
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    /**
     * 访问/evaluation/scholarship
     * 返回所有奖学金列表与第一个奖学金详情
     * @param model
     * @return
     */
    @RequestMapping(value = "/evaluation/scholarship", method = RequestMethod.GET)
    public String scholarship(Model model){
        ScholarshipBeanList scholarshipBeanList = new ScholarshipBeanList();
        List<ScholarshipBean> scholarshipBeans = scholarshipService.selectAllIdAndName();
        int firstScholarshipId = 0;
        if(scholarshipBeans != null){
            logger.info("查询到所有奖学金列表：" + scholarshipBeans.toString());
            firstScholarshipId = scholarshipBeans.get(0).getScholarshipId();
            scholarshipBeanList.setSum(scholarshipBeans.size());
            scholarshipBeanList.setScholarshipBeans(scholarshipBeans);
        }
        model.addAttribute("scholarshipBeanList",scholarshipBeanList);

        if(firstScholarshipId != 0){
            ScholarshipDetailBean scholarshipDetailBean = scholarshipService.selectScholarshipDetail(firstScholarshipId);
            model.addAttribute("scholarshipDetail",scholarshipDetailBean);
            logger.info("显示奖学金：" + scholarshipDetailBean.getScholarshipName());
        }
        return "evaluation/scholarship";
    }

    /**
     * 访问/evaluation/scholarship/{scholarshipId}
     * 通过scholarshipId查询对应奖学金表格详情
     * @param scholarshipId
     * @return
     */
    @RequestMapping(value = "/evaluation/scholarship/{scholarshipId}", method = RequestMethod.GET)
    @ResponseBody
    public ScholarshipDetailBean scholarshipDetail(@PathVariable("scholarshipId") int scholarshipId){
        ScholarshipDetailBean scholarshipDetailBean = scholarshipService.selectScholarshipDetail(scholarshipId);
        logger.info("显示奖学金：" + scholarshipDetailBean.getScholarshipName());
        return scholarshipDetailBean;
    }

	@RequestMapping(value = "/nationalInspirationalScholarship")
	public String nationalInspirationalScholarship(Model model){
		return "scholarship/nationalInspirationalScholarship";
	}

	@RequestMapping(value = "/provincialGovernmentScholarship")
	public String provincialGovernmentScholarship(Model model){
		return "scholarship/provincialGovernmentScholarship";
	}

	@RequestMapping(value = "/schoolScholarship")
	public String schoolScholarship(Model model){
		return "scholarship/schoolScholarship";
	}

	@RequestMapping(value = "/tripleAStudent")
	public String tripleAStudent(Model model){
		return "scholarship/tripleAStudent";
	}

	@RequestMapping(value = "/changePassword")
	public String changePassword(Model model){
		return "scholarship/changePassword";
	}
}
