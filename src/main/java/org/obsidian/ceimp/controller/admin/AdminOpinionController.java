package org.obsidian.ceimp.controller.admin;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ManagerBean;
import org.obsidian.ceimp.entity.ScholarshipOpinion;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by BillChen on 2017/10/16.
 */
@Controller
public class AdminOpinionController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private NationalinspirationalscholarshipService nationalinspirationalscholarshipService;

    @Autowired
    private ProvincialgovernmentscholarshipService provincialgovernmentscholarshipService;

    @Autowired
    private SchoolscholarshipService schoolscholarshipService;

    @Autowired
    private TripleastudentService tripleastudentService;

    @Autowired
    private ScholarshipOpinionSerivce scholarshipOpinionSerivce;

    @RequestMapping(value = "/m/admin/opinion/nationalinspirationalscholarship",method = RequestMethod.GET)
    public String writeNationalinspirationalscholarship(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeNationalinspirationalscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/provincialgovernmentscholarship",method = RequestMethod.GET)
    public String writeProvincialgovernmentscholarship(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeProvincialgovernmentscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/schoolscholarship",method = RequestMethod.GET)
    public String writeSchoolscholarship(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeSchoolscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/tripleastudent",method = RequestMethod.GET)
    public String writeTripleastudent(HttpSession session, Model model){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        model.addAttribute("scholarshipOpinionBean",scholarshipOpinion);
        return "scholarship/admin/write/writeTripleastudent";
    }



    @RequestMapping(value = "/m/admin/opinion/nationalinspirationalscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeNationalinspirationalscholarshipSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateNationalOpinion(managerId,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/provincialgovernmentscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeProvincialgovernmentscholarshipSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String recommendReason = request.getParameter("recommendReason");
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateProvincialRecommendAndProvincialOpinion(managerId,recommendReason,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/schoolscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeSchoolscholarshipSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateSchoolOpinion(managerId,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/tripleastudent/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeTripleastudentSubmit(HttpSession session,HttpServletRequest request){
        String managerId = ((ManagerBean)session.getAttribute("managerBean")).getManagerId();
        String opinion = request.getParameter("opinion");
        return scholarshipOpinionSerivce.updateTripleaOpinion(managerId,opinion);
    }
}
