package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.dao.SsMapper;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.Ss;
import org.obsidian.ceimp.entity.SsExample;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.SsService;
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
    public List<SsBean> getSsBeanList(List<ZipInfoBean> zipInfoBeanList, Integer yearScope) {
        List<SsBean> ssBeanList = ssMapper.getSsBeanList(zipInfoBeanList,yearScope);
        for(int i=0;i<ssBeanList.size();i++){
            ssBeanList.get(i).setTs(ssBeanList.get(i).getTe() - 1);
        }
        return ssBeanList;
    }

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
            ssBean.setUsername(userBasicBean.getUsername());
            ssBean.setSex(userBasicBean.getSex());
            ssBean.setAccount(userBasicBean.getAccount());
            ssBean.setNation(userBasicBean.getNation());
        }
        UserInfoBean userInfoBean = userInfoService.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
        if(userInfoBean != null){
            ssBean.setSchool(userInfoBean.getSchool());
            ssBean.setMajor(userInfoBean.getMajor());
            ssBean.setClassNum(userInfoBean.getClassNum());
            ssBean.setPolitical(userInfoBean.getPolitical());
            ssBean.setJob(userInfoBean.getJob());
            ssBean.setMajorSum(userInfoBean.getMajorSum());
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

    @Transactional
    @Override
    public int insertSs(Long userId, Integer yearScope, SsBean ssBean) {
        userBasicService.updateByUserIdAndSsBean(userId,ssBean);
        userInfoService.updateByUserIdAndSsBeanAndYearScope(userId,ssBean,yearScope);
        Ss ss = new Ss();
        ss.setUserId(userId);
        ss.setYearScope(yearScope);
        ss.setReason(ssBean.getReason());
        return ssMapper.insertSelective(ss);
    }

    @Transactional
    @Override
    public int updateSs(Long userId, Integer yearScope, SsBean ssBean) {
        userBasicService.updateByUserIdAndSsBean(userId,ssBean);
        userInfoService.updateByUserIdAndSsBeanAndYearScope(userId,ssBean,yearScope);
        Ss ss = new Ss();
        ss.setUserId(userId);
        ss.setYearScope(yearScope);
        ss.setReason(ssBean.getReason());
        SsExample example = new SsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return ssMapper.updateByExampleSelective(ss,example);
    }

    @Override
    public void getSsWord(SsBean ssBean, HttpServletResponse response) throws IOException {
        String modelName = "校奖学金模板";
        ZipInfoBean zipInfoBean = new ZipInfoBean(ssBean.getAccount(),ssBean.getUsername(),ssBean.getRank());
        String modelInputUrl = UrlUtil.getInstance().getModelInputUrl(modelName);
        String wordOutputUrl = UrlUtil.getInstance().getWordOutputUrl("ss",zipInfoBean);
        Map<String,String> textMap = TextMapUtil.getInstance().getSsMap(ssBean);
        WordUtil.getInstance().generateWord(modelInputUrl,wordOutputUrl,textMap);
        String fileName = UrlUtil.getInstance().getWordFileName(zipInfoBean);
        DownloadUtil.getInstance().download(wordOutputUrl,response,fileName);
        DeleteUtil.getInstance().delete(wordOutputUrl);
    }
}
