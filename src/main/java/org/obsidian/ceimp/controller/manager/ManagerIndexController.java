package org.obsidian.ceimp.controller.manager;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BillChen on 2017/11/17.
 */
@Controller
@RequestMapping("/manager")
public class ManagerIndexController {
    private Logger logger = Logger.getLogger(this.getClass());

    @GetMapping("")
    public String manager(){
        return "redirect:/manager/index";
    }

    @GetMapping("/index")
    public String managerIndex(){
        return "manager/index";
    }

    @GetMapping("/writeOpinion")
    public String writeOpinion(){
        return "manager/writeOpinion";
    }
}
