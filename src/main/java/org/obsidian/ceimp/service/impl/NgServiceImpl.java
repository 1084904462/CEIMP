package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NgBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.dao.NgMapper;
import org.obsidian.ceimp.entity.Ng;
import org.obsidian.ceimp.entity.NgExample;
import org.obsidian.ceimp.service.NgService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class NgServiceImpl implements NgService {

    @Autowired
    private NgMapper ngMapper;

    @Autowired
    private UserBasicService userBasicService;

    @Transactional
    @Override
    public Ng selectByUserIdAndYearScope(Long userId,Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ng> list = ngMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public NgBean getNgBeanByUserIdAndYearScope(Long userId,Integer yearScope) {
        NgBean ngBean = new NgBean();
        ngBean.setTs(TimeUtil.getInstance().getThisYear());
        ngBean.setTe(TimeUtil.getInstance().getThisYear() + 1);
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ng> ngList = ngMapper.selectByExample(example);
        if(!ngList.isEmpty()){
            Ng ng = ngList.get(0);
            ngBean.setResident(ng.getResident());
            ngBean.setIncomeSource(ng.getIncomeSource());
            ngBean.setMonthIncome(ng.getMonthIncome());
            ngBean.setFamilySum(ng.getFamilySum());
            ngBean.setAddress(ng.getAddress());
            ngBean.setPostalCode(ng.getPostalCode());
            ngBean.setSituation(ng.getSituation());
            ngBean.setfName1(ng.getfName1());
            ngBean.setAge1(ng.getAge1());
            ngBean.setRelation1(ng.getRelation1());
            ngBean.setWorkPlace1(ng.getWorkPlace1());
            ngBean.setfName2(ng.getfName2());
            ngBean.setAge2(ng.getAge2());
            ngBean.setRelation2(ng.getRelation2());
            ngBean.setWorkPlace2(ng.getWorkPlace2());
            ngBean.setfName3(ng.getfName3());
            ngBean.setAge3(ng.getAge3());
            ngBean.setRelation3(ng.getRelation3());
            ngBean.setWorkPlace3(ng.getWorkPlace3());
            ngBean.setfName4(ng.getfName4());
            ngBean.setAge4(ng.getAge4());
            ngBean.setRelation4(ng.getRelation4());
            ngBean.setWorkPlace4(ng.getWorkPlace4());
            ngBean.setfName5(ng.getfName5());
            ngBean.setAge5(ng.getAge5());
            ngBean.setRelation5(ng.getRelation5());
            ngBean.setWorkPlace5(ng.getWorkPlace5());
            ngBean.setApplyReason(ng.getApplyReason());
            ngBean.setOpinion(ng.getOpinion());
        }
        UserBasicBean userBasicBean = userBasicService.selectUserBasicBeanByUserId(userId);
        if(userBasicBean != null){
            ngBean.setSchool(userBasicBean.getSchool());
            ngBean.setMajor(userBasicBean.getMajor());
            ngBean.setClassNum(userBasicBean.getClassNum());
            ngBean.setUsername(userBasicBean.getUsername());
            ngBean.setSex(userBasicBean.getSex());
            ngBean.setBirth(userBasicBean.getBirth());
            ngBean.setAccount(userBasicBean.getAccount());
            ngBean.setNation(userBasicBean.getNation());
            ngBean.setEntrance(userBasicBean.getEntrance());
            ngBean.setPolitical(userBasicBean.getPolitical());
            ngBean.setPhone(userBasicBean.getPhone());
            ngBean.setIdentity(userBasicBean.getIdentity());
        }
        return ngBean;
    }

    @Transactional
    @Override
    public int insertNg(Long userId,Integer yearScope,NgBean ngBean) {
        userBasicService.updateByUserIdAndNgBean(userId,ngBean);
        Ng ng = new Ng();
        ng.setUserId(userId);
        ng.setYearScope(yearScope);
        ng.setResident(ngBean.getResident());
        ng.setIncomeSource(ngBean.getIncomeSource());
        ng.setMonthIncome(ngBean.getMonthIncome());
        ng.setFamilySum(ngBean.getFamilySum());
        ng.setAddress(ngBean.getAddress());
        ng.setPostalCode(ngBean.getPostalCode());
        ng.setSituation(ngBean.getSituation());
        ng.setfName1(ngBean.getfName1());
        ng.setAge1(ngBean.getAge1());
        ng.setRelation1(ngBean.getRelation1());
        ng.setWorkPlace1(ngBean.getWorkPlace1());
        ng.setfName2(ngBean.getfName2());
        ng.setAge2(ngBean.getAge2());
        ng.setRelation2(ngBean.getRelation2());
        ng.setWorkPlace2(ngBean.getWorkPlace2());
        ng.setfName3(ngBean.getfName3());
        ng.setAge3(ngBean.getAge3());
        ng.setRelation3(ngBean.getRelation3());
        ng.setWorkPlace3(ngBean.getWorkPlace3());
        ng.setfName4(ngBean.getfName4());
        ng.setAge4(ngBean.getAge4());
        ng.setRelation4(ngBean.getRelation4());
        ng.setWorkPlace4(ngBean.getWorkPlace4());
        ng.setfName5(ngBean.getfName5());
        ng.setAge5(ngBean.getAge5());
        ng.setRelation5(ngBean.getRelation5());
        ng.setWorkPlace5(ngBean.getWorkPlace5());
        ng.setApplyReason(ngBean.getApplyReason());
        return ngMapper.insertSelective(ng);
    }

    @Transactional
    @Override
    public int updateNg(Long userId,Integer yearScope,NgBean ngBean) {
        userBasicService.updateByUserIdAndNgBean(userId,ngBean);
        Ng ng = new Ng();
        ng.setUserId(userId);
        ng.setYearScope(yearScope);
        ng.setResident(ngBean.getResident());
        ng.setIncomeSource(ngBean.getIncomeSource());
        ng.setMonthIncome(ngBean.getMonthIncome());
        ng.setFamilySum(ngBean.getFamilySum());
        ng.setAddress(ngBean.getAddress());
        ng.setPostalCode(ngBean.getPostalCode());
        ng.setSituation(ngBean.getSituation());
        ng.setfName1(ngBean.getfName1());
        ng.setAge1(ngBean.getAge1());
        ng.setRelation1(ngBean.getRelation1());
        ng.setWorkPlace1(ngBean.getWorkPlace1());
        ng.setfName2(ngBean.getfName2());
        ng.setAge2(ngBean.getAge2());
        ng.setRelation2(ngBean.getRelation2());
        ng.setWorkPlace2(ngBean.getWorkPlace2());
        ng.setfName3(ngBean.getfName3());
        ng.setAge3(ngBean.getAge3());
        ng.setRelation3(ngBean.getRelation3());
        ng.setWorkPlace3(ngBean.getWorkPlace3());
        ng.setfName4(ngBean.getfName4());
        ng.setAge4(ngBean.getAge4());
        ng.setRelation4(ngBean.getRelation4());
        ng.setWorkPlace4(ngBean.getWorkPlace4());
        ng.setfName5(ngBean.getfName5());
        ng.setAge5(ngBean.getAge5());
        ng.setRelation5(ngBean.getRelation5());
        ng.setWorkPlace5(ngBean.getWorkPlace5());
        ng.setApplyReason(ngBean.getApplyReason());
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return ngMapper.updateByExampleSelective(ng,example);
    }

    @Override
    public void getNgWord(NgBean ngBean, HttpServletResponse response) throws IOException {
        String modelName = null;
        if(ngBean.getResident().equals("城镇") && ngBean.getSituation().equals("家庭经济特别困难")){
            modelName = "国家助学金模板1";
        }
        else if(ngBean.getResident().equals("城镇") && ngBean.getSituation().equals("家庭经济一般困难")){
            modelName = "国家助学金模板2";
        }
        else if(ngBean.getResident().equals("农村") && ngBean.getSituation().equals("家庭经济特别困难")){
            modelName = "国家助学金模板3";
        }
        else if(ngBean.getResident().equals("农村") && ngBean.getSituation().equals("家庭经济一般困难")){
            modelName = "国家助学金模板4";
        }
        ZipInfoBean zipInfoBean = new ZipInfoBean(ngBean.getAccount(),ngBean.getUsername(),"国家助学金");
        String modelInputUrl = UrlUtil.getInstance().getModelInputUrl(modelName);
        String wordOutputUrl = UrlUtil.getInstance().getWordOutputUrl("ng",zipInfoBean);
        System.out.println(modelInputUrl);
        System.out.println(wordOutputUrl);
        Map<String,String> textMap = TextMapUtil.getInstance().getNgMap(ngBean);
        WordUtil.getInstance().generateWord(modelInputUrl,wordOutputUrl,textMap);
        String fileName = UrlUtil.getInstance().getWordFileName(zipInfoBean);
        DownloadUtil.getInstance().download(wordOutputUrl,response,fileName);
        DeleteUtil.getInstance().delete(wordOutputUrl);
    }


}
