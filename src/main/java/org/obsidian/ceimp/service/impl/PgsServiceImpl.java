package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.PgsBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.dao.PgsMapper;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.Pgs;
import org.obsidian.ceimp.entity.PgsExample;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.PgsService;
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
    public List<PgsBean> getPgsBeanList(List<ZipInfoBean> zipInfoBeanList, Integer yearScope) {
        List<PgsBean> pgsBeanList = pgsMapper.getPgsBeanList(zipInfoBeanList,yearScope);
        for(int i=0;i<pgsBeanList.size();i++){
            pgsBeanList.get(i).setTs(pgsBeanList.get(i).getTe() - 1);
        }
        return pgsBeanList;
    }

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
            pgsBean.setUsername(userBasicBean.getUsername());
            pgsBean.setSex(userBasicBean.getSex());
            pgsBean.setBirth(userBasicBean.getBirth());
            pgsBean.setAccount(userBasicBean.getAccount());
            pgsBean.setNation(userBasicBean.getNation());
            pgsBean.setEntrance(userBasicBean.getEntrance());
            pgsBean.setIdentity(userBasicBean.getIdentity());
        }
        UserInfoBean userInfoBean = userInfoService.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
        if(userInfoBean != null){
            pgsBean.setSchool(userInfoBean.getSchool());
            pgsBean.setMajor(userInfoBean.getMajor());
            pgsBean.setClassNum(userInfoBean.getClassNum());
            pgsBean.setPolitical(userInfoBean.getPolitical());
            pgsBean.setPhone(userInfoBean.getPhone());
            pgsBean.setMajorSum(userInfoBean.getMajorSum());
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

    @Transactional
    @Override
    public int insertPgs(Long userId, Integer yearScope, PgsBean pgsBean) {
        userInfoService.updateByUserIdAndPgsBeanAndYearScope(userId,pgsBean,yearScope);
        Pgs pgs = new Pgs();
        pgs.setUserId(userId);
        pgs.setYearScope(yearScope);
        pgs.setDate1(pgsBean.getDate1());
        pgs.setAward1(pgsBean.getAward1());
        pgs.setUnit1(pgsBean.getUnit1());
        pgs.setDate2(pgsBean.getDate2());
        pgs.setAward2(pgsBean.getAward2());
        pgs.setUnit2(pgsBean.getUnit2());
        pgs.setDate3(pgsBean.getDate3());
        pgs.setAward3(pgsBean.getAward3());
        pgs.setUnit3(pgsBean.getUnit3());
        pgs.setDate4(pgsBean.getDate4());
        pgs.setAward4(pgsBean.getAward4());
        pgs.setUnit4(pgsBean.getUnit4());
        pgs.setApplyReason(pgsBean.getApplyReason());
        return pgsMapper.insertSelective(pgs);
    }

    @Transactional
    @Override
    public int updatePgs(Long userId, Integer yearScope, PgsBean pgsBean) {
        userInfoService.updateByUserIdAndPgsBeanAndYearScope(userId,pgsBean,yearScope);
        Pgs pgs = new Pgs();
        pgs.setUserId(userId);
        pgs.setYearScope(yearScope);
        pgs.setDate1(pgsBean.getDate1());
        pgs.setAward1(pgsBean.getAward1());
        pgs.setUnit1(pgsBean.getUnit1());
        pgs.setDate2(pgsBean.getDate2());
        pgs.setAward2(pgsBean.getAward2());
        pgs.setUnit2(pgsBean.getUnit2());
        pgs.setDate3(pgsBean.getDate3());
        pgs.setAward3(pgsBean.getAward3());
        pgs.setUnit3(pgsBean.getUnit3());
        pgs.setDate4(pgsBean.getDate4());
        pgs.setAward4(pgsBean.getAward4());
        pgs.setUnit4(pgsBean.getUnit4());
        pgs.setApplyReason(pgsBean.getApplyReason());
        PgsExample example = new PgsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return pgsMapper.updateByExampleSelective(pgs,example);
    }

    @Override
    public void getPgsWord(PgsBean pgsBean, HttpServletResponse response) throws IOException {
        String modelName = "省政府奖学金模板";
        ZipInfoBean zipInfoBean = new ZipInfoBean(pgsBean.getAccount(),pgsBean.getUsername(),"省政府奖学金");
        String modelInputUrl = UrlUtil.getInstance().getModelInputUrl(modelName);
        String wordOutputUrl = UrlUtil.getInstance().getWordOutputUrl("pgs",zipInfoBean);
        Map<String,String> textMap = TextMapUtil.getInstance().getPgsMap(pgsBean);
        WordUtil.getInstance().generateWord(modelInputUrl,wordOutputUrl,textMap);
        String fileName = UrlUtil.getInstance().getWordFileName(zipInfoBean);
        DownloadUtil.getInstance().download(wordOutputUrl,response,fileName);
        DeleteUtil.getInstance().delete(wordOutputUrl);
    }
}
