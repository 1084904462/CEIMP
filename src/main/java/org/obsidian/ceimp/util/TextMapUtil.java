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

    public List<Map<String,String>> getNgMapList(List<NgBean> ngBeanList){
        List<Map<String,String>> ngMapList = new ArrayList<>();
        for(int i=0;i<ngBeanList.size();i++){
            ngMapList.add(this.getNgMap(ngBeanList.get(i)));
        }
        return ngMapList;
    }

    public Map<String,String> getNisMap(NisBean nisBean){
        String identity = nisBean.getIdentity();
        char a = 'a';
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",nisBean.getTs().toString());
        textMap.put("te",nisBean.getTe().toString());
        textMap.put("school",nisBean.getSchool());
        textMap.put("major",nisBean.getMajor());
        textMap.put("classId",nisBean.getClassNum());
        textMap.put("username",nisBean.getUsername());
        textMap.put("sex",nisBean.getSex());
        textMap.put("birth",nisBean.getBirth());
        textMap.put("userId",nisBean.getAccount());
        textMap.put("nation",nisBean.getNation());
        textMap.put("entrance",nisBean.getEntrance());
        textMap.put("political",nisBean.getPolitical());
        textMap.put("phone",nisBean.getPhone());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        textMap.put("gpRank",nisBean.getGpRank() + "/" + nisBean.getMajorSum());
        textMap.put("classSum",nisBean.getClassSum());
        textMap.put("passSum",nisBean.getPassSum());
        textMap.put("ceRank",nisBean.getCeRank() + "/" + nisBean.getMajorSum());
        textMap.put("date1",nisBean.getDate1());
        textMap.put("award1",nisBean.getAward1());
        textMap.put("unit1",nisBean.getUnit1());
        textMap.put("date2",nisBean.getDate2());
        textMap.put("award2",nisBean.getAward2());
        textMap.put("unit2",nisBean.getUnit2());
        textMap.put("date3",nisBean.getDate3());
        textMap.put("award3",nisBean.getAward3());
        textMap.put("unit3",nisBean.getUnit3());
        textMap.put("date4",nisBean.getDate4());
        textMap.put("award4",nisBean.getAward4());
        textMap.put("unit4",nisBean.getUnit4());
        textMap.put("incomeSource",nisBean.getIncomeSource());
        textMap.put("monthIncome",nisBean.getMonthIncome());
        textMap.put("familySum",nisBean.getFamilySum());
        textMap.put("address",nisBean.getAddress());
        textMap.put("postalCode",nisBean.getPostalCode());
        textMap.put("applyReason",nisBean.getApplyReason());
        textMap.put("opinion",nisBean.getOpinion());
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
        String identity = pgsBean.getIdentity();
        char a = 'a';
        Map<String,String> textMap = new HashMap<>();
        textMap.put("ts",pgsBean.getTs().toString());
        textMap.put("te",pgsBean.getTe().toString());
        textMap.put("school",pgsBean.getSchool());
        textMap.put("userId",pgsBean.getAccount());
        textMap.put("username",pgsBean.getUsername());
        textMap.put("sex",pgsBean.getSex());
        textMap.put("birth",pgsBean.getBirth());
        textMap.put("political",pgsBean.getPolitical());
        textMap.put("nation",pgsBean.getNation());
        textMap.put("entrance",pgsBean.getEntrance());
        textMap.put("major",pgsBean.getMajor());
        textMap.put("phone",pgsBean.getPhone());
        for(int i=0;i<18;i++){
            textMap.put(String.valueOf((char)(a+i)),String.valueOf(identity.charAt(i)));
        }
        textMap.put("gpRank",pgsBean.getGpRank() + "/" + pgsBean.getMajorSum());
        textMap.put("classSum",pgsBean.getClassSum());
        textMap.put("passSum",pgsBean.getPassSum());
        textMap.put("ceRank",pgsBean.getCeRank() + "/" + pgsBean.getMajorSum());
        textMap.put("date1",pgsBean.getDate1());
        textMap.put("award1",pgsBean.getAward1());
        textMap.put("unit1",pgsBean.getUnit1());
        textMap.put("date2",pgsBean.getDate2());
        textMap.put("award2",pgsBean.getAward2());
        textMap.put("unit2",pgsBean.getUnit2());
        textMap.put("date3",pgsBean.getDate3());
        textMap.put("award3",pgsBean.getAward3());
        textMap.put("unit3",pgsBean.getUnit3());
        textMap.put("date4",pgsBean.getDate4());
        textMap.put("award4",pgsBean.getAward4());
        textMap.put("unit4",pgsBean.getUnit4());
        textMap.put("applyReason",pgsBean.getApplyReason());
        textMap.put("recommendReason",pgsBean.getRecommendReason());
        textMap.put("opinion",pgsBean.getOpinion());
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
        textMap.put("ts",ssBean.getTs().toString());
        textMap.put("te",ssBean.getTe().toString());
        textMap.put("school",ssBean.getSchool());
        textMap.put("classId",ssBean.getMajor() + ssBean.getClassNum());
        textMap.put("username",ssBean.getUsername());
        textMap.put("userId",ssBean.getAccount());
        textMap.put("sex",ssBean.getSex());
        textMap.put("nation",ssBean.getNation());
        textMap.put("political",ssBean.getPolitical());
        textMap.put("job",ssBean.getJob());
        textMap.put("charact",ssBean.getCharact());
        textMap.put("study",ssBean.getStudy());
        textMap.put("ability",ssBean.getAbility());
        textMap.put("total",ssBean.getTotal());
        textMap.put("ceRank",ssBean.getCeRank() + "/" + ssBean.getMajorSum());
        textMap.put("rank",ssBean.getRank());
        textMap.put("reason",ssBean.getReason());
        textMap.put("opinion",ssBean.getOpinion());
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
        textMap.put("ts",tasBean.getTs().toString());
        textMap.put("te",tasBean.getTe().toString());
        textMap.put("school",tasBean.getSchool());
        textMap.put("classId",tasBean.getMajor() + tasBean.getClassNum());
        textMap.put("username",tasBean.getUsername());
        textMap.put("userId",tasBean.getAccount());
        textMap.put("sex",tasBean.getSex());
        textMap.put("nation",tasBean.getNation());
        textMap.put("political",tasBean.getPolitical());
        textMap.put("job",tasBean.getJob());
        textMap.put("charact",tasBean.getCharact());
        textMap.put("study",tasBean.getStudy());
        textMap.put("ability",tasBean.getAbility());
        textMap.put("total",tasBean.getTotal());
        textMap.put("ceRank",tasBean.getCeRank() + "/" + tasBean.getMajorSum());
        textMap.put("reason",tasBean.getReason());
        textMap.put("opinion",tasBean.getOpinion());
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
