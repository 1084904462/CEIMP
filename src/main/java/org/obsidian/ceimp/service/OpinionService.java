package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NgOpinionFormBean;
import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.entity.Opinion;

import java.util.List;

/**
 * Created by BillChen on 2017/11/20.
 */
public interface OpinionService {
    ScholarshipOpinionBean getBean(Long managerId,Integer yearScope);

    int updateByManagerIdAndYearScopeAndScholarshipOpinionBean(Long managerId,Integer yearScope,ScholarshipOpinionBean scholarshipOpinionBean);

    Opinion get(Long userId,Integer yearScope);

    List<NgOpinionFormBean> getNgOpinionFormBeanListBySchoolIdAndGradeAndYearScope(Long schoolId,String grade,Integer yearScope);
}
