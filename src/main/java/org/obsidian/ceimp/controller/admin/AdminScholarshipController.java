package org.obsidian.ceimp.controller.admin;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.NationalinspirationalscholarshipShowBean;
import org.obsidian.ceimp.bean.ProvincialgovernmentscholarshipShowBean;
import org.obsidian.ceimp.bean.SchoolscholarshipShowBean;
import org.obsidian.ceimp.bean.TripleastudentShowBean;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by BillChen on 2017/9/11.
 */
@Controller
public class AdminScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private UserssService userssService;

    @Autowired
    private TripleastudentService tripleastudentService;

    @Autowired
    private NationalinspirationalscholarshipService nationalinspirationalscholarshipService;

    @Autowired
    private ProvincialgovernmentscholarshipService provincialgovernmentscholarshipService;

    @Autowired
    private SchoolscholarshipService schoolscholarshipService;

//    @RequestMapping(value = "/admin/scholarship")
//    public String adminScholarship(Model model){
//        return "admin/scholarship";
//    }

    @RequestMapping(value = "/m/admin/showNationalInspirationalScholarship")
	public String showNationalInspirationalScholarship(Model model){
        List<NationalinspirationalscholarshipShowBean> list = nationalinspirationalscholarshipService.selectAllNationalinspirationalscholarship();
    	model.addAttribute("nationalinspirationalscholarshipShowBean",list);
        return "scholarship/admin/show/showNationalInspirationalScholarship";
	}
	@RequestMapping(value = "/m/admin/showProvincialgovernmentscholarship")
    public String showProvincialgovernmentscholarship(Model model){
	    List<ProvincialgovernmentscholarshipShowBean> list = provincialgovernmentscholarshipService.selectAllProvincialgovernmentscholarship();
        model.addAttribute("provincialgovernmentscholarshipShowBean",list);
        return "scholarship/admin/show/showProvincialgovernmentscholarship";
	}
	@RequestMapping(value = "/m/admin/showSchoolscholarship")
    public String showSchoolscholarship(Model model){
        List<SchoolscholarshipShowBean> list = schoolscholarshipService.selectAllSchoolscholarship();
        model.addAttribute("schoolscholarshipShowBean",list);
        return "scholarship/admin/show/showSchoolscholarship";
    }
	@RequestMapping(value = "/m/admin/showTripleastudent")
    public String showTripleastudent(Model model){
        List<TripleastudentShowBean> list = tripleastudentService.selectAllTripleastudent();
        model.addAttribute("tripleastudentShowBean",list);
        return "scholarship/admin/show/showTripleastudent";
    }
}
