package org.obsidian.ceimp.util;

import org.obsidian.ceimp.bean.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/19.
 */
public class TextMapUtil {
    private static final TextMapUtil instance = new TextMapUtil();

    private TextMapUtil(){}

    public static TextMapUtil getInstance(){
        return instance;
    }

    public Map<String,String> getNgMap(NgBean ngBean){
        String identity = ngBean.getIdentity();
        char a = 'a';
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",ngBean.getTs().toString());
        textMap.put("te",ngBean.getTe().toString());
        textMap.put("school",ngBean.getSchool());
        textMap.put("major",ngBean.getMajor());
        textMap.put("classId",ngBean.getClassNum());
        textMap.put("username",ngBean.getUsername());
        textMap.put("sex",ngBean.getSex());
        textMap.put("birth",ngBean.getBirth());
        textMap.put("userId",ngBean.getAccount());
        textMap.put("nation",ngBean.getNation());
        textMap.put("entrance",ngBean.getEntrance());
        textMap.put("political",ngBean.getPolitical());
        textMap.put("phone",ngBean.getPhone());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        textMap.put("incomeSource",ngBean.getIncomeSource());
        textMap.put("monthIncome",ngBean.getMonthIncome());
        textMap.put("familySum",ngBean.getFamilySum());
        textMap.put("address",ngBean.getAddress());
        textMap.put("postalCode",ngBean.getPostalCode());
        textMap.put("fName1",ngBean.getfName1());
        textMap.put("age1",ngBean.getAge1());
        textMap.put("relation1",ngBean.getRelation1());
        textMap.put("workPlace1",ngBean.getWorkPlace1());
        textMap.put("fName2",ngBean.getfName2());
        textMap.put("age2",ngBean.getAge2());
        textMap.put("relation2",ngBean.getRelation2());
        textMap.put("workPlace2",ngBean.getWorkPlace2());
        textMap.put("fName3",ngBean.getfName3());
        textMap.put("age3",ngBean.getAge3());
        textMap.put("relation3",ngBean.getRelation3());
        textMap.put("workPlace3",ngBean.getWorkPlace3());
        textMap.put("fName4",ngBean.getfName4());
        textMap.put("age4",ngBean.getAge4());
        textMap.put("relation4",ngBean.getRelation4());
        textMap.put("workPlace4",ngBean.getWorkPlace4());
        textMap.put("fName5",ngBean.getfName5());
        textMap.put("age5",ngBean.getAge5());
        textMap.put("relation5",ngBean.getRelation5());
        textMap.put("workPlace5",ngBean.getWorkPlace5());
        textMap.put("applyReason",ngBean.getApplyReason());
        textMap.put("opinion",ngBean.getOpinion());
        return textMap;
    }

    public Map<String,String> getNisMap(NisBean nisBean){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }

    public Map<String,String> getPgsMap(PgsBean pgsBean){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }

    public Map<String,String> getSsMap(SsBean ssBean){
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts","2016");
        textMap.put("te","2017");
        textMap.put("school","信息与电子工程学院");
        textMap.put("classId","软件工程151");
        textMap.put("username","陈伟");
        textMap.put("userId","1150299070");
        textMap.put("sex","男");
        textMap.put("nation","汉族");
        textMap.put("political","共青团员");
        textMap.put("job","无");
        textMap.put("charact","13.2");
        textMap.put("study","72.3");
        textMap.put("ability","3.5");
        textMap.put("all","79");
        textMap.put("rank","10/74");
        textMap.put("level","优秀学生一等奖学金");
        textMap.put("reason","理由BALABALA");
        textMap.put("opinion","意见BALABALA");
        return textMap;
    }

    public Map<String,String> getTasMap(TasBean tasBean){
        Map<String,String> textMap = new HashMap<>();

        return textMap;
    }
}
