package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.ShowScholarshipBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.dao.ScholarshipMapper;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipExample;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.service.MajorService;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
