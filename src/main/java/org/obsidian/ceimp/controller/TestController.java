package org.obsidian.ceimp.controller;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.util.DownloadUtil;
import org.obsidian.ceimp.util.TimeUtil;
import org.obsidian.ceimp.util.WordUtil;
import org.obsidian.ceimp.util.ZipUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping(value = "/manager/zip", method = RequestMethod.GET)
    public String zip(){
        return "zip";
    }

    @RequestMapping(value = "/test/nationalInspirationalScholarship", method = RequestMethod.POST)
    public void nationalInspirationalScholarship(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String identity = request.getParameter("identity");
        char a = 'a';
        String resident = request.getParameter("resident");
        String situation = request.getParameter("situation");
        String inputUrl = null;
        if(resident.equals("城镇") && situation.equals("家庭经济特别困难")){
            inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\国家励志奖学金模板1.docx";
        }
        else if(resident.equals("城镇") && situation.equals("家庭经济一般困难")){
            inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\国家励志奖学金模板2.docx";
        }
        else if(resident.equals("农村") && situation.equals("家庭经济特别困难")){
            inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\国家励志奖学金模板3.docx";
        }
        else if(resident.equals("农村") && situation.equals("家庭经济一般困难")){
            inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\国家励志奖学金模板4.docx";
        }
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String outputUrl = "D:\\award\\nationalInspirationalScholarship\\" + userId + username + "国家励志奖学金.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("major",request.getParameter("major"));
        textMap.put("classId",request.getParameter("classId"));
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("phone",request.getParameter("phone"));
        textMap.put("sex",request.getParameter("sex"));
        textMap.put("political",request.getParameter("political"));
        textMap.put("birth",request.getParameter("birthYear") + "年" + request.getParameter("birthMonth") + "月");
        textMap.put("nation",request.getParameter("nation"));
        textMap.put("entrance",request.getParameter("entranceYear") + "年" + request.getParameter("entranceMonth") + "月");
        textMap.put("gpRank",request.getParameter("gpRank") + "/" + request.getParameter("peopleSum"));
        textMap.put("ceRank",request.getParameter("ceRank") + "/" + request.getParameter("peopleSum"));
        textMap.put("passSum",request.getParameter("passSum"));
        textMap.put("subSum",request.getParameter("subSum"));
        textMap.put("date1",request.getParameter("date1"));
        textMap.put("award1",request.getParameter("award1"));
        textMap.put("unit1",request.getParameter("unit1"));
        textMap.put("date2",request.getParameter("date2"));
        textMap.put("award2",request.getParameter("award2"));
        textMap.put("unit2",request.getParameter("unit2"));
        textMap.put("date3",request.getParameter("date3"));
        textMap.put("award3",request.getParameter("award3"));
        textMap.put("unit3",request.getParameter("unit3"));
        textMap.put("date4",request.getParameter("date4"));
        textMap.put("award4",request.getParameter("award4"));
        textMap.put("unit4",request.getParameter("unit4"));
        textMap.put("incomeSource",request.getParameter("incomeSource"));
        textMap.put("monthIncome",request.getParameter("monthIncome"));
        textMap.put("familySum",request.getParameter("familySum"));
        textMap.put("address",request.getParameter("address"));
        textMap.put("postalCode",request.getParameter("postalCode"));
        textMap.put("applyReason",request.getParameter("applyReason"));
        textMap.put("opinion",request.getParameter("opinion"));
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "国家励志奖学金.docx");
    }

    @RequestMapping(value = "/test/provincialGovernmentScholarship", method = RequestMethod.POST)
    public void provincialGovernmentScholarship(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String identity = request.getParameter("identity");
        char a = 'a';
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\省政府奖学金模板.docx";
        String outputUrl = "D:\\award\\provincialGovernmentScholarship\\" + userId + username + "省政府奖学金.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("school",request.getParameter("school"));
        textMap.put("major",request.getParameter("major"));
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("phone",request.getParameter("phone"));
        textMap.put("sex",request.getParameter("sex"));
        textMap.put("political",request.getParameter("political"));
        textMap.put("birth",request.getParameter("birthYear") + "年" + request.getParameter("birthMonth") + "月");
        textMap.put("nation",request.getParameter("nation"));
        textMap.put("entrance",request.getParameter("entranceYear") + "年" + request.getParameter("entranceMonth") + "月");
        textMap.put("gpRank",request.getParameter("gpRank") + "/" + request.getParameter("peopleSum"));
        textMap.put("ceRank",request.getParameter("ceRank") + "/" + request.getParameter("peopleSum"));
        textMap.put("passSum",request.getParameter("passSum"));
        textMap.put("subSum",request.getParameter("subSum"));
        textMap.put("date1",request.getParameter("date1"));
        textMap.put("award1",request.getParameter("award1"));
        textMap.put("unit1",request.getParameter("unit1"));
        textMap.put("date2",request.getParameter("date2"));
        textMap.put("award2",request.getParameter("award2"));
        textMap.put("unit2",request.getParameter("unit2"));
        textMap.put("date3",request.getParameter("date3"));
        textMap.put("award3",request.getParameter("award3"));
        textMap.put("unit3",request.getParameter("unit3"));
        textMap.put("date4",request.getParameter("date4"));
        textMap.put("award4",request.getParameter("award4"));
        textMap.put("unit4",request.getParameter("unit4"));
        textMap.put("applyReason",request.getParameter("applyReason"));
        textMap.put("recommendReason",request.getParameter("recommendReason"));
        textMap.put("opinion",request.getParameter("opinion"));
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "省政府奖学金.docx");
    }

    @RequestMapping(value = "/test/schoolScholarship", method = RequestMethod.POST)
    public void schoolScholarship(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\校奖学金模板.docx";
        String outputUrl = "D:\\award\\schoolScholarship\\" + userId + username + "校奖学金.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("classId",request.getParameter("classId"));
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("sex",request.getParameter("sex"));
        textMap.put("nation",request.getParameter("nation"));
        textMap.put("political",request.getParameter("political"));
        textMap.put("job",request.getParameter("job"));
        textMap.put("charact",request.getParameter("charact"));
        textMap.put("study",request.getParameter("study"));
        textMap.put("ability",request.getParameter("ability"));
        textMap.put("all",request.getParameter("all"));
        textMap.put("rank",request.getParameter("rank") + "/" + request.getParameter("peopleSum"));
        textMap.put("level",request.getParameter("level"));
        textMap.put("reason",request.getParameter("reason"));
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "校奖学金.docx");
    }

    @RequestMapping(value = "/test/tripleAStudent", method = RequestMethod.GET)
    public void tripleAStudent(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String userId = request.getParameter("userId");
        String username = request.getParameter("username");
        String inputUrl = "F:\\ideaworkspace\\CEIMP\\src\\main\\resources\\三好学生模板.docx";
        String outputUrl = "D:\\award\\tripleAStudent\\" + userId + username + "三好学生.docx";
        Map<String,String> textMap = new HashMap<>();
        textMap.put("school",request.getParameter("school"));
        textMap.put("classId",request.getParameter("classId"));
        textMap.put("username",username);
        textMap.put("userId",userId);
        textMap.put("sex",request.getParameter("sex"));
        textMap.put("nation",request.getParameter("nation"));
        textMap.put("political",request.getParameter("political"));
        textMap.put("job",request.getParameter("job"));
        textMap.put("character",request.getParameter("character"));
        textMap.put("study",request.getParameter("study"));
        textMap.put("ability",request.getParameter("ability"));
        textMap.put("personality",request.getParameter("personality"));
        textMap.put("all",request.getParameter("all"));
        textMap.put("rank",request.getParameter("rank") + "/" + request.getParameter("peopleSum"));
        textMap.put("reason",request.getParameter("reason"));
        WordUtil.getInstance().generateWord(inputUrl,outputUrl,textMap);
        DownloadUtil.getInstance().download(outputUrl,response,userId + username + "三好学生.docx");
    }



    @RequestMapping(value = "/manager/zip/tripleAStudent", method = RequestMethod.GET)
    public void zipTripleAStudent(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String url = "D:\\award\\tripleAStudent";
        String zipFilePath = "D:\\award\\zip";
        String fileName = "三好学生";
        ZipUtil.getInstance().zip(url,zipFilePath,fileName);
        DownloadUtil.getInstance().download(zipFilePath + "\\" + fileName + ".zip",response,fileName + ".zip");
    }
}
