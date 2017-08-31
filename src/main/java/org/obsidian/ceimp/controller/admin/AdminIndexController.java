package org.obsidian.ceimp.controller.admin;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by BillChen on 2017/8/23.
 */
@Controller
public class AdminIndexController {
    private Logger logger = Logger.getLogger(this.getClass());



    @RequestMapping(value = "/admin/index", method = RequestMethod.GET)
    public String adminIndex(){
        return "admin/index";
    }

    public int getAllStudentSum(HttpSession session){
        return 0;
    }
}
