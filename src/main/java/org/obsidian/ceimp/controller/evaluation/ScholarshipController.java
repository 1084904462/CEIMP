package org.obsidian.ceimp.controller.evaluation;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BillChen on 2017/9/11.
 */
@Controller
public class ScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private UserssService userssService;

    @Autowired
    private NationalinspirationalscholarshipService nationalinspirationalscholarshipService;

    @Autowired
    private ProvincialgovernmentscholarshipService provincialgovernmentscholarshipService;

    @Autowired
    private SchoolscholarshipService schoolscholarshipService;

    @Autowired
    private TripleastudentService tripleastudentService;


    /**
     * 访问/evaluation/scholarship
     * 返回所有奖学金列表与第一个奖学金详情
     * @param model
     * @return
     */
    @RequestMapping(value = "/evaluation/scholarship", method = RequestMethod.GET)
    public String scholarship(Model model){
        ScholarshipBeanList scholarshipBeanList = new ScholarshipBeanList();
        List<ScholarshipBean> scholarshipBeans = scholarshipService.selectAllIdAndName();
        int firstScholarshipId = 0;
        if(scholarshipBeans != null){
            logger.info("查询到所有奖学金列表：" + scholarshipBeans.toString());
            firstScholarshipId = scholarshipBeans.get(0).getScholarshipId();
            scholarshipBeanList.setSum(scholarshipBeans.size());
            scholarshipBeanList.setScholarshipBeans(scholarshipBeans);
        }
        model.addAttribute("scholarshipBeanList",scholarshipBeanList);

        if(firstScholarshipId != 0){
            ScholarshipDetailBean scholarshipDetailBean = scholarshipService.selectScholarshipDetail(firstScholarshipId);
            model.addAttribute("scholarshipDetail",scholarshipDetailBean);
            logger.info("显示奖学金：" + scholarshipDetailBean.getScholarshipName());
        }
        return "evaluation/scholarship";
    }

    /**
     * 访问/evaluation/scholarship/{scholarshipId}
     * 通过scholarshipId查询对应奖学金表格详情
     * @param scholarshipId
     * @return
     */
    @RequestMapping(value = "/evaluation/scholarship/{scholarshipId}", method = RequestMethod.GET)
    @ResponseBody
    public ScholarshipDetailBean scholarshipDetail(@PathVariable("scholarshipId") int scholarshipId){
        ScholarshipDetailBean scholarshipDetailBean = scholarshipService.selectScholarshipDetail(scholarshipId);
        logger.info("显示奖学金：" + scholarshipDetailBean.getScholarshipName());
        return scholarshipDetailBean;
    }






	@RequestMapping(value = "/u/nationalInspirationalScholarship")
	public String nationalInspirationalScholarship(HttpSession session,Model model){
        UserssBean userssBean = (UserssBean) session.getAttribute("userssBean");
        String userId = userssBean.getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Nationalinspirationalscholarship nationalinspirationalscholarship = nationalinspirationalscholarshipService.selectByUserId(userId);

        NationalinspirationalscholarshipBean nationalinspirationalscholarshipBean = new NationalinspirationalscholarshipBean();
        model.addAttribute("nationalinspirationalscholarshipBean",nationalinspirationalscholarshipBean);
		return "scholarship/nationalInspirationalScholarship";
	}
	@RequestMapping(value = "/u/provincialGovernmentScholarship")
	public String provincialGovernmentScholarship(HttpSession session,Model model){
        UserssBean userssBean = (UserssBean) session.getAttribute("userssBean");
        String userId = userssBean.getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Provincialgovernmentscholarship provincialgovernmentscholarship = provincialgovernmentscholarshipService.selectByUserId(userId);

        ProvincialgovernmentscholarshipBean provincialgovernmentscholarshipBean = this.getProvincialgovernmentscholarshipBean(userss,provincialgovernmentscholarship);
        model.addAttribute("provincialgovernmentscholarshipBean",provincialgovernmentscholarshipBean);
        return "scholarship/provincialGovernmentScholarship";
	}
	@RequestMapping(value = "/u/schoolScholarship")
	public String schoolScholarship(HttpSession session,Model model){
        UserssBean userssBean = (UserssBean) session.getAttribute("userssBean");
        String userId = userssBean.getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Schoolscholarship schoolscholarship = schoolscholarshipService.selectByUserId(userId);

        SchoolscholarshipBean schoolscholarshipBean = this.getSchoolscholarshipBean(userss,schoolscholarship);
        model.addAttribute("schoolscholarshipBean",schoolscholarshipBean);
		return "scholarship/schoolScholarship";
	}
	@RequestMapping(value = "/u/tripleAStudent")
	public String tripleAStudent(HttpSession session,Model model){
        UserssBean userssBean = (UserssBean) session.getAttribute("userssBean");
        String userId = userssBean.getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Tripleastudent tripleastudent = tripleastudentService.selectByUserId(userId);
        TripleastudentBean tripleastudentBean = this.getTripleastudentBean(userss,tripleastudent);
        model.addAttribute("tripleastudentBean",tripleastudentBean);
		return "scholarship/tripleAStudent";
	}
	@RequestMapping(value = "/u/changePassword", method = RequestMethod.GET)
    private String changePassword(){
	    return "scholarship/changePassword";
    }
	@RequestMapping(value = "/u/changedPassword", method = RequestMethod.POST)
	public String changedPassword(HttpSession session, Model model,
                                 @RequestParam(value = "oldPassword")String oldPassword,
                                 @RequestParam(value = "newPassword")String newPassword,
                                 @RequestParam(value = "confirmPassword")String confirmPassword){
        UserssBean userssBean = (UserssBean) session.getAttribute("userssBean");
        String userId = userssBean.getUserId();
        Userss userss = userssService.selectByUserId(userId);
        ChangePasswordBean changePasswordBean = null;
        if(userss.getPassword().equals(oldPassword)){
            if(newPassword.length() >= 6){
                if(newPassword.equals("888888")){
                    changePasswordBean = new ChangePasswordBean("密码不能设为888888");
                }
                else{
                    if(newPassword.equals(confirmPassword)){
                        userssService.updatePassword(userId,newPassword);
                        changePasswordBean = new ChangePasswordBean("密码修改成功");
                    }
                    else{
                        changePasswordBean = new ChangePasswordBean("两次新密码输入不相同");
                    }
                }
            }
            else{
                changePasswordBean = new ChangePasswordBean("新密码必须大于6位");
            }
        }
        else{
            changePasswordBean = new ChangePasswordBean("旧密码输入错误");
        }
        model.addAttribute("changePasswordBean",changePasswordBean);
        return "scholarship/changePassword";
	}





	@RequestMapping(value = "/u/tripleAStudent/submit", method = RequestMethod.POST)
    public String tripleAStudentSubmit(HttpSession session,Model model,HttpServletRequest request){
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        String sex = request.getParameter("sex");
	    String nation = request.getParameter("nation");
	    String political = request.getParameter("political");
	    String job = request.getParameter("job");
	    String reason = request.getParameter("reason");
        Tripleastudent tripleastudent = tripleastudentService.selectByUserId(userId);
        if(tripleastudent == null){
            tripleastudentService.insertTripleastudent(userId,reason);
        }
        else{
            tripleastudentService.updateTripleastudent(userId,reason);
        }
        userssService.updateUserss(userId,sex,nation,political,job);

        Userss userss = userssService.selectByUserId(userId);
        Tripleastudent tripleastudent1 = tripleastudentService.selectByUserId(userId);
	    TripleastudentBean tripleastudentBean = this.getTripleastudentBean(userss,tripleastudent1);
	    model.addAttribute("tripleastudentBean",tripleastudentBean);
	    return "redirect:/u/tripleAStudent";
    }




    public NationalinspirationalscholarshipBean getNationalinspirationalscholarshipBean(Userss userss,Nationalinspirationalscholarship nationalinspirationalscholarship){
        NationalinspirationalscholarshipBean nationalinspirationalscholarshipBean = new NationalinspirationalscholarshipBean();
        nationalinspirationalscholarshipBean.setMajor(userss.getMajor());
        nationalinspirationalscholarshipBean.setClassId(userss.getClassId());
        nationalinspirationalscholarshipBean.setUsername(userss.getUsername());
        nationalinspirationalscholarshipBean.setSex(userss.getSex());
        nationalinspirationalscholarshipBean.setBirth(userss.getBirth());
        nationalinspirationalscholarshipBean.setUserId(userss.getUserId());
        nationalinspirationalscholarshipBean.setNation(userss.getNation());
        nationalinspirationalscholarshipBean.setEntrance(userss.getEntrance());
        nationalinspirationalscholarshipBean.setPolitical(userss.getPolitical());
        nationalinspirationalscholarshipBean.setPhone(userss.getPhone());
        nationalinspirationalscholarshipBean.setIdentity(userss.getIdentity());
        nationalinspirationalscholarshipBean.setGpRank(userss.getGp() + "/" + userss.getMajorSum());
        nationalinspirationalscholarshipBean.setPassSum(userss.getPassSum());
        nationalinspirationalscholarshipBean.setSubSum(userss.getSubSum());
        nationalinspirationalscholarshipBean.setCeRank(userss.getCe() + "/" + userss.getMajorSum());
        if(nationalinspirationalscholarship != null){
            nationalinspirationalscholarshipBean.setDate1(nationalinspirationalscholarship.getDate1());
            nationalinspirationalscholarshipBean.setAward1(nationalinspirationalscholarship.getAward1());
            nationalinspirationalscholarshipBean.setUnit1(nationalinspirationalscholarship.getUnit1());
            nationalinspirationalscholarshipBean.setDate2(nationalinspirationalscholarship.getDate2());
            nationalinspirationalscholarshipBean.setAward2(nationalinspirationalscholarship.getAward2());
            nationalinspirationalscholarshipBean.setUnit2(nationalinspirationalscholarship.getUnit2());
            nationalinspirationalscholarshipBean.setDate3(nationalinspirationalscholarship.getDate3());
            nationalinspirationalscholarshipBean.setAward3(nationalinspirationalscholarship.getAward3());
            nationalinspirationalscholarshipBean.setUnit3(nationalinspirationalscholarship.getUnit3());
            nationalinspirationalscholarshipBean.setDate4(nationalinspirationalscholarship.getDate4());
            nationalinspirationalscholarshipBean.setAward4(nationalinspirationalscholarship.getAward4());
            nationalinspirationalscholarshipBean.setUnit4(nationalinspirationalscholarship.getUnit4());
            nationalinspirationalscholarshipBean.setResident(nationalinspirationalscholarship.getResident());
            nationalinspirationalscholarshipBean.setIncomeSource(nationalinspirationalscholarship.getIncomesource());
            nationalinspirationalscholarshipBean.setMonthIncome(nationalinspirationalscholarship.getMonthincome());
            nationalinspirationalscholarshipBean.setFamilySum(nationalinspirationalscholarship.getFamilysum());
            nationalinspirationalscholarshipBean.setAddress(nationalinspirationalscholarship.getAddress());
            nationalinspirationalscholarshipBean.setPostalCode(nationalinspirationalscholarship.getPostalcode());
            nationalinspirationalscholarshipBean.setSituation(nationalinspirationalscholarship.getSituation());
            nationalinspirationalscholarshipBean.setApplyReason(nationalinspirationalscholarship.getApplyreason());
            nationalinspirationalscholarshipBean.setOpinion(nationalinspirationalscholarship.getOpinion());
        }
        return nationalinspirationalscholarshipBean;
    }
    public ProvincialgovernmentscholarshipBean getProvincialgovernmentscholarshipBean(Userss userss,Provincialgovernmentscholarship provincialgovernmentscholarship ){
        ProvincialgovernmentscholarshipBean provincialgovernmentscholarshipBean = new ProvincialgovernmentscholarshipBean();
        provincialgovernmentscholarshipBean.setUserId(userss.getUserId());
        provincialgovernmentscholarshipBean.setUsername(userss.getUsername());
        provincialgovernmentscholarshipBean.setSex(userss.getSex());
        provincialgovernmentscholarshipBean.setBirth(userss.getBirth());
        provincialgovernmentscholarshipBean.setPolitical(userss.getPolitical());
        provincialgovernmentscholarshipBean.setNation(userss.getNation());
        provincialgovernmentscholarshipBean.setEntrance(userss.getEntrance());
        provincialgovernmentscholarshipBean.setMajor(userss.getMajor());
        provincialgovernmentscholarshipBean.setClassId(userss.getClassId());
        provincialgovernmentscholarshipBean.setPhone(userss.getPhone());
        provincialgovernmentscholarshipBean.setIdentity(userss.getIdentity());
        provincialgovernmentscholarshipBean.setGpRank(userss.getGp() + "/" + userss.getMajorSum());
        provincialgovernmentscholarshipBean.setPassSum(userss.getPassSum());
        provincialgovernmentscholarshipBean.setSubSum(userss.getSubSum());
        provincialgovernmentscholarshipBean.setCeRank(userss.getCe() + "/" + userss.getMajorSum());
        if(provincialgovernmentscholarship != null){
            provincialgovernmentscholarshipBean.setDate1(provincialgovernmentscholarship.getDate1());
            provincialgovernmentscholarshipBean.setAward1(provincialgovernmentscholarship.getAward1());
            provincialgovernmentscholarshipBean.setUnit1(provincialgovernmentscholarship.getUnit1());
            provincialgovernmentscholarshipBean.setDate2(provincialgovernmentscholarship.getDate2());
            provincialgovernmentscholarshipBean.setAward2(provincialgovernmentscholarship.getAward2());
            provincialgovernmentscholarshipBean.setUnit2(provincialgovernmentscholarship.getUnit2());
            provincialgovernmentscholarshipBean.setDate3(provincialgovernmentscholarship.getDate3());
            provincialgovernmentscholarshipBean.setAward3(provincialgovernmentscholarship.getAward3());
            provincialgovernmentscholarshipBean.setUnit3(provincialgovernmentscholarship.getUnit3());
            provincialgovernmentscholarshipBean.setDate4(provincialgovernmentscholarship.getDate4());
            provincialgovernmentscholarshipBean.setAward4(provincialgovernmentscholarship.getAward4());
            provincialgovernmentscholarshipBean.setUnit4(provincialgovernmentscholarship.getUnit4());
            provincialgovernmentscholarshipBean.setApplyReason(provincialgovernmentscholarship.getApplyreason());
            provincialgovernmentscholarshipBean.setRecommendReason(provincialgovernmentscholarship.getRecommendreason());
            provincialgovernmentscholarshipBean.setOpinion(provincialgovernmentscholarship.getOpinion());
        }
        return provincialgovernmentscholarshipBean;
    }
    public SchoolscholarshipBean getSchoolscholarshipBean(Userss userss,Schoolscholarship schoolscholarship){
        SchoolscholarshipBean schoolscholarshipBean = new SchoolscholarshipBean();
        schoolscholarshipBean.setMajor(userss.getMajor());
        schoolscholarshipBean.setClassId(userss.getClassId());
        schoolscholarshipBean.setUserId(userss.getUserId());
        schoolscholarshipBean.setUsername(userss.getUsername());
        schoolscholarshipBean.setSex(userss.getSex());
        schoolscholarshipBean.setNation(userss.getNation());
        schoolscholarshipBean.setPolitical(userss.getPolitical());
        schoolscholarshipBean.setJob(userss.getJob());
        schoolscholarshipBean.setCharact(userss.getCharacter());
        schoolscholarshipBean.setStudy(userss.getStudy());
        schoolscholarshipBean.setAbility(userss.getAbility());
        schoolscholarshipBean.setAll(userss.getAll());
        schoolscholarshipBean.setRank(userss.getCe() + "/" + userss.getMajorSum());
        if(schoolscholarship != null) {
            schoolscholarshipBean.setLevel(schoolscholarship.getLevel());
            schoolscholarshipBean.setReason(schoolscholarship.getReason());
        }
        return schoolscholarshipBean;
    }
    public TripleastudentBean getTripleastudentBean(Userss userss,Tripleastudent tripleastudent){
        TripleastudentBean tripleastudentBean = new TripleastudentBean();
        tripleastudentBean.setUserId(userss.getUserId());
        tripleastudentBean.setUsername(userss.getUsername());
        tripleastudentBean.setMajor(userss.getMajor());
        tripleastudentBean.setClassId(userss.getClassId());
        tripleastudentBean.setPolitical(userss.getPolitical());
        tripleastudentBean.setSex(userss.getSex());
        tripleastudentBean.setNation(userss.getNation());
        tripleastudentBean.setJob(userss.getJob());
        tripleastudentBean.setCharacter(userss.getCharacter());
        tripleastudentBean.setStudy(userss.getStudy());
        tripleastudentBean.setAbility(userss.getAbility());
        tripleastudentBean.setAll(userss.getAll());
        tripleastudentBean.setRank(userss.getCe() + "/" + userss.getMajorSum());
        if(tripleastudent != null){
            tripleastudentBean.setReason(tripleastudent.getReason());
        }
        return tripleastudentBean;
    }
<<<<<<< HEAD
}
=======

	@RequestMapping(value = "/u/changedPassword", method = RequestMethod.POST)
	public String changedPassword(HttpSession session, Model model,
                                 @RequestParam(value = "oldPassword")String oldPassword,
                                 @RequestParam(value = "newPassword")String newPassword,
                                 @RequestParam(value = "confirmPassword")String confirmPassword){
        UserssBean userssBean = (UserssBean) session.getAttribute("userssBean");
        String userId = userssBean.getUserId();
        Userss userss = userssService.selectByUserId(userId);
        ChangePasswordBean changePasswordBean = null;
        if(userss.getPassword().equals(oldPassword)){
            if(newPassword.length() >= 6){
                if(newPassword.equals("888888")){
                    changePasswordBean = new ChangePasswordBean("密码不能设为888888");
                }
                else{
                    if(newPassword.equals(confirmPassword)){
                        userssService.updatePassword(userId,newPassword);
                        changePasswordBean = new ChangePasswordBean("密码修改成功");
                    }
                    else{
                        changePasswordBean = new ChangePasswordBean("两次新密码输入不相同");
                    }
                }
            }
            else{
                changePasswordBean = new ChangePasswordBean("新密码必须大于6位");
            }
        }
        else{
            changePasswordBean = new ChangePasswordBean("旧密码输入错误");
        }
        model.addAttribute("changePasswordBean",changePasswordBean);
        return "scholarship/changePassword";
	}
}
>>>>>>> 6686abc91d7f78d5642a2f9cbabd871f763a1994
