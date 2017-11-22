package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NisBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.dao.NisMapper;
import org.obsidian.ceimp.entity.Nis;
import org.obsidian.ceimp.entity.NisExample;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.service.NisService;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.service.UserInfoService;
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
public class NisServiceImpl implements NisService {

    @Autowired
    private NisMapper nisMapper;

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private OpinionService opinionService;

    @Transactional
    @Override
    public Nis selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        NisExample example = new NisExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Nis> list = nisMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public NisBean getNisBeanByUserIdAndYearScope(Long userId, Integer yearScope) {
        NisBean nisBean = new NisBean();
        nisBean.setTs(TimeUtil.getInstance().getThisYear() - 1);
        nisBean.setTe(TimeUtil.getInstance().getThisYear());
        NisExample example = new NisExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Nis> nisList = nisMapper.selectByExample(example);
        if(!nisList.isEmpty()){
            Nis nis = nisList.get(0);
            nisBean.setDate1(nis.getDate1());
            nisBean.setAward1(nis.getAward1());
            nisBean.setUnit1(nis.getUnit1());
            nisBean.setDate2(nis.getDate2());
            nisBean.setAward2(nis.getAward2());
            nisBean.setUnit2(nis.getUnit2());
            nisBean.setDate3(nis.getDate3());
            nisBean.setAward3(nis.getAward3());
            nisBean.setUnit3(nis.getUnit3());
            nisBean.setDate4(nis.getDate4());
            nisBean.setAward4(nis.getAward4());
            nisBean.setUnit4(nis.getUnit4());
            nisBean.setResident(nis.getResident());
            nisBean.setIncomeSource(nis.getIncomeSource());
            nisBean.setMonthIncome(nis.getMonthIncome());
            nisBean.setFamilySum(nis.getFamilySum());
            nisBean.setAddress(nis.getAddress());
            nisBean.setPostalCode(nis.getPostalCode());
            nisBean.setSituation(nis.getSituation());
            nisBean.setApplyReason(nis.getApplyReason());
        }
        UserBasicBean userBasicBean = userBasicService.selectUserBasicBeanByUserId(userId);
        if(userBasicBean != null){
            nisBean.setSchool(userBasicBean.getSchool());
            nisBean.setMajor(userBasicBean.getMajor());
            nisBean.setClassNum(userBasicBean.getClassNum());
            nisBean.setUsername(userBasicBean.getUsername());
            nisBean.setSex(userBasicBean.getSex());
            nisBean.setBirth(userBasicBean.getBirth());
            nisBean.setAccount(userBasicBean.getAccount());
            nisBean.setNation(userBasicBean.getNation());
            nisBean.setEntrance(userBasicBean.getEntrance());
            nisBean.setPolitical(userBasicBean.getPolitical());
            nisBean.setPhone(userBasicBean.getPhone());
            nisBean.setIdentity(userBasicBean.getIdentity());
            nisBean.setMajorSum(userBasicBean.getMajorSum());
        }
        UserInfoBean userInfoBean = userInfoService.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
        if(userInfoBean != null){
            nisBean.setGpRank(userInfoBean.getGpRank());
            nisBean.setCeRank(userInfoBean.getCeRank());
            nisBean.setPassSum(userInfoBean.getPassSum());
            nisBean.setClassSum(userInfoBean.getClassSum());
        }
        Opinion opinion = opinionService.selectByUserIdAndYearScope(userId,yearScope);
        if(opinion != null){
            nisBean.setOpinion(opinion.getNisOpinion());
        }
        return nisBean;
    }

    @Transactional
    @Override
    public int insertNis(Long userId, Integer yearScope, NisBean nisBean) {
        userBasicService.updateByUserIdAndNisBean(userId,nisBean);
        Nis nis = new Nis();
        nis.setUserId(userId);
        nis.setYearScope(yearScope);
        nis.setDate1(nisBean.getDate1());
        nis.setAward1(nisBean.getAward1());
        nis.setUnit1(nisBean.getUnit1());
        nis.setDate2(nisBean.getDate2());
        nis.setAward2(nisBean.getAward2());
        nis.setUnit2(nisBean.getUnit2());
        nis.setDate3(nisBean.getDate3());
        nis.setAward3(nisBean.getAward3());
        nis.setUnit3(nisBean.getUnit3());
        nis.setDate4(nisBean.getDate4());
        nis.setAward4(nisBean.getAward4());
        nis.setUnit4(nisBean.getUnit4());
        nis.setResident(nisBean.getResident());
        nis.setIncomeSource(nisBean.getIncomeSource());
        nis.setMonthIncome(nisBean.getMonthIncome());
        nis.setFamilySum(nisBean.getFamilySum());
        nis.setAddress(nisBean.getAddress());
        nis.setPostalCode(nisBean.getPostalCode());
        nis.setSituation(nisBean.getSituation());
        nis.setApplyReason(nisBean.getApplyReason());
        return nisMapper.insertSelective(nis);
    }

    @Transactional
    @Override
    public int updateNis(Long userId, Integer yearScope, NisBean nisBean) {
        userBasicService.updateByUserIdAndNisBean(userId,nisBean);
        Nis nis = new Nis();
        nis.setUserId(userId);
        nis.setYearScope(yearScope);
        nis.setDate1(nisBean.getDate1());
        nis.setAward1(nisBean.getAward1());
        nis.setUnit1(nisBean.getUnit1());
        nis.setDate2(nisBean.getDate2());
        nis.setAward2(nisBean.getAward2());
        nis.setUnit2(nisBean.getUnit2());
        nis.setDate3(nisBean.getDate3());
        nis.setAward3(nisBean.getAward3());
        nis.setUnit3(nisBean.getUnit3());
        nis.setDate4(nisBean.getDate4());
        nis.setAward4(nisBean.getAward4());
        nis.setUnit4(nisBean.getUnit4());
        nis.setResident(nisBean.getResident());
        nis.setIncomeSource(nisBean.getIncomeSource());
        nis.setMonthIncome(nisBean.getMonthIncome());
        nis.setFamilySum(nisBean.getFamilySum());
        nis.setAddress(nisBean.getAddress());
        nis.setPostalCode(nisBean.getPostalCode());
        nis.setSituation(nisBean.getSituation());
        nis.setApplyReason(nisBean.getApplyReason());
        NisExample example = new NisExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return nisMapper.updateByExampleSelective(nis,example);
    }

    @Override
    public void getNisWord(NisBean nisBean, HttpServletResponse response) throws IOException {
        String modelName = null;
        if(nisBean.getResident().equals("城镇") && nisBean.getSituation().equals("家庭经济特别困难")){
            modelName = "国家励志奖学金模板1";
        }
        else if(nisBean.getResident().equals("城镇") && nisBean.getSituation().equals("家庭经济一般困难")){
            modelName = "国家励志奖学金模板2";
        }
        else if(nisBean.getResident().equals("农村") && nisBean.getSituation().equals("家庭经济特别困难")){
            modelName = "国家励志奖学金模板3";
        }
        else if(nisBean.getResident().equals("农村") && nisBean.getSituation().equals("家庭经济一般困难")){
            modelName = "国家励志奖学金模板4";
        }
        ZipInfoBean zipInfoBean = new ZipInfoBean(nisBean.getAccount(),nisBean.getUsername(),"国家励志奖学金");
        String modelInputUrl = UrlUtil.getInstance().getModelInputUrl(modelName);
        String wordOutputUrl = UrlUtil.getInstance().getWordOutputUrl("nis",zipInfoBean);
        Map<String,String> textMap = TextMapUtil.getInstance().getNisMap(nisBean);
        WordUtil.getInstance().generateWord(modelInputUrl,wordOutputUrl,textMap);
        String fileName = UrlUtil.getInstance().getWordFileName(zipInfoBean);
        DownloadUtil.getInstance().download(wordOutputUrl,response,fileName);
        DeleteUtil.getInstance().delete(wordOutputUrl);
    }


}
