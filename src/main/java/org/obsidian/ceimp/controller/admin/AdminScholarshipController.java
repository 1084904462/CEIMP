package org.obsidian.ceimp.controller.admin;

import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.DeleteUtil;
import org.obsidian.ceimp.util.DownloadUtil;
import org.obsidian.ceimp.util.WordUtil;
import org.obsidian.ceimp.util.ZipUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/9/11.
 */
@Controller
public class AdminScholarshipController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private UserssService userssService;

    @Autowired
    private TripleastudentService tripleastudentService;

    @Autowired
    private NationalinspirationalscholarshipService nationalinspirationalscholarshipService;

    @Autowired
    private ProvincialgovernmentscholarshipService provincialgovernmentscholarshipService;

    @Autowired
    private SchoolscholarshipService schoolscholarshipService;

    @Autowired
    private ScholarshipOpinionSerivce scholarshipOpinionSerivce;

    @Autowired
    private NationalGrantService nationalGrantService;

//    @RequestMapping(value = "/admin/scholarship")
//    public String adminScholarship(Model model){
//        return "admin/scholarship";
//    }

    @RequestMapping(value = "/m/admin/showNationalInspirationalScholarship", method = RequestMethod.GET)
	public String showNationalInspirationalScholarship(Model model){
        List<NationalinspirationalscholarshipShowBean> list = nationalinspirationalscholarshipService.selectAllNationalinspirationalscholarship();
    	model.addAttribute("nationalinspirationalscholarshipShowBean",list);
        return "scholarship/admin/show/showNationalInspirationalScholarship";
	}
	@RequestMapping(value = "/m/admin/showProvincialgovernmentscholarship", method = RequestMethod.GET)
    public String showProvincialgovernmentscholarship(Model model){
	    List<ProvincialgovernmentscholarshipShowBean> list = provincialgovernmentscholarshipService.selectAllProvincialgovernmentscholarship();
        model.addAttribute("provincialgovernmentscholarshipShowBean",list);
        return "scholarship/admin/show/showProvincialgovernmentscholarship";
	}
	@RequestMapping(value = "/m/admin/showSchoolscholarship", method = RequestMethod.GET)
    public String showSchoolscholarship(Model model){
        List<SchoolscholarshipShowBean> list = schoolscholarshipService.selectAllSchoolscholarship();
        model.addAttribute("schoolscholarshipShowBean",list);
        return "scholarship/admin/show/showSchoolscholarship";
    }
	@RequestMapping(value = "/m/admin/showTripleastudent", method = RequestMethod.GET)
    public String showTripleastudent(Model model){
        List<TripleastudentShowBean> list = tripleastudentService.selectAllTripleastudent();
        model.addAttribute("tripleastudentShowBean",list);
        return "scholarship/admin/show/showTripleastudent";
    }
    @RequestMapping(value = "/m/admin/showNationalGrant", method = RequestMethod.GET)
    public String showNationalGrant(Model model){
        List<NationalGrantShowBean> list = nationalGrantService.selectAllNationalGrant();
        model.addAttribute("nationalGrantShowBean",list);
        return "scholarship/admin/show/showNationalGrant";
    }


    @RequestMapping(value = "/m/admin/zip", method = RequestMethod.GET)
    public void zip(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String jsonStr = request.getParameter("zipBean");
        List<ZipBean> zipBeans = new ArrayList<>(JSONArray.parseArray(jsonStr, ZipBean.class));
        List<String> list = new ArrayList<>();
        List<String> userIdList = new ArrayList<>();
        List<String> awardList = new ArrayList<>();
        for(int i=0;i<zipBeans.size();i++){
            userIdList.add(zipBeans.get(i).getUserId());
            awardList.add(zipBeans.get(i).getAward());
            list.add(zipBeans.get(i).getUserId() + zipBeans.get(i).getUsername() + zipBeans.get(i).getAward());
        }
        System.out.println(list);
        ZipBean zipBean = zipBeans.get(0);
        String award = "";
        String awardName = "";
        if(zipBean.getAward().equals("国家励志奖学金")){
            award = "nationalInspirationalScholarship";
            awardName = "国家励志奖学金";
        }
        else if(zipBean.getAward().equals("国家助学金")){
            award = "nationalGrant";
            awardName = "国家助学金";
        }
        else if(zipBean.getAward().equals("省政府奖学金")){
            award = "provincialGovernmentScholarship";
            awardName = "省政府奖学金";
        }
        else if(zipBean.getAward().equals("三好学生")){
            award = "tripleAStudent";
            awardName = "三好学生";
        }
        else{
            award = "schoolScholarship";
            awardName = "校奖学金";
        }

        String wordModelUrl = "";
        String wordOutputUrl = "";
        for(int i=0;i<list.size();i++){
            //本地路径
            wordOutputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" + award + "\\" + list.get(i) + ".docx";
            //服务器路径Windows
//            wordOutputUrl = System.getProperty("user.dir") + "\\classes\\award\\" + award + "\\" + list.get(i) + ".docx";
            //服务器路径Linux
//            wordOutputUrl = System.getProperty("user.dir") + "/classes/award/" + award + "/" + list.get(i) + ".docx";
            if(awardName.equals("国家励志奖学金")){
                Nationalinspirationalscholarship nationalinspirationalscholarship = nationalinspirationalscholarshipService.selectByUserId(userIdList.get(i));
                String resident = nationalinspirationalscholarship.getResident();
                String situation = nationalinspirationalscholarship.getSituation();
                if(resident.equals("城镇") && situation.equals("家庭经济特别困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板1.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板1.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板1.docx";
                }
                else if(resident.equals("城镇") && situation.equals("家庭经济一般困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板2.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板2.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板2.docx";
                }
                else if(resident.equals("农村") && situation.equals("家庭经济特别困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板3.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板3.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板3.docx";
                }
                else if(resident.equals("农村") && situation.equals("家庭经济一般困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板4.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板4.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板4.docx";
                }
            }
            else if(awardName.equals("国家助学金")){
                NationalGrant nationalGrant = nationalGrantService.selectByUserId(userIdList.get(i));
                String resident = nationalGrant.getResident();
                String situation = nationalGrant.getSituation();
                if(resident.equals("城镇") && situation.equals("家庭经济特别困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板1.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板1.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板1.docx";
                }
                else if(resident.equals("城镇") && situation.equals("家庭经济一般困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板2.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板2.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板2.docx";
                }
                else if(resident.equals("农村") && situation.equals("家庭经济特别困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板3.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板3.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板3.docx";
                }
                else if(resident.equals("农村") && situation.equals("家庭经济一般困难")){
                    //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板4.docx";
                    //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板4.docx";
                    //服务器路径Linux
//                    wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板4.docx";
                }
            }
            else{
                //本地路径
                    wordModelUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\model\\" + awardName + "模板.docx";
                //服务器路径Windows
//                    wordModelUrl = System.getProperty("user.dir") + "\\classes\\model\\" + awardName + "模板.docx";
                //服务器路径Linux
//                wordModelUrl = System.getProperty("user.dir") + "/classes/model/" + awardName + "模板.docx";
            }
            Map<String,String> textMap = this.getTextMap(awardName,userIdList.get(i),awardList.get(i));
            System.out.println("wordModelUrl:" + wordModelUrl);
            System.out.println("wordOutputUrl" + wordOutputUrl);
            System.out.println(textMap.toString());
            WordUtil.getInstance().generateWord(wordModelUrl,wordOutputUrl,textMap);
        }
        //服务器路径Windows
//        String inputUrl = System.getProperty("user.dir") + "\\classes\\award\\" + award;
//        String outputUrl = System.getProperty("user.dir") + "\\classes\\award\\zip";
        //服务器路径Linux
//        String inputUrl = System.getProperty("user.dir") + "/classes/award/" + award;
//        String outputUrl = System.getProperty("user.dir") + "/classes/award/zip";
        //本地路径
        String inputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" + award;
        String outputUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\zip";

        ZipUtil.getInstance().zip(inputUrl,outputUrl,awardName,list);

        //Windows
        DownloadUtil.getInstance().download(outputUrl + "\\" + awardName + ".zip",response,awardName + ".zip");
        DeleteUtil.getInstance().delete(outputUrl + "\\" + awardName + ".zip");

        //Linux
//        DownloadUtil.getInstance().download(outputUrl + "/" + awardName + ".zip",response,awardName + ".zip");
//        DeleteUtil.getInstance().delete(outputUrl + "/" + awardName + ".zip");
    }
    @RequestMapping(value = "/m/admin/delete", method = RequestMethod.GET)
    @ResponseBody
    public int delete(HttpServletRequest request){
        int isDelete = 0;
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String award = request.getParameter("award");
        String awardUrl = "";
        if(award.equals("国家励志奖学金")){
            //服务器路径Windows
//            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
//                    "nationalInspirationalScholarship\\" + userId + username + award + ".docx";
            //服务器路径Linux
//            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
//                    "nationalInspirationalScholarship/" + userId + username + award + ".docx";

            //本地路径
            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
                    "nationalInspirationalScholarship\\" + userId + username + award + ".docx";
            nationalinspirationalscholarshipService.deleteNationalinspirationalscholarship(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else if(award.equals("国家助学金")){
            //服务器路径Windows
//            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
//                    "nationalGrant\\" + userId + username + award + ".docx";
            //服务器路径Linux
//            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
//                    "nationalGrant/" + userId + username + award + ".docx";

            //本地路径
            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
                    "nationalGrant\\" + userId + username + award + ".docx";
            nationalGrantService.deleteNationalGrant(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else if(award.equals("省政府奖学金")){
            //服务器路径Windows
            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
                    "provincialGovernmentScholarship\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "provincialGovernmentScholarship/" + userId + username + award + ".docx";

            //本地路径
            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
                    "provincialGovernmentScholarship\\" + userId + username + award + ".docx";
            provincialgovernmentscholarshipService.deleteProvincialgovernmentscholarship(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else if(award.equals("三好学生")){
            //服务器路径Windows
            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
                    "tripleAStudent\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "tripleAStudent/" + userId + username + award + ".docx";

            //本地路径
            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
                    "tripleAStudent\\" + userId + username + award + ".docx";
            tripleastudentService.deleteTripleastudent(userId);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        else{
            //服务器路径Windows
            awardUrl = System.getProperty("user.dir") + "\\classes\\award\\" +
                    "schoolScholarship\\" + userId + username + award + ".docx";
            //服务器路径Linux
            awardUrl = System.getProperty("user.dir") + "/classes/award/" +
                    "schoolScholarship/" + userId + username + award + ".docx";

            //本地路径
            awardUrl = System.getProperty("user.dir") + "\\CEIMP\\src\\main\\resources\\award\\" +
                    "schoolScholarship\\" + userId + username + award + ".docx";
            schoolscholarshipService.deleteSchoolscholarshipByUserIdAndLevel(userId,award);
            DeleteUtil.getInstance().delete(awardUrl);
            isDelete = 1;
        }
        return isDelete;
    }


    public Map<String,String> getTextMap(String awardName,String userId,String award){
        Map<String,String> textMap = new HashMap<>();
        Userss userss = userssService.selectByUserId(userId);
        String managerId = "";
        if(userss.getMajor().equals("信息大类")){
            managerId = "112021";
        }
        else{
            managerId = "114046";
        }
        ScholarshipOpinion scholarshipOpinion = scholarshipOpinionSerivce.selectByManagerId(managerId);
        if(awardName.equals("国家励志奖学金")){
            String identity = userss.getIdentity();
            char a = 'a';
            Nationalinspirationalscholarship nationalinspirationalscholarship = nationalinspirationalscholarshipService.selectByUserId(userId);
            textMap.put("major",userss.getMajor());
            textMap.put("classId",userss.getClassId());
            textMap.put("username",userss.getUsername());
            textMap.put("userId",userId);
            textMap.put("phone",userss.getPhone());
            textMap.put("sex",userss.getSex());
            textMap.put("political",userss.getPolitical());
            textMap.put("birth",userss.getBirth());
            textMap.put("nation",userss.getNation());
            textMap.put("entrance",userss.getEntrance());
            textMap.put("gpRank",userss.getGp() + "/" + userss.getMajorSum());
            textMap.put("ceRank",userss.getCe() + "/" + userss.getMajorSum());
            textMap.put("passSum",userss.getPassSum());
            textMap.put("subSum",userss.getSubSum());
            textMap.put("date1",nationalinspirationalscholarship.getDate1());
            textMap.put("award1",nationalinspirationalscholarship.getAward1());
            textMap.put("unit1",nationalinspirationalscholarship.getUnit1());
            textMap.put("date2",nationalinspirationalscholarship.getDate2());
            textMap.put("award2",nationalinspirationalscholarship.getAward2());
            textMap.put("unit2",nationalinspirationalscholarship.getUnit2());
            textMap.put("date3",nationalinspirationalscholarship.getDate3());
            textMap.put("award3",nationalinspirationalscholarship.getAward3());
            textMap.put("unit3",nationalinspirationalscholarship.getUnit3());
            textMap.put("date4",nationalinspirationalscholarship.getDate4());
            textMap.put("award4",nationalinspirationalscholarship.getAward4());
            textMap.put("unit4",nationalinspirationalscholarship.getUnit4());
            textMap.put("incomeSource",nationalinspirationalscholarship.getIncomesource());
            textMap.put("monthIncome",nationalinspirationalscholarship.getMonthincome());
            textMap.put("familySum",nationalinspirationalscholarship.getFamilysum());
            textMap.put("address",nationalinspirationalscholarship.getAddress());
            textMap.put("postalCode",nationalinspirationalscholarship.getPostalcode());
            textMap.put("applyReason",nationalinspirationalscholarship.getApplyreason());
            textMap.put("opinion",scholarshipOpinion.getNationalOpinion());
            for(int i=0;i<18;i++){
                textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
            }
        }
        else if(awardName.equals("国家助学金")){
            String identity = userss.getIdentity();
            char a = 'a';
            NationalGrant nationalGrant = nationalGrantService.selectByUserId(userId);
            textMap.put("major",userss.getMajor());
            textMap.put("classId",userss.getClassId());
            textMap.put("username",userss.getUsername());
            textMap.put("sex",userss.getSex());
            textMap.put("birth",userss.getBirth());
            textMap.put("userId",userId);
            textMap.put("nation",userss.getNation());
            textMap.put("entrance",userss.getEntrance());
            textMap.put("political",userss.getPolitical());
            textMap.put("phone",userss.getPhone());
            textMap.put("incomeSource",nationalGrant.getIncomeSource());
            textMap.put("monthIncome",nationalGrant.getMonthIncome());
            textMap.put("familySum",nationalGrant.getFamilySum());
            textMap.put("address",nationalGrant.getAddress());
            textMap.put("postalCode",nationalGrant.getPostalCode());
            textMap.put("fName1",nationalGrant.getfName1());
            textMap.put("age1",nationalGrant.getAge1());
            textMap.put("relation1",nationalGrant.getRelation1());
            textMap.put("workPlace1",nationalGrant.getWorkPlace1());
            textMap.put("fName2",nationalGrant.getfName2());
            textMap.put("age2",nationalGrant.getAge2());
            textMap.put("relation2",nationalGrant.getRelation2());
            textMap.put("workPlace2",nationalGrant.getWorkPlace2());
            textMap.put("fName3",nationalGrant.getfName3());
            textMap.put("age3",nationalGrant.getAge3());
            textMap.put("relation3",nationalGrant.getRelation3());
            textMap.put("workPlace3",nationalGrant.getWorkPlace3());
            textMap.put("fName4",nationalGrant.getfName4());
            textMap.put("age4",nationalGrant.getAge4());
            textMap.put("relation4",nationalGrant.getRelation4());
            textMap.put("workPlace4",nationalGrant.getWorkPlace4());
            textMap.put("fName5",nationalGrant.getfName5());
            textMap.put("age5",nationalGrant.getAge5());
            textMap.put("relation5",nationalGrant.getRelation5());
            textMap.put("workPlace5",nationalGrant.getWorkPlace5());
            textMap.put("applyReason",nationalGrant.getApplyReason());
            textMap.put("opinion",nationalGrant.getOpinion());
            for(int i=0;i<18;i++){
                textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
            }
        }
        else if(awardName.equals("省政府奖学金")){
            String identity = userss.getIdentity();
            char a = 'a';
            Provincialgovernmentscholarship provincialgovernmentscholarship = provincialgovernmentscholarshipService.selectByUserId(userId);
            textMap.put("major",userss.getMajor());
            textMap.put("username",userss.getUsername());
            textMap.put("userId",userId);
            textMap.put("phone",userss.getPhone());
            textMap.put("sex",userss.getSex());
            textMap.put("political",userss.getPolitical());
            textMap.put("birth",userss.getBirth());
            textMap.put("nation",userss.getNation());
            textMap.put("entrance",userss.getEntrance());
            textMap.put("gpRank",userss.getGp() + "/" + userss.getMajorSum());
            textMap.put("ceRank",userss.getCe() + "/" + userss.getMajorSum());
            textMap.put("passSum",userss.getPassSum());
            textMap.put("subSum",userss.getSubSum());
            textMap.put("date1",provincialgovernmentscholarship.getDate1());
            textMap.put("award1",provincialgovernmentscholarship.getAward1());
            textMap.put("unit1",provincialgovernmentscholarship.getUnit1());
            textMap.put("date2",provincialgovernmentscholarship.getDate2());
            textMap.put("award2",provincialgovernmentscholarship.getAward2());
            textMap.put("unit2",provincialgovernmentscholarship.getUnit2());
            textMap.put("date3",provincialgovernmentscholarship.getDate3());
            textMap.put("award3",provincialgovernmentscholarship.getAward3());
            textMap.put("unit3",provincialgovernmentscholarship.getUnit3());
            textMap.put("date4",provincialgovernmentscholarship.getDate4());
            textMap.put("award4",provincialgovernmentscholarship.getAward4());
            textMap.put("unit4",provincialgovernmentscholarship.getUnit4());
            textMap.put("applyReason",provincialgovernmentscholarship.getApplyreason());
            textMap.put("recommendReason",scholarshipOpinion.getProvincialRecommend());
            textMap.put("opinion",scholarshipOpinion.getProvincialOpinion());
            for(int i=0;i<18;i++){
                textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
            }
        }
        else if(awardName.equals("三好学生")){
            Tripleastudent tripleastudent = tripleastudentService.selectByUserId(userId);
            textMap.put("classId",userss.getMajor() + userss.getClassId());
            textMap.put("username",userss.getUsername());
            textMap.put("userId",userId);
            textMap.put("sex",userss.getSex());
            textMap.put("nation",userss.getNation());
            textMap.put("political",userss.getPolitical());
            textMap.put("job",userss.getJob());
            textMap.put("character",userss.getCharacter());
            textMap.put("study",userss.getStudy());
            textMap.put("ability",userss.getAbility());
            textMap.put("all",userss.getAll());
            textMap.put("rank",userss.getCe() + "/" + userss.getMajorSum());
            textMap.put("reason",tripleastudent.getReason());
            textMap.put("opinion",scholarshipOpinion.getTripleaOpinion());
        }
        else if(awardName.equals("校奖学金")){
            Schoolscholarship schoolscholarship = schoolscholarshipService.selectByUserIdAndLevel(userId,award);
            textMap.put("classId",userss.getMajor() + userss.getClassId());
            textMap.put("username",userss.getUsername());
            textMap.put("userId",userId);
            textMap.put("sex",userss.getSex());
            textMap.put("nation",userss.getNation());
            textMap.put("political",userss.getPolitical());
            textMap.put("job",userss.getJob());
            textMap.put("charact",userss.getCharacter());
            textMap.put("study",userss.getStudy());
            textMap.put("ability",userss.getAbility());
            textMap.put("all",userss.getAll());
            textMap.put("rank",userss.getCe() + "/" + userss.getMajorSum());
            textMap.put("level",award);
            textMap.put("reason",schoolscholarship.getReason());
            textMap.put("opinion",scholarshipOpinion.getSchoolOpinion());
        }
        return textMap;
    }
}
