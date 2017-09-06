package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by BillChen on 2017/8/13.
 */
@Controller
public class TestController {
    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/getYear")
    public String getYear(Model model){
        Long time = TimeUtil.getInstance().getTimeStamp();
        int year = TimeUtil.getInstance().getYear(time);
        System.out.println(year);
        model.addAttribute("year",year);
        return "login";
    }

    @RequestMapping("/getOneDay/{day}")
    public String getOneDay(Model model,@PathVariable("day") String day){
        String dateStr = TimeUtil.getInstance().getTime(TimeUtil.getInstance().getOneDayTimeStamp(day));
        model.addAttribute("day",dateStr);
        return "login";
    }

	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
	    return "test";
    }
}
