package org.obsidian.ceimp.util;

import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.bean.*;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
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
        String identity = ngBean.getIdentity().trim();
        char a = 'a';
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",ngBean.getTs().toString().trim());
        textMap.put("te",ngBean.getTe().toString().trim());
        textMap.put("school",ngBean.getSchool().trim());
        textMap.put("major",ngBean.getMajor().trim());
        textMap.put("classId",ngBean.getClassNum().trim());
        textMap.put("username",ngBean.getUsername().trim());
        textMap.put("sex",ngBean.getSex().trim());
        textMap.put("birth",ngBean.getBirth().trim());
        textMap.put("userId",ngBean.getAccount().trim());
        textMap.put("nation",ngBean.getNation().trim());
        textMap.put("entrance",ngBean.getEntrance().trim());
        textMap.put("political",ngBean.getPolitical().trim());
        textMap.put("phone",ngBean.getPhone().trim());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        textMap.put("incomeSource",ngBean.getIncomeSource().trim());
        textMap.put("monthIncome",ngBean.getMonthIncome().trim());
        textMap.put("familySum",ngBean.getFamilySum().trim());
        textMap.put("address",ngBean.getAddress().trim());
        textMap.put("postalCode",ngBean.getPostalCode().trim());
        textMap.put("fName1",ngBean.getfName1().trim());
        textMap.put("age1",ngBean.getAge1().trim());
        textMap.put("relation1",ngBean.getRelation1().trim());
        textMap.put("workPlace1",ngBean.getWorkPlace1().trim());
        textMap.put("fName2",ngBean.getfName2().trim());
        textMap.put("age2",ngBean.getAge2().trim());
        textMap.put("relation2",ngBean.getRelation2().trim());
        textMap.put("workPlace2",ngBean.getWorkPlace2().trim());
        textMap.put("fName3",ngBean.getfName3().trim());
        textMap.put("age3",ngBean.getAge3().trim());
        textMap.put("relation3",ngBean.getRelation3().trim());
        textMap.put("workPlace3",ngBean.getWorkPlace3().trim());
        textMap.put("fName4",ngBean.getfName4().trim());
        textMap.put("age4",ngBean.getAge4().trim());
        textMap.put("relation4",ngBean.getRelation4().trim());
        textMap.put("workPlace4",ngBean.getWorkPlace4().trim());
        textMap.put("fName5",ngBean.getfName5().trim());
        textMap.put("age5",ngBean.getAge5().trim());
        textMap.put("relation5",ngBean.getRelation5().trim());
        textMap.put("workPlace5",ngBean.getWorkPlace5().trim());
        textMap.put("applyReason",ngBean.getApplyReason().trim());
        textMap.put("opinion",ngBean.getOpinion().trim());
        return textMap;
    }

    public List<Map<String,String>> getNgMapList(List<NgBean> ngBeanList){
        List<Map<String,String>> ngMapList = new ArrayList<>();
        for(int i=0;i<ngBeanList.size();i++){
            ngMapList.add(this.getNgMap(ngBeanList.get(i)));
        }
        return ngMapList;
    }

    public Map<String,String> getNisMap(NisBean nisBean){
        String identity = nisBean.getIdentity().trim();
        char a = 'a';
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",nisBean.getTs().toString().trim());
        textMap.put("te",nisBean.getTe().toString().trim());
        textMap.put("school",nisBean.getSchool().trim());
        textMap.put("major",nisBean.getMajor().trim());
        textMap.put("classId",nisBean.getClassNum().trim());
        textMap.put("username",nisBean.getUsername().trim());
        textMap.put("sex",nisBean.getSex().trim());
        textMap.put("birth",nisBean.getBirth().trim());
        textMap.put("userId",nisBean.getAccount().trim());
        textMap.put("nation",nisBean.getNation().trim());
        textMap.put("entrance",nisBean.getEntrance().trim());
        textMap.put("political",nisBean.getPolitical().trim());
        textMap.put("phone",nisBean.getPhone().trim());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        textMap.put("gpRank",nisBean.getGpRank().trim() + "/" + nisBean.getMajorSum().toString().trim());
        textMap.put("classSum",nisBean.getClassSum().trim());
        textMap.put("passSum",nisBean.getPassSum().trim());
        textMap.put("ceRank",nisBean.getCeRank().trim() + "/" + nisBean.getMajorSum().toString().trim());
        textMap.put("date1",nisBean.getDate1().trim());
        textMap.put("award1",nisBean.getAward1().trim());
        textMap.put("unit1",nisBean.getUnit1().trim());
        textMap.put("date2",nisBean.getDate2().trim());
        textMap.put("award2",nisBean.getAward2().trim());
        textMap.put("unit2",nisBean.getUnit2().trim());
        textMap.put("date3",nisBean.getDate3().trim());
        textMap.put("award3",nisBean.getAward3().trim());
        textMap.put("unit3",nisBean.getUnit3().trim());
        textMap.put("date4",nisBean.getDate4().trim());
        textMap.put("award4",nisBean.getAward4().trim());
        textMap.put("unit4",nisBean.getUnit4().trim());
        textMap.put("incomeSource",nisBean.getIncomeSource().trim());
        textMap.put("monthIncome",nisBean.getMonthIncome().trim());
        textMap.put("familySum",nisBean.getFamilySum().trim());
        textMap.put("address",nisBean.getAddress().trim());
        textMap.put("postalCode",nisBean.getPostalCode().trim());
        textMap.put("applyReason",nisBean.getApplyReason().trim());
        textMap.put("opinion",nisBean.getOpinion().trim());
        return textMap;
    }

    public List<Map<String,String>> getNisMapList(List<NisBean> nisBeanList){
        List<Map<String,String>> nisMapList = new ArrayList<>();
        for(int i=0;i<nisBeanList.size();i++){
            nisMapList.add(this.getNisMap(nisBeanList.get(i)));
        }
        return nisMapList;
    }

    public Map<String,String> getPgsMap(PgsBean pgsBean){
        String identity = pgsBean.getIdentity().trim();
        char a = 'a';
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",pgsBean.getTs().toString().trim());
        textMap.put("te",pgsBean.getTe().toString().trim());
        textMap.put("school",pgsBean.getSchool().trim());
        textMap.put("userId",pgsBean.getAccount().trim());
        textMap.put("username",pgsBean.getUsername().trim());
        textMap.put("sex",pgsBean.getSex().trim());
        textMap.put("birth",pgsBean.getBirth().trim());
        textMap.put("political",pgsBean.getPolitical().trim());
        textMap.put("nation",pgsBean.getNation().trim());
        textMap.put("entrance",pgsBean.getEntrance().trim());
        textMap.put("major",pgsBean.getMajor().trim());
        textMap.put("phone",pgsBean.getPhone().trim());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        textMap.put("gpRank",pgsBean.getGpRank().trim() + "/" + pgsBean.getMajorSum().toString().trim());
        textMap.put("classSum",pgsBean.getClassSum().trim());
        textMap.put("passSum",pgsBean.getPassSum().trim());
        textMap.put("ceRank",pgsBean.getCeRank().trim() + "/" + pgsBean.getMajorSum().toString().trim());
        textMap.put("date1",pgsBean.getDate1().trim());
        textMap.put("award1",pgsBean.getAward1().trim());
        textMap.put("unit1",pgsBean.getUnit1().trim());
        textMap.put("date2",pgsBean.getDate2().trim());
        textMap.put("award2",pgsBean.getAward2().trim());
        textMap.put("unit2",pgsBean.getUnit2().trim());
        textMap.put("date3",pgsBean.getDate3().trim());
        textMap.put("award3",pgsBean.getAward3().trim());
        textMap.put("unit3",pgsBean.getUnit3().trim());
        textMap.put("date4",pgsBean.getDate4().trim());
        textMap.put("award4",pgsBean.getAward4().trim());
        textMap.put("unit4",pgsBean.getUnit4().trim());
        textMap.put("applyReason",pgsBean.getApplyReason().trim());
        textMap.put("recommendReason",pgsBean.getRecommendReason().trim());
        textMap.put("opinion",pgsBean.getOpinion().trim());
        return textMap;
    }

    public List<Map<String,String>> getPgsMapList(List<PgsBean> pgsBeanList){
        List<Map<String,String>> pgsMapList = new ArrayList<>();
        for(int i=0;i<pgsBeanList.size();i++){
            pgsMapList.add(this.getPgsMap(pgsBeanList.get(i)));
        }
        return pgsMapList;
    }

    public Map<String,String> getSsMap(SsBean ssBean){
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",ssBean.getTs().toString().trim());
        textMap.put("te",ssBean.getTe().toString().trim());
        textMap.put("school",ssBean.getSchool().trim());
        textMap.put("classId",ssBean.getMajor().trim() + ssBean.getClassNum().trim());
        textMap.put("username",ssBean.getUsername().trim());
        textMap.put("userId",ssBean.getAccount().trim());
        textMap.put("sex",ssBean.getSex().trim());
        textMap.put("nation",ssBean.getNation().trim());
        textMap.put("political",ssBean.getPolitical().trim());
        textMap.put("job",ssBean.getJob().trim());
        textMap.put("charact",ssBean.getCharact().trim());
        textMap.put("study",ssBean.getStudy().trim());
        textMap.put("ability",ssBean.getAbility().trim());
        textMap.put("total",ssBean.getTotal().trim());
        textMap.put("ceRank",ssBean.getCeRank().trim() + "/" + ssBean.getMajorSum().toString().trim());
        textMap.put("rank",ssBean.getRank().trim());
        textMap.put("reason",ssBean.getReason().trim());
        textMap.put("opinion",ssBean.getOpinion().trim());
        return textMap;
    }

    public List<Map<String,String>> getSsMapList(List<SsBean> ssBeanList){
        List<Map<String,String>> ssMapList = new ArrayList<>();
        for(int i=0;i<ssBeanList.size();i++){
            ssMapList.add(this.getSsMap(ssBeanList.get(i)));
        }
        return ssMapList;
    }

    public Map<String,String> getTasMap(TasBean tasBean){
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",tasBean.getTs().toString().trim());
        textMap.put("te",tasBean.getTe().toString().trim());
        textMap.put("school",tasBean.getSchool().trim());
        textMap.put("classId",tasBean.getMajor().trim() + tasBean.getClassNum().trim());
        textMap.put("username",tasBean.getUsername().trim());
        textMap.put("userId",tasBean.getAccount().trim());
        textMap.put("sex",tasBean.getSex().trim());
        textMap.put("nation",tasBean.getNation().trim());
        textMap.put("political",tasBean.getPolitical().trim());
        textMap.put("job",tasBean.getJob().trim());
        textMap.put("charact",tasBean.getCharact().trim());
        textMap.put("study",tasBean.getStudy().trim());
        textMap.put("ability",tasBean.getAbility().trim());
        textMap.put("total",tasBean.getTotal().trim());
        textMap.put("ceRank",tasBean.getCeRank().trim() + "/" + tasBean.getMajorSum().toString().trim());
        textMap.put("reason",tasBean.getReason().trim());
        textMap.put("opinion",tasBean.getOpinion().trim());
        return textMap;
    }

    public List<Map<String,String>> getTasMapList(List<TasBean> tasBeanList){
        List<Map<String,String>> tasMapList = new ArrayList<>();
        for(int i=0;i<tasBeanList.size();i++){
            tasMapList.add(this.getTasMap(tasBeanList.get(i)));
        }
        return tasMapList;
    }
}
