package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.dao.*;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.BasicScholarshipService;
import org.obsidian.ceimp.util.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2018/5/16.
 */
@Service
public class BasicScholarshipServiceImpl implements BasicScholarshipService {

    @Autowired
    private BasicScholarshipMapper basicScholarshipMapper;

    @Autowired
    private UserBasicMapper userBasicMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private OpinionMapper opinionMapper;

    @Autowired
    private NgMapper ngMapper;

    @Autowired
    private NisMapper nisMapper;

    @Autowired
    private PgsMapper pgsMapper;

    @Autowired
    private SsMapper ssMapper;

    @Autowired
    private TasMapper tasMapper;

    @Override
    public BasicScholarshipBean getBean(String subName, Long userId, Integer yearScope) {
        BasicScholarshipBean bean = null;
        if("ng".equals(subName)){
            bean = this.getNgBean(userId,yearScope);
        }
        else if("nis".equals(subName)){
            bean = this.getNisBean(userId,yearScope);
        }
        else if("pgs".equals(subName)){
            bean = this.getPgsBean(userId,yearScope);
        }
        else if("ss".equals(subName)){
            bean = this.getSsBean(userId,yearScope);
        }
        else if("tas".equals(subName)){
            bean = this.getTasBean(userId,yearScope);
        }
        UserBasicBean userBasicBean = userBasicMapper.getBean(userId);
        if(userBasicBean != null){
            BeanUtils.copyProperties(userBasicBean,bean);
        }
        UserInfoBean userInfoBean = userInfoMapper.getBean(userId,yearScope);
        if(userInfoBean != null){
            BeanUtils.copyProperties(userInfoBean,bean);
        }
        return bean;
    }

    @Override
    public BasicScholarshipBean copyBean(String subName, Long userId, Integer yearScope,BasicScholarshipBean postBean){
        BasicScholarshipBean bean = this.getBean(subName,userId,yearScope);
        if("ng".equals(subName)){
            bean.setSex(postBean.getSex());
            bean.setBirth(postBean.getBirth());
            bean.setEntrance(postBean.getEntrance());
            bean.setIdentity(postBean.getIdentity());
            bean.setPolitical(postBean.getPolitical());
            bean.setPhone(postBean.getPhone());
            bean.setNation(postBean.getNation());
            bean.setfName1(postBean.getfName1());
            bean.setAge1(postBean.getAge1());
            bean.setRelation1(postBean.getRelation1());
            bean.setWorkPlace1(postBean.getWorkPlace1());
            bean.setfName2(postBean.getfName2());
            bean.setAge2(postBean.getAge2());
            bean.setRelation2(postBean.getRelation2());
            bean.setWorkPlace2(postBean.getWorkPlace2());
            bean.setfName3(postBean.getfName3());
            bean.setAge3(postBean.getAge3());
            bean.setRelation3(postBean.getRelation3());
            bean.setWorkPlace3(postBean.getWorkPlace3());
            bean.setfName4(postBean.getfName4());
            bean.setAge4(postBean.getAge4());
            bean.setRelation4(postBean.getRelation4());
            bean.setWorkPlace4(postBean.getWorkPlace4());
            bean.setfName5(postBean.getfName5());
            bean.setAge5(postBean.getAge5());
            bean.setRelation5(postBean.getRelation5());
            bean.setWorkPlace5(postBean.getWorkPlace5());
            bean.setMonthIncome(postBean.getMonthIncome());
            bean.setResident(postBean.getResident());
            bean.setIncomeSource(postBean.getIncomeSource());
            bean.setFamilySum(postBean.getFamilySum());
            bean.setPostalCode(postBean.getPostalCode());
            bean.setAddress(postBean.getAddress());
            bean.setSituation(postBean.getSituation());
            bean.setApplyReason(postBean.getApplyReason());
        }
        else if("nis".equals(subName)){
            bean.setSex(postBean.getSex());
            bean.setBirth(postBean.getBirth());
            bean.setEntrance(postBean.getEntrance());
            bean.setIdentity(postBean.getIdentity());
            bean.setPolitical(postBean.getPolitical());
            bean.setPhone(postBean.getPhone());
            bean.setNation(postBean.getNation());
            bean.setPassSum(postBean.getPassSum());
            bean.setClassSum(postBean.getClassSum());
            bean.setDate1(postBean.getDate1());
            bean.setAward1(postBean.getAward1());
            bean.setUnit1(postBean.getUnit1());
            bean.setDate2(postBean.getDate2());
            bean.setAward2(postBean.getAward2());
            bean.setUnit2(postBean.getUnit2());
            bean.setDate3(postBean.getDate3());
            bean.setAward3(postBean.getAward3());
            bean.setUnit3(postBean.getUnit3());
            bean.setDate4(postBean.getDate4());
            bean.setAward4(postBean.getAward4());
            bean.setUnit4(postBean.getUnit4());
            bean.setMonthIncome(postBean.getMonthIncome());
            bean.setResident(postBean.getResident());
            bean.setIncomeSource(postBean.getIncomeSource());
            bean.setFamilySum(postBean.getFamilySum());
            bean.setPostalCode(postBean.getPostalCode());
            bean.setAddress(postBean.getAddress());
            bean.setSituation(postBean.getSituation());
            bean.setApplyReason(postBean.getApplyReason());
        }
        else if("pgs".equals(subName)){
            bean.setSex(postBean.getSex());
            bean.setBirth(postBean.getBirth());
            bean.setEntrance(postBean.getEntrance());
            bean.setIdentity(postBean.getIdentity());
            bean.setPolitical(postBean.getPolitical());
            bean.setPhone(postBean.getPhone());
            bean.setNation(postBean.getNation());
            bean.setPassSum(postBean.getPassSum());
            bean.setClassSum(postBean.getClassSum());
            bean.setDate1(postBean.getDate1());
            bean.setAward1(postBean.getAward1());
            bean.setUnit1(postBean.getUnit1());
            bean.setDate2(postBean.getDate2());
            bean.setAward2(postBean.getAward2());
            bean.setUnit2(postBean.getUnit2());
            bean.setDate3(postBean.getDate3());
            bean.setAward3(postBean.getAward3());
            bean.setUnit3(postBean.getUnit3());
            bean.setDate4(postBean.getDate4());
            bean.setAward4(postBean.getAward4());
            bean.setUnit4(postBean.getUnit4());
            bean.setApplyReason(postBean.getApplyReason());
        }
        else if("ss".equals(subName)){
            bean.setSex(postBean.getSex());
            bean.setPolitical(postBean.getPolitical());
            bean.setNation(postBean.getNation());
            bean.setJob(postBean.getJob());
            bean.setApplyReason(postBean.getApplyReason());
        }
        else if("tas".equals(subName)){
            bean.setSex(postBean.getSex());
            bean.setPolitical(postBean.getPolitical());
            bean.setNation(postBean.getNation());
            bean.setJob(postBean.getJob());
            bean.setApplyReason(postBean.getApplyReason());
        }
        return bean;
    }

    @Override
    public List<BasicScholarshipBean> getBeanList(String subName, List<ZipInfoBean> zipInfoBeanList, Integer yearScope) {
        List<BasicScholarshipBean> beanList = null;
        if("ng".equals(subName)){
            beanList = basicScholarshipMapper.getNgBeanList(zipInfoBeanList,yearScope);
        }
        else if("nis".equals(subName)){
            beanList = basicScholarshipMapper.getNisBeanList(zipInfoBeanList,yearScope);
        }
        else if("pgs".equals(subName)){
            beanList = basicScholarshipMapper.getPgsBeanList(zipInfoBeanList,yearScope);
        }
        else if("ss".equals(subName)){
            beanList = basicScholarshipMapper.getSsBeanList(zipInfoBeanList,yearScope);
        }
        else if("tas".equals(subName)){
            beanList = basicScholarshipMapper.getTasBeanList(zipInfoBeanList,yearScope);
        }
        return beanList;
    }

    @Override
    public Boolean exist(String subName, Long userId, Integer yearScope) {
        return basicScholarshipMapper.exist(subName,userId,yearScope);
    }

    @Override
    public int insert(String subName, Long userId, Integer yearScope, BasicScholarshipBean bean) {
        userBasicMapper.update(userId,bean);
        userInfoMapper.update(userId,yearScope,bean);
        int result = 0;
        if("ng".equals(subName)){
            result = ngMapper.insertNg(userId,yearScope,bean);
        }
        else if("nis".equals(subName)){
            result = nisMapper.insertNis(userId,yearScope,bean);
        }
        else if("pgs".equals(subName)){
            result = pgsMapper.insertPgs(userId,yearScope,bean);
        }
        else if("ss".equals(subName)){
            result = ssMapper.insertSs(userId,yearScope,bean);
        }
        else if("tas".equals(subName)){
            result = tasMapper.insertTas(userId,yearScope,bean);
        }
        return result;
    }

    @Override
    public int update(String subName, Long userId, Integer yearScope, BasicScholarshipBean bean) {
        userBasicMapper.update(userId,bean);
        userInfoMapper.update(userId,yearScope,bean);
        int result = 0;
        if("ng".equals(subName)){
            result = ngMapper.updateNg(userId,yearScope,bean);
        }
        else if("nis".equals(subName)){
            result = nisMapper.updateNis(userId,yearScope,bean);
        }
        else if("pgs".equals(subName)){
            result = pgsMapper.updatePgs(userId,yearScope,bean);
        }
        else if("ss".equals(subName)){
            result = ssMapper.updateSs(userId,yearScope,bean);
        }
        else if("tas".equals(subName)){
            result = tasMapper.updateTas(userId,yearScope,bean);
        }
        return result;
    }

    @Override
    public ResponseEntity<byte[]> generateWord(String subName, BasicScholarshipBean bean) throws IOException {
        ResponseEntity<byte[]> response = null;
        String modelName = null;
        ZipInfoBean zipInfoBean = null;
        if("ng".equals(subName)){
            if("城镇".equals(bean.getResident()) && "家庭经济特别困难".equals(bean.getSituation())){
                modelName = "国家助学金模板1";
            }
            else if("城镇".equals(bean.getResident()) && "家庭经济一般困难".equals(bean.getSituation())){
                modelName = "国家助学金模板2";
            }
            else if("农村".equals(bean.getResident()) && "家庭经济特别困难".equals(bean.getSituation())){
                modelName = "国家助学金模板3";
            }
            else if("农村".equals(bean.getResident()) && "家庭经济一般困难".equals(bean.getSituation())){
                modelName = "国家助学金模板4";
            }
            zipInfoBean = new ZipInfoBean(bean.getAccount(),bean.getUsername(),"国家助学金");
        }
        else if("nis".equals(subName)){
            if("城镇".equals(bean.getResident()) && "家庭经济特别困难".equals(bean.getSituation())){
                modelName = "国家励志奖学金模板1";
            }
            else if("城镇".equals(bean.getResident()) && "家庭经济一般困难".equals(bean.getSituation())){
                modelName = "国家励志奖学金模板2";
            }
            else if("农村".equals(bean.getResident()) && "家庭经济特别困难".equals(bean.getSituation())){
                modelName = "国家励志奖学金模板3";
            }
            else if("农村".equals(bean.getResident()) && "家庭经济一般困难".equals(bean.getSituation())){
                modelName = "国家励志奖学金模板4";
            }
            zipInfoBean = new ZipInfoBean(bean.getAccount(),bean.getUsername(),"国家励志奖学金");
        }
        else if("pgs".equals(subName)){
            modelName = "省政府奖学金模板";
            zipInfoBean = new ZipInfoBean(bean.getAccount(),bean.getUsername(),"省政府奖学金");
        }
        else if("ss".equals(subName)){
            modelName = "校奖学金模板";
            zipInfoBean = new ZipInfoBean(bean.getAccount(),bean.getUsername(),bean.getRank());
        }
        else if("tas".equals(subName)){
            modelName = "三好学生模板";
            zipInfoBean = new ZipInfoBean(bean.getAccount(),bean.getUsername(),"三好学生");
        }
        String modelInputUrl = UrlUtil.getInstance().getModelInputUrl(modelName);
        String wordOutputUrl = UrlUtil.getInstance().getWordOutputUrl(zipInfoBean);
        Map<String,String> textMap = TextMapUtil.getInstance().get(bean);
        WordUtil.getInstance().generateWord(modelInputUrl,wordOutputUrl,textMap);
        return DownloadUtil.getInstance().downloadAndDelete(wordOutputUrl);
    }

    private BasicScholarshipBean getNgBean(Long userId,Integer yearScope){
        BasicScholarshipBean bean = new BasicScholarshipBean();
        bean.setTimeStart(yearScope);
        bean.setTimeEnd(yearScope + 1);
        Ng ng = ngMapper.get(userId,yearScope);
        if(ng != null) {
            BeanUtils.copyProperties(ng, bean);
        }
        return bean;
    }
    private BasicScholarshipBean getNisBean(Long userId,Integer yearScope){
        BasicScholarshipBean bean = new BasicScholarshipBean();
        bean.setTimeStart(yearScope - 1);
        bean.setTimeEnd(yearScope);
        Nis nis = nisMapper.get(userId,yearScope);
        if(nis != null){
            BeanUtils.copyProperties(nis,bean);
        }
        Opinion opinion = opinionMapper.get(userId,yearScope);
        if(opinion != null){
            bean.setOpinion(opinion.getNisOpinion());
        }
        return bean;
    }
    private BasicScholarshipBean getPgsBean(Long userId,Integer yearScope){
        BasicScholarshipBean bean = new BasicScholarshipBean();
        bean.setTimeStart(yearScope - 1);
        bean.setTimeEnd(yearScope);
        Pgs pgs = pgsMapper.get(userId,yearScope);
        if(pgs != null){
            BeanUtils.copyProperties(pgs,bean);
        }
        Opinion opinion = opinionMapper.get(userId,yearScope);
        if(opinion != null){
            bean.setRecommendReason(opinion.getPgsRecommend());
            bean.setOpinion(opinion.getPgsOpinion());
        }
        return bean;
    }
    private BasicScholarshipBean getSsBean(Long userId,Integer yearScope){
        BasicScholarshipBean bean = new BasicScholarshipBean();
        bean.setTimeStart(yearScope - 1);
        bean.setTimeEnd(yearScope);
        Ss ss = ssMapper.get(userId,yearScope);
        if(ss != null){
            BeanUtils.copyProperties(ss,bean);
        }
        String rank = ssMapper.getRank(userId,yearScope);
        if(rank != null){
            bean.setRank(rank);
        }
        Opinion opinion = opinionMapper.get(userId,yearScope);
        if(opinion != null){
            bean.setOpinion(opinion.getSsOpinion());
        }
        return bean;
    }
    private BasicScholarshipBean getTasBean(Long userId, Integer yearScope){
        BasicScholarshipBean bean = new BasicScholarshipBean();
        bean.setTimeStart(yearScope - 1);
        bean.setTimeEnd(yearScope);
        Tas tas = tasMapper.get(userId,yearScope);
        if(tas != null){
            BeanUtils.copyProperties(tas,bean);
        }
        Opinion opinion = opinionMapper.get(userId,yearScope);
        if(opinion != null){
            bean.setOpinion(opinion.getTasOpinion());
        }
        return bean;
    }
}