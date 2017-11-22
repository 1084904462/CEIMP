package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.dao.SsMapper;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.Ss;
import org.obsidian.ceimp.entity.SsExample;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.SsService;
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
public class SsServiceImpl implements SsService {

    @Autowired
    private SsMapper ssMapper;

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private OpinionService opinionService;

    @Transactional
    @Override
    public Ss selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        SsExample example = new SsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ss> list = ssMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public SsBean getSsBeanByUserIdAndYearScope(Long userId, Integer yearScope) {
        SsBean ssBean = new SsBean();
        ssBean.setTs(TimeUtil.getInstance().getThisYear()-1);
        ssBean.setTe(TimeUtil.getInstance().getThisYear());
        SsExample example = new SsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ss> ssList = ssMapper.selectByExample(example);
        if(!ssList.isEmpty()){
            Ss ss = ssList.get(0);
            ssBean.setReason(ss.getReason());
        }
        UserBasicBean userBasicBean = userBasicService.selectUserBasicBeanByUserId(userId);
        if(userBasicBean != null){
            ssBean.setSchool(userBasicBean.getSchool());
            ssBean.setMajor(userBasicBean.getMajor());
            ssBean.setClassNum(userBasicBean.getClassNum());
            ssBean.setUsername(userBasicBean.getUsername());
            ssBean.setSex(userBasicBean.getSex());
            ssBean.setAccount(userBasicBean.getAccount());
            ssBean.setNation(userBasicBean.getNation());
            ssBean.setPolitical(userBasicBean.getPolitical());
            ssBean.setJob(userBasicBean.getJob());
            ssBean.setMajorSum(userBasicBean.getMajorSum());
        }
        UserInfoBean userInfoBean = userInfoService.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
        if(userInfoBean != null){
            ssBean.setCharact(userInfoBean.getCharact());
            ssBean.setStudy(userInfoBean.getStudy());
            ssBean.setAbility(userInfoBean.getAbility());
            ssBean.setTotal(userInfoBean.getTotal());
            ssBean.setCeRank(userInfoBean.getCeRank());
        }
        String rank = ssMapper.selectRankByUserIdAndYearScope(userId,yearScope);
        ssBean.setRank(rank);
        Opinion opinion = opinionService.selectByUserIdAndYearScope(userId,yearScope);
        if(opinion != null){
            ssBean.setOpinion(opinion.getSsOpinion());
        }
        return ssBean;
    }
}
