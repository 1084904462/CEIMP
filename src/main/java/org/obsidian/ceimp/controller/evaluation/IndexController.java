package org.obsidian.ceimp.controller.evaluation;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by BillChen on 2017/8/23.
 */
@Controller
public class IndexController {
    private Logger logger = Logger.getLogger(this.getClass());

    /**
     * 访问/index
     * 返回index.html
     * @return
     */
    @RequestMapping(value = "/evaluation/index", method = RequestMethod.GET)
    public String index(){
        return "evaluation/index";
    }
}
