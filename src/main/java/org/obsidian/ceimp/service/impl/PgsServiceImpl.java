package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.PgsBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.dao.PgsMapper;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.Pgs;
import org.obsidian.ceimp.entity.PgsExample;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.PgsService;
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
public class PgsServiceImpl implements PgsService {

    @Autowired
    private PgsMapper pgsMapper;

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private OpinionService opinionService;

    @Transactional
    @Override
    public Pgs selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        PgsExample example = new PgsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Pgs> list = pgsMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Pgs> selectAllByUserId(Long userId) {
        PgsExample example = new PgsExample();
        example.or().andUserIdEqualTo(userId);
        List<Pgs> list = pgsMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public PgsBean getPgsBeanByUserIdAndYearScope(Long userId, Integer yearScope) {
        PgsBean pgsBean = new PgsBean();
        pgsBean.setTs(TimeUtil.getInstance().getThisYear()-1);
        pgsBean.setTe(TimeUtil.getInstance().getThisYear());
        PgsExample example = new PgsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Pgs> pgsList = pgsMapper.selectByExample(example);
        if(!pgsList.isEmpty()){
            Pgs pgs = pgsList.get(0);
            pgsBean.setDate1(pgs.getDate1());
            pgsBean.setAward1(pgs.getAward1());
            pgsBean.setUnit1(pgs.getUnit1());
            pgsBean.setDate2(pgs.getDate2());
            pgsBean.setAward2(pgs.getAward2());
            pgsBean.setUnit2(pgs.getUnit2());
            pgsBean.setDate3(pgs.getDate3());
            pgsBean.setAward3(pgs.getAward3());
            pgsBean.setUnit3(pgs.getUnit3());
            pgsBean.setDate4(pgs.getDate4());
            pgsBean.setAward4(pgs.getAward4());
            pgsBean.setUnit4(pgs.getUnit4());
            pgsBean.setApplyReason(pgs.getApplyReason());
        }
        UserBasicBean userBasicBean = userBasicService.selectUserBasicBeanByUserId(userId);
        if(userBasicBean != null){
            pgsBean.setMajor(userBasicBean.getMajor());
            pgsBean.setClassNum(userBasicBean.getClassNum());
            pgsBean.setUsername(userBasicBean.getUsername());
            pgsBean.setSex(userBasicBean.getSex());
            pgsBean.setBirth(userBasicBean.getBirth());
            pgsBean.setAccount(userBasicBean.getAccount());
            pgsBean.setNation(userBasicBean.getNation());
            pgsBean.setEntrance(userBasicBean.getEntrance());
            pgsBean.setPolitical(userBasicBean.getPolitical());
            pgsBean.setPhone(userBasicBean.getPhone());
            pgsBean.setIdentity(userBasicBean.getIdentity());
            pgsBean.setMajorSum(userBasicBean.getMajorSum());
        }
        UserInfoBean userInfoBean = userInfoService.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
        if(userInfoBean != null){
            pgsBean.setGpRank(userInfoBean.getGpRank());
            pgsBean.setCeRank(userInfoBean.getCeRank());
            pgsBean.setPassSum(userInfoBean.getPassSum());
            pgsBean.setClassSum(userInfoBean.getClassSum());
        }
        Opinion opinion = opinionService.selectByUserIdAndYearScope(userId,yearScope);
        if(opinion != null){
            pgsBean.setRecommendReason(opinion.getPgsRecommend());
            pgsBean.setOpinion(opinion.getPgsOpinion());
        }
        return pgsBean;
    }
}
