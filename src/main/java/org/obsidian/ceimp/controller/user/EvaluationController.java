package org.obsidian.ceimp.controller.user;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.PasswordBean;
import org.obsidian.ceimp.bean.UserLogBean;
import org.obsidian.ceimp.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BillChen on 2017/11/17.
 */
@Controller
@RequestMapping("/evaluation")
public class EvaluationController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicService userBasicService;

    @GetMapping("")
    public String pageEvaluation(){
        return "redirect:/evaluation/index";
    }

    @GetMapping("/index")
    public String pageEvaluationIndex(){
        return "user/evaluation/index";
    }

    @PostMapping("/changePassword")
    @ResponseBody
    public String changeUserPassword(PasswordBean passwordBean, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Long userId = ((UserLogBean) session.getAttribute("userLogBean")).getUserId();
        return JSON.toJSONString(userBasicService.changeUserPassword(userId,passwordBean));
    }
}
