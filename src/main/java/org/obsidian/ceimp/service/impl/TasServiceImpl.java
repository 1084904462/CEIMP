package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.TasBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.dao.TasMapper;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.Tas;
import org.obsidian.ceimp.entity.TasExample;
import org.obsidian.ceimp.service.OpinionService;
import org.obsidian.ceimp.service.TasService;
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
public class TasServiceImpl implements TasService {

    @Autowired
    private TasMapper tasMapper;

    @Autowired
    private UserBasicService userBasicService;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private OpinionService opinionService;

    @Transactional
    @Override
    public Tas selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        TasExample example = new TasExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Tas> list = tasMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public TasBean getTasBeanByUserIdAndYearScope(Long userId, Integer yearScope) {
        TasBean tasBean = new TasBean();
        tasBean.setTs(TimeUtil.getInstance().getThisYear()-1);
        tasBean.setTe(TimeUtil.getInstance().getThisYear());
        TasExample example = new TasExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Tas> tasList = tasMapper.selectByExample(example);
        if(!tasList.isEmpty()){
            Tas tas = tasList.get(0);
            tasBean.setReason(tas.getReason());
        }
        UserBasicBean userBasicBean = userBasicService.selectUserBasicBeanByUserId(userId);
        if(userBasicBean != null){
            tasBean.setSchool(userBasicBean.getSchool());
            tasBean.setMajor(userBasicBean.getMajor());
            tasBean.setClassNum(userBasicBean.getClassNum());
            tasBean.setUsername(userBasicBean.getUsername());
            tasBean.setSex(userBasicBean.getSex());
            tasBean.setAccount(userBasicBean.getAccount());
            tasBean.setNation(userBasicBean.getNation());
            tasBean.setPolitical(userBasicBean.getPolitical());
            tasBean.setJob(userBasicBean.getJob());
            tasBean.setMajorSum(userBasicBean.getMajorSum());
        }
        UserInfoBean userInfoBean = userInfoService.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
        if(userInfoBean != null){
            tasBean.setCharact(userInfoBean.getCharact());
            tasBean.setStudy(userInfoBean.getStudy());
            tasBean.setAbility(userInfoBean.getAbility());
            tasBean.setTotal(userInfoBean.getTotal());
            tasBean.setCeRank(userInfoBean.getCeRank());
        }
        Opinion opinion = opinionService.selectByUserIdAndYearScope(userId,yearScope);
        if(opinion != null){
            tasBean.setOpinion(opinion.getTasOpinion());
        }
        return tasBean;
    }

    @Transactional
    @Override
    public int insertTas(Long userId, Integer yearScope, TasBean tasBean) {
        userBasicService.updateByUserIdAndTasBean(userId,tasBean);
        Tas tas = new Tas();
        tas.setUserId(userId);
        tas.setYearScope(yearScope);
        tas.setReason(tasBean.getReason());
        return tasMapper.insertSelective(tas);
    }

    @Transactional
    @Override
    public int updateTas(Long userId, Integer yearScope, TasBean tasBean) {
        userBasicService.updateByUserIdAndTasBean(userId,tasBean);
        Tas tas = new Tas();
        tas.setUserId(userId);
        tas.setYearScope(yearScope);
        tas.setReason(tasBean.getReason());
        TasExample example = new TasExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return tasMapper.updateByExampleSelective(tas,example);
    }

    @Override
    public void getTasWord(TasBean tasBean, HttpServletResponse response) throws IOException {
        String modelName = "三好学生模板";
        ZipInfoBean zipInfoBean = new ZipInfoBean(tasBean.getAccount(),tasBean.getUsername(),"三好学生");
        String modelInputUrl = UrlUtil.getInstance().getModelInputUrl(modelName);
        String wordOutputUrl = UrlUtil.getInstance().getWordOutputUrl("tas",zipInfoBean);
        Map<String,String> textMap = TextMapUtil.getInstance().getTasMap(tasBean);
        WordUtil.getInstance().generateWord(modelInputUrl,wordOutputUrl,textMap);
        String fileName = UrlUtil.getInstance().getWordFileName(zipInfoBean);
        DownloadUtil.getInstance().download(wordOutputUrl,response,fileName);
        DeleteUtil.getInstance().delete(wordOutputUrl);
    }
}
