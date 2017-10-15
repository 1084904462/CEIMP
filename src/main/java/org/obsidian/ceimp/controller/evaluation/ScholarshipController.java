package org.obsidian.ceimp.controller.evaluation;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.DownloadUtil;
import org.obsidian.ceimp.util.WordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Nationalinspirationalscholarship nationalinspirationalscholarship = nationalinspirationalscholarshipService.selectByUserId(userId);

        NationalinspirationalscholarshipBean nationalinspirationalscholarshipBean = this.getNationalinspirationalscholarshipBean(userss,nationalinspirationalscholarship);
        model.addAttribute("nationalinspirationalscholarshipBean",nationalinspirationalscholarshipBean);
		return "scholarship/nationalInspirationalScholarship";
	}
	@RequestMapping(value = "/u/provincialGovernmentScholarship")
	public String provincialGovernmentScholarship(HttpSession session,Model model){
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Provincialgovernmentscholarship provincialgovernmentscholarship = provincialgovernmentscholarshipService.selectByUserId(userId);

        ProvincialgovernmentscholarshipBean provincialgovernmentscholarshipBean = this.getProvincialgovernmentscholarshipBean(userss,provincialgovernmentscholarship);
        model.addAttribute("provincialgovernmentscholarshipBean",provincialgovernmentscholarshipBean);
        return "scholarship/provincialGovernmentScholarship";
	}
	@RequestMapping(value = "/u/schoolScholarship")
	public String schoolScholarship(HttpSession session,Model model){
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        Userss userss = userssService.selectByUserId(userId);
        Schoolscholarship schoolscholarship = schoolscholarshipService.selectByUserId(userId);

        SchoolscholarshipBean schoolscholarshipBean = this.getSchoolscholarshipBean(userss,schoolscholarship);
        model.addAttribute("schoolscholarshipBean",schoolscholarshipBean);
		return "scholarship/schoolScholarship";
	}
	@RequestMapping(value = "/u/tripleAStudent")
	public String tripleAStudent(HttpSession session,Model model){
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
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



	@RequestMapping(value = "/u/nationalInspirationalScholarship/submit", method = RequestMethod.POST)
    public void nationalInspirationalScholarshipSubmit(HttpSession session,Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        String phone = request.getParameter("phone");
        String sex = request.getParameter("sex");
        String political = request.getParameter("political");
        String birth = request.getParameter("birth");
        String nation = request.getParameter("nation");
        String entrance = request.getParameter("entrance");
        String identity = request.getParameter("identity");
        String passSum = request.getParameter("passSum");
        String subSum = request.getParameter("subSum");
        String date1 = request.getParameter("date1");
        String award1 = request.getParameter("award1");
        String unit1 = request.getParameter("unit1");
        String date2 = request.getParameter("date2");
        String award2 = request.getParameter("award2");
        String unit2 = request.getParameter("unit2");
        String date3 = request.getParameter("date3");
        String award3 = request.getParameter("award3");
        String unit3 = request.getParameter("unit3");
        String date4 = request.getParameter("date4");
        String award4 = request.getParameter("award4");
        String unit4 = request.getParameter("unit4");
        String monthIncome = request.getParameter("monthIncome");
        String resident = request.getParameter("resident");
        String incomeSource = request.getParameter("incomeSource");
        String familySum = request.getParameter("familySum");
        String postalCode = request.getParameter("postalCode");
        String address = request.getParameter("address");
        String situation = request.getParameter("situation");
        String applyReason = request.getParameter("applyReason");
        String opinion = request.getParameter("opinion");
        Nationalinspirationalscholarship nationalinspirationalscholarship = nationalinspirationalscholarshipService.selectByUserId(userId);
        if(nationalinspirationalscholarship == null){
            nationalinspirationalscholarshipService.insertNationalinspirationalscholarship(userId,
                    date1,award1,unit1, date2,award2,unit2,date3,award3,unit3,date4,award4,unit4,resident,
                    incomeSource,monthIncome, familySum,address,postalCode,situation,applyReason,opinion);
        }
        else{
            nationalinspirationalscholarshipService.updateNationalinspirationalscholarship(userId,
                    date1,award1,unit1, date2,award2,unit2,date3,award3,unit3,date4,award4,unit4,resident,
                    incomeSource,monthIncome, familySum,address,postalCode,situation,applyReason,opinion);
        }
        userssService.updateUserss(userId,phone,sex,political,birth,nation,entrance,identity,passSum,subSum);

        Userss userss = userssService.selectByUserId(userId);
        Nationalinspirationalscholarship nationalinspirationalscholarship1 = nationalinspirationalscholarshipService.selectByUserId(userId);
        NationalinspirationalscholarshipBean nationalinspirationalscholarshipBean = this.getNationalinspirationalscholarshipBean(userss,nationalinspirationalscholarship1);
        model.addAttribute("nationalinspirationalscholarshipBean",nationalinspirationalscholarshipBean);
        this.nationalInspirationalScholarshipWord(nationalinspirationalscholarshipBean,response);
//        return "redirect:/u/nationalInspirationalScholarship";
    }
    @RequestMapping(value = "/u/provincialGovernmentScholarship/submit", method = RequestMethod.POST)
    public void provincialGovernmentScholarshipSubmit(HttpSession session,Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        String phone = request.getParameter("phone");
        String sex = request.getParameter("sex");
        String political = request.getParameter("political");
        String birth = request.getParameter("birth");
        String nation = request.getParameter("nation");
        String entrance = request.getParameter("entrance");
        String identity = request.getParameter("identity");
        String passSum = request.getParameter("passSum");
        String subSum = request.getParameter("subSum");
        String date1 = request.getParameter("date1");
        String award1 = request.getParameter("award1");
        String unit1 = request.getParameter("unit1");
        String date2 = request.getParameter("date2");
        String award2 = request.getParameter("award2");
        String unit2 = request.getParameter("unit2");
        String date3 = request.getParameter("date3");
        String award3 = request.getParameter("award3");
        String unit3 = request.getParameter("unit3");
        String date4 = request.getParameter("date4");
        String award4 = request.getParameter("award4");
        String unit4 = request.getParameter("unit4");
        String applyReason = request.getParameter("applyReason");
        String recommendReason = request.getParameter("recommendReason");
        String opinion = request.getParameter("opinion");
        Provincialgovernmentscholarship provincialgovernmentscholarship = provincialgovernmentscholarshipService.selectByUserId(userId);
        if(provincialgovernmentscholarship == null){
            provincialgovernmentscholarshipService.insertProvincialgovernmentscholarship(userId,
                    date1,award1,unit1,date2,award2,unit2,date3,award3,unit3,date4,award4,unit4,applyReason,
                    recommendReason,opinion);
        }
        else{
            provincialgovernmentscholarshipService.updateProvincialgovernmentscholarship(userId,
                    date1,award1,unit1,date2,award2,unit2,date3,award3,unit3,date4,award4,unit4,applyReason,
                    recommendReason,opinion);
        }
        userssService.updateUserss(userId,phone,sex,political,birth,nation,entrance,identity,passSum,subSum);

        Userss userss = userssService.selectByUserId(userId);
        Provincialgovernmentscholarship provincialgovernmentscholarship1 = provincialgovernmentscholarshipService.selectByUserId(userId);
        ProvincialgovernmentscholarshipBean provincialgovernmentscholarshipBean = this.getProvincialgovernmentscholarshipBean(userss,provincialgovernmentscholarship1);
        model.addAttribute("provincialgovernmentscholarshipBean",provincialgovernmentscholarshipBean);
        this.provincialGovernmentScholarshipWord(provincialgovernmentscholarshipBean,response);
//        return "redirect:/u/provincialGovernmentScholarship";
    }
    @RequestMapping(value = "/u/schoolScholarship/submit", method = RequestMethod.POST)
    public void schoolScholarshipSubmit(HttpSession session,Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        String political = request.getParameter("political");
        String sex = request.getParameter("sex");
        String nation = request.getParameter("nation");
        String job = request.getParameter("job");
        String level = request.getParameter("level");
        String reason = request.getParameter("reason");
        String opinion = request.getParameter("opinion");
        Schoolscholarship schoolscholarship = schoolscholarshipService.selectByUserIdAndLevel(userId,level);
        if(schoolscholarship == null){
            schoolscholarshipService.insertSchoolscholarship(userId,level,reason,opinion);
        }
        else{
            schoolscholarshipService.updateSchoolscholarship(userId,level,reason,opinion);
        }
        userssService.updateUserss(userId,sex,nation,political,job);

        Userss userss = userssService.selectByUserId(userId);
        SchoolscholarshipBean schoolscholarshipBean = this.getSchoolscholarshipBean(userss,level,reason,opinion);
        model.addAttribute("schoolscholarshipBean",schoolscholarshipBean);
        this.schoolScholarshipWord(schoolscholarshipBean,response);
//        return "redirect:/u/schoolScholarship";
    }
	@RequestMapping(value = "/u/tripleAStudent/submit", method = RequestMethod.POST)
    public void tripleAStudentSubmit(HttpSession session,Model model,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        String sex = request.getParameter("sex");
	    String nation = request.getParameter("nation");
	    String political = request.getParameter("political");
	    String job = request.getParameter("job");
	    String reason = request.getParameter("reason");
	    String opinion = request.getParameter("opinion");
        Tripleastudent tripleastudent = tripleastudentService.selectByUserId(userId);
        if(tripleastudent == null){
            tripleastudentService.insertTripleastudent(userId,reason,opinion);
        }
        else{
            tripleastudentService.updateTripleastudent(userId,reason,opinion);
        }
        userssService.updateUserss(userId,sex,nation,political,job);

        Userss userss = userssService.selectByUserId(userId);
        Tripleastudent tripleastudent1 = tripleastudentService.selectByUserId(userId);
	    TripleastudentBean tripleastudentBean = this.getTripleastudentBean(userss,tripleastudent1);
	    model.addAttribute("tripleastudentBean",tripleastudentBean);
	    this.tripleAStudentWord(tripleastudentBean,response);
//	    return "redirect:/u/tripleAStudent";
    }
    @RequestMapping(value = "/u/changedPassword", method = RequestMethod.POST)
    public String changedPassword(HttpSession session, Model model,HttpServletRequest request){
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        String userId = ((UserssBean) session.getAttribute("userssBean")).getUserId();
        Userss userss = userssService.selectByUserId(userId);
        ChangePasswordBean changePasswordBean = null;
        if(userss.getPassword().equals(oldPassword)){
            if(newPassword.length() >= 6){
                if(newPassword.length() <= 16){
                    if(newPassword.equals("888888")){
                        changePasswordBean = new ChangePasswordBean("密码不能设为888888");
                    }
                    else{
                        if(newPassword.equals(confirmPassword)){
                            userssService.updatePassword(userId,newPassword);
                            changePasswordBean = new ChangePasswordBean("密码修改成功");
                            UserssBean userssBean = new UserssBean();
                            userssBean.setUserId(userId);
                            userssBean.setIsChangedPassword(1);
                            session.removeAttribute("userssBean");
                            session.setAttribute("userssBean",userssBean);
                            return "redirect:/u/nationalInspirationalScholarship";
                        }
                        else{
                            changePasswordBean = new ChangePasswordBean("两次新密码输入不相同");
                        }
                    }
                }
                else{
                    changePasswordBean = new ChangePasswordBean("新密码必须小于16位");
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
    public SchoolscholarshipBean getSchoolscholarshipBean(Userss userss,String level,String reason,String opinion){
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
        schoolscholarshipBean.setLevel(level);
        schoolscholarshipBean.setReason(reason);
        schoolscholarshipBean.setOpinion(opinion);
        return schoolscholarshipBean;
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
        if(schoolscholarship != null){
            schoolscholarshipBean.setLevel(schoolscholarship.getLevel());
            schoolscholarshipBean.setReason(schoolscholarship.getReason());
            schoolscholarshipBean.setOpinion(schoolscholarship.getOpinion());
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
            tripleastudentBean.setOpinion(tripleastudent.getOpinion());
        }
        return tripleastudentBean;
    }




    public void nationalInspirationalScholarshipWord(NationalinspirationalscholarshipBean nationalinspirationalscholarshipBean,HttpServletResponse response) throws IOException {
        String identity = nationalinspirationalscholarshipBean.getIdentity();
        char a = 'a';
        String resident = nationalinspirationalscholarshipBean.getResident();
        String situation = nationalinspirationalscholarshipBean.getSituation();
        String inputUrl = null;
        if(resident.equals("城镇") && situation.equals("家庭经济特别困难")){
            inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\国家励志奖学金模板1.docx";
        }
        else if(resident.equals("城镇") && situation.equals("家庭经济一般困难")){
            inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\国家励志奖学金模板2.docx";
        }
        else if(resident.equals("农村") && situation.equals("家庭经济特别困难")){
            inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\国家励志奖学金模板3.docx";
        }
        else if(resident.equals("农村") && situation.equals("家庭经济一般困难")){
            inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\国家励志奖学金模板4.docx";
        }
        String userId = nationalinspirationalscholarshipBean.getUserId();
        String username = nationalinspirationalscholarshipBean.getUsername();
        String outputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\nationalInspirationalScholarship\\" + userId + username + "国家励志奖学金.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("major",nationalinspirationalscholarshipBean.getMajor());
        textMap.put("classId",nationalinspirationalscholarshipBean.getClassId());
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("phone",nationalinspirationalscholarshipBean.getPhone());
        textMap.put("sex",nationalinspirationalscholarshipBean.getSex());
        textMap.put("political",nationalinspirationalscholarshipBean.getPolitical());
        textMap.put("birth",nationalinspirationalscholarshipBean.getBirth());
        textMap.put("nation",nationalinspirationalscholarshipBean.getNation());
        textMap.put("entrance",nationalinspirationalscholarshipBean.getEntrance());
        textMap.put("gpRank",nationalinspirationalscholarshipBean.getGpRank());
        textMap.put("ceRank",nationalinspirationalscholarshipBean.getCeRank());
        textMap.put("passSum",nationalinspirationalscholarshipBean.getPassSum());
        textMap.put("subSum",nationalinspirationalscholarshipBean.getSubSum());
        textMap.put("date1",nationalinspirationalscholarshipBean.getDate1());
        textMap.put("award1",nationalinspirationalscholarshipBean.getAward1());
        textMap.put("unit1",nationalinspirationalscholarshipBean.getUnit1());
        textMap.put("date2",nationalinspirationalscholarshipBean.getDate2());
        textMap.put("award2",nationalinspirationalscholarshipBean.getAward2());
        textMap.put("unit2",nationalinspirationalscholarshipBean.getUnit2());
        textMap.put("date3",nationalinspirationalscholarshipBean.getDate3());
        textMap.put("award3",nationalinspirationalscholarshipBean.getAward3());
        textMap.put("unit3",nationalinspirationalscholarshipBean.getUnit3());
        textMap.put("date4",nationalinspirationalscholarshipBean.getDate4());
        textMap.put("award4",nationalinspirationalscholarshipBean.getAward4());
        textMap.put("unit4",nationalinspirationalscholarshipBean.getUnit4());
        textMap.put("incomeSource",nationalinspirationalscholarshipBean.getIncomeSource());
        textMap.put("monthIncome",nationalinspirationalscholarshipBean.getMonthIncome());
        textMap.put("familySum",nationalinspirationalscholarshipBean.getFamilySum());
        textMap.put("address",nationalinspirationalscholarshipBean.getAddress());
        textMap.put("postalCode",nationalinspirationalscholarshipBean.getPostalCode());
        textMap.put("applyReason",nationalinspirationalscholarshipBean.getApplyReason());
        textMap.put("opinion",nationalinspirationalscholarshipBean.getOpinion());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "国家励志奖学金.docx");
    }
    public void provincialGovernmentScholarshipWord(ProvincialgovernmentscholarshipBean provincialgovernmentscholarshipBean,HttpServletResponse response) throws IOException {
        String identity = provincialgovernmentscholarshipBean.getIdentity();
        char a = 'a';
        String userId = provincialgovernmentscholarshipBean.getUserId();
        String username = provincialgovernmentscholarshipBean.getUsername();
        String inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\省政府奖学金模板.docx";
        String outputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\provincialGovernmentScholarship\\" + userId + username + "省政府奖学金.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("major",provincialgovernmentscholarshipBean.getMajor());
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("phone",provincialgovernmentscholarshipBean.getPhone());
        textMap.put("sex",provincialgovernmentscholarshipBean.getSex());
        textMap.put("political",provincialgovernmentscholarshipBean.getPolitical());
        textMap.put("birth",provincialgovernmentscholarshipBean.getBirth());
        textMap.put("nation",provincialgovernmentscholarshipBean.getNation());
        textMap.put("entrance",provincialgovernmentscholarshipBean.getEntrance());
        textMap.put("gpRank",provincialgovernmentscholarshipBean.getGpRank());
        textMap.put("ceRank",provincialgovernmentscholarshipBean.getCeRank());
        textMap.put("passSum",provincialgovernmentscholarshipBean.getPassSum());
        textMap.put("subSum",provincialgovernmentscholarshipBean.getSubSum());
        textMap.put("date1",provincialgovernmentscholarshipBean.getDate1());
        textMap.put("award1",provincialgovernmentscholarshipBean.getAward1());
        textMap.put("unit1",provincialgovernmentscholarshipBean.getUnit1());
        textMap.put("date2",provincialgovernmentscholarshipBean.getDate2());
        textMap.put("award2",provincialgovernmentscholarshipBean.getAward2());
        textMap.put("unit2",provincialgovernmentscholarshipBean.getUnit2());
        textMap.put("date3",provincialgovernmentscholarshipBean.getDate3());
        textMap.put("award3",provincialgovernmentscholarshipBean.getAward3());
        textMap.put("unit3",provincialgovernmentscholarshipBean.getUnit3());
        textMap.put("date4",provincialgovernmentscholarshipBean.getDate4());
        textMap.put("award4",provincialgovernmentscholarshipBean.getAward4());
        textMap.put("unit4",provincialgovernmentscholarshipBean.getUnit4());
        textMap.put("applyReason",provincialgovernmentscholarshipBean.getApplyReason());
        textMap.put("recommendReason",provincialgovernmentscholarshipBean.getRecommendReason());
        textMap.put("opinion",provincialgovernmentscholarshipBean.getOpinion());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "省政府奖学金.docx");
    }
    public void schoolScholarshipWord(SchoolscholarshipBean schoolscholarshipBean,HttpServletResponse response) throws IOException {
        String userId = schoolscholarshipBean.getUserId();
        String username = schoolscholarshipBean.getUsername();
        String level = schoolscholarshipBean.getLevel();
        String inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\校奖学金模板.docx";
        String outputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\schoolScholarship\\" + userId + username + level + ".docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("classId",schoolscholarshipBean.getMajor() + schoolscholarshipBean.getClassId());
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("sex",schoolscholarshipBean.getSex());
        textMap.put("nation",schoolscholarshipBean.getNation());
        textMap.put("political",schoolscholarshipBean.getPolitical());
        textMap.put("job",schoolscholarshipBean.getJob());
        textMap.put("charact",schoolscholarshipBean.getCharact());
        textMap.put("study",schoolscholarshipBean.getStudy());
        textMap.put("ability",schoolscholarshipBean.getAbility());
        textMap.put("all",schoolscholarshipBean.getAll());
        textMap.put("rank",schoolscholarshipBean.getRank());
        textMap.put("level",level);
        textMap.put("reason",schoolscholarshipBean.getReason());
        textMap.put("opinion",schoolscholarshipBean.getOpinion());
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + level + ".docx");
    }
    public void tripleAStudentWord(TripleastudentBean tripleastudentBean,HttpServletResponse response) throws IOException {
        String userId = tripleastudentBean.getUserId();
        String username = tripleastudentBean.getUsername();
        String inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\三好学生模板.docx";
        String outputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\tripleAStudent\\" + userId + username + "三好学生.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("classId",tripleastudentBean.getMajor() + tripleastudentBean.getClassId());
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("sex",tripleastudentBean.getSex());
        textMap.put("nation",tripleastudentBean.getNation());
        textMap.put("political",tripleastudentBean.getPolitical());
        textMap.put("job",tripleastudentBean.getJob());
        textMap.put("character",tripleastudentBean.getCharacter());
        textMap.put("study",tripleastudentBean.getStudy());
        textMap.put("ability",tripleastudentBean.getAbility());
        textMap.put("all",tripleastudentBean.getAll());
        textMap.put("rank",tripleastudentBean.getRank());
        textMap.put("reason",tripleastudentBean.getReason());
        textMap.put("opinion",tripleastudentBean.getOpinion());
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "三好学生.docx");
    }
}