package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.dao.OpinionMapper;
import org.obsidian.ceimp.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by BillChen on 2017/11/20.
 */
@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionMapper opinionMapper;

    @Transactional
    @Override
    public ScholarshipOpinionBean selectByManagerIdAndYearScope(Long managerId, Integer yearScope) {
        return opinionMapper.selectByManagerIdAndYearScope(managerId,yearScope);
    }

    @Transactional
    @Override
    public int updateByManagerIdAndYearScopeAndScholarshipOpinionBean(Long managerId, Integer yearScope, ScholarshipOpinionBean scholarshipOpinionBean) {
        return opinionMapper.updateByManagerIdAndYearScopeAndScholarshipOpinionBean(managerId,yearScope,scholarshipOpinionBean);
    }
}
