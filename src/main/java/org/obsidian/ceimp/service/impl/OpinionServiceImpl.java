package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NgOpinionFormBean;
import org.obsidian.ceimp.bean.NgOpinionUpdateBean;
import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.dao.OpinionMapper;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.service.OpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/20.
 */
@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionMapper opinionMapper;

    @Transactional
    @Override
    public ScholarshipOpinionBean getBean(Long schoolId,String grade, Integer yearScope) {
        return opinionMapper.getBean(schoolId,grade,yearScope);
    }

    @Transactional
    @Override
    public int update(Long schoolId, Integer yearScope, ScholarshipOpinionBean scholarshipOpinionBean) {
        return opinionMapper.update(schoolId,yearScope,scholarshipOpinionBean);
    }

    @Transactional
    @Override
    public Opinion get(Long userId, Integer yearScope) {
        return opinionMapper.get(userId,yearScope);
    }

    @Transactional
    @Override
    public List<NgOpinionFormBean> getNgOpinionFormBeanList(Long schoolId,String grade, Integer yearScope) {
        return opinionMapper.getNgOpinionFormBeanList(schoolId,grade,yearScope);
    }

    @Transactional
    @Override
    public int updateNgOpinion(NgOpinionUpdateBean ngOpinionUpdateBean, Integer yearScope) {
        return opinionMapper.updateNgOpinion(ngOpinionUpdateBean,yearScope);
    }
}
