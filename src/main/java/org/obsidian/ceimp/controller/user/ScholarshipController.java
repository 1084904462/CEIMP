package org.obsidian.ceimp.controller.user;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<AwardBean> awardBeanList = awardService.selectAllByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "进入奖学金首页：" + awardBeanList);
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
        Long isAward = awardService.selectAwardIdByUserIdSubNameAndYearScope(userId,"ng",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        NgBean ngBean = ngService.getNgBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "进入国家助学金页面：" + ngBean);
        model.addAttribute("ngBean",ngBean);
        return "user/scholarship/ng";
    }

    @GetMapping("/nis")
    public String pageNis(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdByUserIdSubNameAndYearScope(userId,"nis",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        NisBean nisBean = nisService.getNisBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "进入国家励志奖学金页面：" + nisBean);
        model.addAttribute("nisBean",nisBean);
        return "user/scholarship/nis";
    }

    @GetMapping("/pgs")
    public String pageNgs(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdByUserIdSubNameAndYearScope(userId,"pgs",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        PgsBean pgsBean = pgsService.getPgsBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "进入省政府奖学金界面：" + pgsBean);
        model.addAttribute("pgsBean",pgsBean);
        return "user/scholarship/pgs";
    }

    @GetMapping("/ss")
    public String pageSs(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdByUserIdSubNameAndYearScope(userId,"ss",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        SsBean ssBean = ssService.getSsBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "进入校奖学金界面：" + ssBean);
        model.addAttribute("ssBean",ssBean);
        return "user/scholarship/ss";
    }

    @GetMapping("/tas")
    public String pageTas(HttpSession session,Model model){
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        int yearScope = TimeUtil.getInstance().getThisYear();
        Long isAward = awardService.selectAwardIdByUserIdSubNameAndYearScope(userId,"tas",yearScope);
        if(isAward == null){
            return "redirect:/scholarship/index";
        }
        TasBean tasBean = tasService.getTasBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "进入三好学生界面：" + tasBean);
        model.addAttribute("tasBean",tasBean);
        return "user/scholarship/tas";
    }

    @PostMapping("/ng")
    public void ngSubmit(NgBean ngBean, HttpSession session, HttpServletResponse response) throws IOException {
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        logger.debug(userId + "提交国家助学金：" + ngBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        Ng ng = ngService.selectByUserIdAndYearScope(userId,yearScope);
        if(ng == null){
            ngService.insertNg(userId,yearScope,ngBean);
            awardService.updateIsFilledByUserIdAndYearScopeAndSubName(userId,yearScope,"ng");
        }
        else{
            ngService.updateNg(userId,yearScope,ngBean);
        }
        NgBean wordNgBean = ngService.getNgBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "生成国家助学金文档：" + wordNgBean);
        ngService.getNgWord(wordNgBean,response);
    }

    @PostMapping("/nis")
    public void nisSubmit(NisBean nisBean,HttpSession session,HttpServletResponse response) throws IOException {
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        logger.debug(userId + "提交国家励志奖学金：" + nisBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        Nis nis = nisService.selectByUserIdAndYearScope(userId,yearScope);
        if(nis == null){
            nisService.insertNis(userId,yearScope,nisBean);
            awardService.updateIsFilledByUserIdAndYearScopeAndSubName(userId,yearScope,"nis");
        }
        else{
            nisService.updateNis(userId,yearScope,nisBean);
        }
        NisBean wordNisBean = nisService.getNisBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "生成国家励志奖学金文档：" + wordNisBean);
        nisService.getNisWord(wordNisBean,response);
    }

    @PostMapping("/pgs")
    public void pgsSubmit(PgsBean pgsBean,HttpSession session,HttpServletResponse response) throws IOException {
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        logger.debug(userId + "提交省政府奖学金：" + pgsBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        Pgs pgs = pgsService.selectByUserIdAndYearScope(userId,yearScope);
        if(pgs == null){
            pgsService.insertPgs(userId,yearScope,pgsBean);
            awardService.updateIsFilledByUserIdAndYearScopeAndSubName(userId,yearScope,"pgs");
        }
        else{
            pgsService.updatePgs(userId,yearScope,pgsBean);
        }
        PgsBean wordPgsBean = pgsService.getPgsBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "生成省政府奖学金文档：" + wordPgsBean);
        pgsService.getPgsWord(wordPgsBean,response);
    }

    @PostMapping("/ss")
    public void ssSubmit(SsBean ssBean,HttpSession session,HttpServletResponse response) throws IOException {
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        logger.debug(userId + "提交校奖学金：" + ssBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        Ss ss = ssService.selectByUserIdAndYearScope(userId,yearScope);
        if(ss == null){
            ssService.insertSs(userId,yearScope,ssBean);
            awardService.updateIsFilledByUserIdAndYearScopeAndSubName(userId,yearScope,"ss");
        }
        else{
            ssService.updateSs(userId,yearScope,ssBean);
        }
        SsBean wordSsBean = ssService.getSsBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "生成校奖学金文档：" + wordSsBean);
        ssService.getSsWord(wordSsBean,response);
    }

    @PostMapping("/tas")
    public void tasSubmit(TasBean tasBean,HttpSession session,HttpServletResponse response) throws IOException {
        Long userId = ((UserLogBean)session.getAttribute("userLogBean")).getUserId();
        logger.debug(userId + "提交三好学生：" + tasBean);
        int yearScope = TimeUtil.getInstance().getThisYear();
        Tas tas = tasService.selectByUserIdAndYearScope(userId,yearScope);
        if(tas == null){
            tasService.insertTas(userId,yearScope,tasBean);
            awardService.updateIsFilledByUserIdAndYearScopeAndSubName(userId,yearScope,"tas");
        }
        else{
            tasService.updateTas(userId,yearScope,tasBean);
        }
        TasBean wordTasBean = tasService.getTasBeanByUserIdAndYearScope(userId,yearScope);
        logger.debug(userId + "生成三好学生文档：" + wordTasBean);
        tasService.getTasWord(wordTasBean,response);
    }
}
