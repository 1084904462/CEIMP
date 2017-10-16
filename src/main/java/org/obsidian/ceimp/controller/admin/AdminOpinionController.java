package org.obsidian.ceimp.controller.admin;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.service.NationalinspirationalscholarshipService;
import org.obsidian.ceimp.service.ProvincialgovernmentscholarshipService;
import org.obsidian.ceimp.service.SchoolscholarshipService;
import org.obsidian.ceimp.service.TripleastudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = "/m/admin/opinion/nationalinspirationalscholarship",method = RequestMethod.GET)
    public String writeNationalinspirationalscholarship(){

        return "scholarship/admin/write/writeNationalinspirationalscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/provincialgovernmentscholarship",method = RequestMethod.GET)
    public String writeProvincialgovernmentscholarship(){

        return "scholarship/admin/write/writeProvincialgovernmentscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/schoolscholarship",method = RequestMethod.GET)
    public String writeSchoolscholarship(){

        return "scholarship/admin/write/writeSchoolscholarship";
    }
    @RequestMapping(value = "/m/admin/opinion/tripleastudent",method = RequestMethod.GET)
    public String writeTripleastudent(){

        return "scholarship/admin/write/writeTripleastudent";
    }



    @RequestMapping(value = "/m/admin/opinion/nationalinspirationalscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeNationalinspirationalscholarshipSubmit(HttpServletRequest request){
        String opinion = request.getParameter("opinion");
        return nationalinspirationalscholarshipService.updateAllOpinion(opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/provincialgovernmentscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeProvincialgovernmentscholarshipSubmit(HttpServletRequest request){
        String recommendReason = request.getParameter("recommendReason");
        String opinion = request.getParameter("opinion");
        return provincialgovernmentscholarshipService.updateAllRecommendReasonAndOpinion(recommendReason,opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/schoolscholarship/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeSchoolscholarshipSubmit(HttpServletRequest request){
        String opinion = request.getParameter("opinion");
        return schoolscholarshipService.updateAllOpinion(opinion);
    }
    @RequestMapping(value = "/m/admin/opinion/tripleastudent/submit",method = RequestMethod.POST)
    @ResponseBody
    public int writeTripleastudentSubmit(HttpServletRequest request){
        String opinion = request.getParameter("opinion");
        return tripleastudentService.updateAllOpinion(opinion);
    }
}
