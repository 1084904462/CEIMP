package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.entity.Opinion;

/**
 * Created by BillChen on 2017/11/20.
 */
public interface OpinionService {
    ScholarshipOpinionBean selectByManagerIdAndYearScope(Long managerId,Integer yearScope);

    int updateByManagerIdAndYearScopeAndScholarshipOpinionBean(Long managerId,Integer yearScope,ScholarshipOpinionBean scholarshipOpinionBean);

    Opinion selectByUserIdAndYearScope(Long userId,Integer yearScope);
}
