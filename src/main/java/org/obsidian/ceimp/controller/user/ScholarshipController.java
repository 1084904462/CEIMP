package org.obsidian.ceimp.controller.user;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
@Controller
@RequestMapping("/scholarship")
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private AwardService awardService;

    @Autowired
    private NgService ngService;

    @Autowired
    private NisService nisService;

    @Autowired
    private PgsService pgsService;

    @Autowired
    private SsService ssService;

    @Autowired
    private TasService tasService;

    /**
     * 接收/scholarship请求，重定向至/scholarship/index
     * @return
     */
    @GetMapping("")
    public String pageScholarship(){
        return "redirect:/scholarship/index";
    }


    /**
     *
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/index")
    public String pageScholarshipIndex(HttpSession session, Model model){
        Long userId = ((UserLogBean) session.getAttribute("userLogBean")).getUserId();
        logger.info("userId:" + userId);
        Integer yearScope = TimeUtil.getInstance().getThisYear();
        List<AwardBean> awardBeanList = awardService.selectAllByUserIdAndYearScope(userId,yearScope);
        logger.info(awardBeanList);
        model.addAttribute("awardBeanList",awardBeanList);
        return "user/scholarship/index";
    }


    /**
     * 从session中获取userId
     * 默认查询当前综测的国家助学金
     * 如果该用户没有获得国家助学金，则重定向至/scholarship/index
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/ng")
    public String pageNg(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdBySubNameAndYearScope("ng",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        NgBean ngBean = ngService.getNgBeanByUserIdAndYearScope(userId,yearScope);
        logger.info(ngBean);
        model.addAttribute("ngBean",ngBean);
        return "user/scholarship/ng";
    }

    @PostMapping("/ng")
    public String ng(NgBean ngBean,HttpSession session){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        NgBean preNgBean = ngService.getNgBeanByUserIdAndYearScope(userId,yearScope);
        if(preNgBean != null){

        }
    }

    @GetMapping("/nis")
    public String pageNis(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdBySubNameAndYearScope("nis",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        NisBean nisBean = nisService.getNisBeanByUserIdAndYearScope(userId,yearScope);
        logger.info(nisBean);
        model.addAttribute("nisBean",nisBean);
        return "user/scholarship/nis";
    }

    @GetMapping("/pgs")
    public String pageNgs(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdBySubNameAndYearScope("pgs",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        PgsBean pgsBean = pgsService.getPgsBeanByUserIdAndYearScope(userId,yearScope);
        logger.info(pgsBean);
        model.addAttribute("pgsBean",pgsBean);
        return "user/scholarship/pgs";
    }

    @GetMapping("/ss")
    public String pageSs(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdBySubNameAndYearScope("ss",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        SsBean ssBean = ssService.getSsBeanByUserIdAndYearScope(userId,yearScope);
        logger.info(ssBean);
        model.addAttribute("ssBean",ssBean);
        return "user/scholarship/ss";
    }

    @GetMapping("/tas")
    public String pageTas(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdBySubNameAndYearScope("tas",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        TasBean tasBean = tasService.getTasBeanByUserIdAndYearScope(userId,yearScope);
        logger.info(tasBean);
        model.addAttribute("tasBean",tasBean);
        return "user/scholarship/tas";
    }

}
