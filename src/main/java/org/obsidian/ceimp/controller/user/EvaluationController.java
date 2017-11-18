package org.obsidian.ceimp.controller.user;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BillChen on 2017/11/17.
 */
@Controller
@RequestMapping("/evaluation")
public class EvaluationController {
    private Logger logger = Logger.getLogger(this.getClass());

    @GetMapping("")
    public String pageEvaluation(){
        return "redirect:/evaluation/index";
    }

    @GetMapping("/index")
    public String pageEvaluationIndex(){
        return "user/evaluation/index";
    }
}
