package org.obsidian.ceimp.controller.admin;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.service.TripleastudentService;
import org.obsidian.ceimp.service.UserssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

//    @RequestMapping(value = "/admin/scholarship")
//    public String adminScholarship(Model model){
//        return "admin/scholarship";
//    }

    @RequestMapping(value = "/m/admin/showNationalInspirationalScholarship")
	public String showNationalInspirationalScholarship(Model model){

    	return "scholarship/admin/show/showNationalInspirationalScholarship";
	}
}
