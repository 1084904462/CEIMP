package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.ScholarshipMapper;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipExample;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.TextMapUtil;
import org.obsidian.ceimp.util.TimeUtil;
import org.obsidian.ceimp.util.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/14.
 */
@Service
public class ScholarshipServiceImpl implements ScholarshipService {
    @Autowired
    private ScholarshipMapper scholarshipMapper;

    @Autowired
    private MajorService majorService;

    @Autowired
    private AwardService awardService;

    @Autowired
    private NgService ngService;

    @Autowired
    private NisService nisService;

    @Autowired
    private PgsService pgsService;

    @Autowired
    private SsService ssService;

    @Autowired
    private TasService tasService;

    @Transactional
    @Override
    public List<Map<String, String>> getTextMapList(String subName, List<ZipInfoBean> zipInfoBeanList, Integer yearScope) {
        List<Map<String,String>> textMapList = null;
        if(subName.equals("ng")){
            List<NgBean> ngBeanList = ngService.getNgBeanList(zipInfoBeanList,yearScope);
            textMapList = TextMapUtil.getInstance().getNgMapList(ngBeanList);
        }
        else if(subName.equals("nis")){
            List<NisBean> nisBeanList = nisService.getNisBeanList(zipInfoBeanList,yearScope);
            textMapList = TextMapUtil.getInstance().getNisMapList(nisBeanList);
        }
        else if(subName.equals("pgs")){
            List<PgsBean> pgsBeanList = pgsService.getPgsBeanList(zipInfoBeanList,yearScope);
            textMapList = TextMapUtil.getInstance().getPgsMapList(pgsBeanList);
        }
        else if(subName.equals("ss")){
            List<SsBean> ssBeanList = ssService.getSsBeanList(zipInfoBeanList,yearScope);
            textMapList = TextMapUtil.getInstance().getSsMapList(ssBeanList);
        }
        else if(subName.equals("tas")){
            List<TasBean> tasBeanList = tasService.getTasBeanList(zipInfoBeanList,yearScope);
            textMapList = TextMapUtil.getInstance().getTasMapList(tasBeanList);
        }
        return textMapList;
    }

    @Transactional
    @Override
    public List<String> getModelNameList(String subName,String scholarshipName, List<ZipInfoBean> zipInfoBeanList, Integer yearScope) {
        List<String> modelNameList = new ArrayList<>();
        if(subName.equals("ng") || subName.equals("nis")){
            List<ResidentAndSituationBean> list = scholarshipMapper.getResidentAndSituationBeanList(subName,zipInfoBeanList,yearScope);
            for(int i=0;i<zipInfoBeanList.size();i++){
                if(list.get(i).getResident().equals("城镇") && list.get(i).getSituation().equals("家庭经济特别困难")){
                    modelNameList.add(UrlUtil.getInstance().getModelInputUrl(scholarshipName + "模板1"));
                }
                else if(list.get(i).getResident().equals("城镇") && list.get(i).getSituation().equals("家庭经济一般困难")){
                    modelNameList.add(UrlUtil.getInstance().getModelInputUrl(scholarshipName + "模板2"));
                }
                else if(list.get(i).getResident().equals("农村") && list.get(i).getSituation().equals("家庭经济特别困难")){
                    modelNameList.add(UrlUtil.getInstance().getModelInputUrl(scholarshipName + "模板3"));
                }
                else if(list.get(i).getResident().equals("农村") && list.get(i).getSituation().equals("家庭经济一般困难")){
                    modelNameList.add(UrlUtil.getInstance().getModelInputUrl(scholarshipName + "模板4"));
                }
            }
        }
        else{
            for(int i=0;i<zipInfoBeanList.size();i++){
                modelNameList.add(UrlUtil.getInstance().getModelInputUrl(scholarshipName + "模板"));
            }
        }
        return modelNameList;
    }

    @Transactional
    @Override
    public String selectScholarshipNameBySubName(String subName) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andSubNameEqualTo(subName);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0).getModelName().split("模板")[0];
    }

    @Transactional
    @Override
    public int deleteBySubNameAndUserAccountBeanListAndYearScope(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope) {
        return scholarshipMapper.deleteAllBySubNameAndUserAccountBeanListAndYearScope(subName,userAccountBeanList,yearScope);
    }

    public ShowScholarshipBean getShowScholarshipBean(String subName, Long schoolId){
        ShowScholarshipBean showScholarshipBean = new ShowScholarshipBean();
        showScholarshipBean.setScholarshipName(this.selectScholarshipNameBySubName(subName));
        showScholarshipBean.setSubName(subName);
        showScholarshipBean.setGrade(majorService.selectAllGradeBySchoolId(schoolId));
        showScholarshipBean.setYearScope(TimeUtil.getInstance().getThisYear());
        return showScholarshipBean;
    }

    public List<ScholarshipFormBean> getScholarshipFormBeanList(String subName, Integer yearScope, String grade){
        return awardService.selectAllBySubNameAndYearScope(subName,yearScope,grade);
    }

}
