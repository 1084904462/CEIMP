package org.obsidian.ceimp.controller;

import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BillChen on 2017/8/13.
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String getTime(Model model){
        Long time = TimeUtil.getInstance().getTimeStamp();
        System.out.println(time);
        String now = TimeUtil.getInstance().getTime(time);
        System.out.println(now);
        model.addAttribute("time",now);
        return "index";
    }
}
