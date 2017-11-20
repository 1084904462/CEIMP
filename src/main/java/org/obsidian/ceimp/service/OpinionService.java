package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ScholarshipOpinionBean;

/**
 * Created by BillChen on 2017/11/20.
 */
public interface OpinionService {
    ScholarshipOpinionBean selectByManagerIdAndYearScope(Long managerId,Integer yearScope);

    int updateByManagerIdAndYearScopeAndScholarshipOpinionBean(Long managerId,Integer yearScope,ScholarshipOpinionBean scholarshipOpinionBean);
}
