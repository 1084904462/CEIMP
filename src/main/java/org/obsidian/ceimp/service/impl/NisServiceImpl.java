package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NisBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.dao.NisMapper;
import org.obsidian.ceimp.entity.Nis;
import org.obsidian.ceimp.entity.NisExample;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.service.NisService;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.service.UserInfoService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
