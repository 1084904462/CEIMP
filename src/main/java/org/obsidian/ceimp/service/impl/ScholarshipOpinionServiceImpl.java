package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ScholarshipOpinionMapper;
import org.obsidian.ceimp.entity.ScholarshipOpinion;
import org.obsidian.ceimp.entity.ScholarshipOpinionExample;
import org.obsidian.ceimp.service.ScholarshipOpinionSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/17.
 */
@Service
public class ScholarshipOpinionServiceImpl implements ScholarshipOpinionSerivce {

    @Autowired
    private ScholarshipOpinionMapper scholarshipOpinionMapper;

    @Transactional
    @Override
    public int updateScholarshipOpinion(String managerId, String nationalOpinion, String provincialRecommend, String provincialOpinion, String schoolOpinion, String tripleaOpinion) {
        ScholarshipOpinion scholarshipOpinion = new ScholarshipOpinion();
        scholarshipOpinion.setNationalOpinion(nationalOpinion);
        scholarshipOpinion.setProvincialRecommend(provincialRecommend);
        scholarshipOpinion.setProvincialOpinion(provincialOpinion);
        scholarshipOpinion.setSchoolOpinion(schoolOpinion);
        scholarshipOpinion.setTripleaOpinion(tripleaOpinion);
        ScholarshipOpinionExample example = new ScholarshipOpinionExample();
        example.or().andManagerIdEqualTo(managerId);
        return scholarshipOpinionMapper.updateByExampleSelective(scholarshipOpinion,example);
    }

    @Transactional
    @Override
    public ScholarshipOpinion selectByManagerId(String managerId) {
        ScholarshipOpinionExample example = new ScholarshipOpinionExample();
        example.or().andManagerIdEqualTo(managerId);
        List<ScholarshipOpinion> list = scholarshipOpinionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public int updateNationalOpinion(String managerId, String nationalOpinion) {
        ScholarshipOpinion scholarshipOpinion = new ScholarshipOpinion();
        scholarshipOpinion.setNationalOpinion(nationalOpinion);
        ScholarshipOpinionExample example = new ScholarshipOpinionExample();
        example.or().andManagerIdEqualTo(managerId);
        return scholarshipOpinionMapper.updateByExampleSelective(scholarshipOpinion,example);
    }

    @Transactional
    @Override
    public int updateProvincialRecommendAndProvincialOpinion(String managerId, String provincialRecommend, String provincialOpinion) {
        ScholarshipOpinion scholarshipOpinion = new ScholarshipOpinion();
        scholarshipOpinion.setProvincialRecommend(provincialRecommend);
        scholarshipOpinion.setProvincialOpinion(provincialOpinion);
        ScholarshipOpinionExample example = new ScholarshipOpinionExample();
        example.or().andManagerIdEqualTo(managerId);
        return scholarshipOpinionMapper.updateByExampleSelective(scholarshipOpinion,example);
    }

    @Transactional
    @Override
    public int updateSchoolOpinion(String managerId, String schoolOpinion) {
        ScholarshipOpinion scholarshipOpinion = new ScholarshipOpinion();
        scholarshipOpinion.setSchoolOpinion(schoolOpinion);
        ScholarshipOpinionExample example = new ScholarshipOpinionExample();
        example.or().andManagerIdEqualTo(managerId);
        return scholarshipOpinionMapper.updateByExampleSelective(scholarshipOpinion,example);
    }

    @Transactional
    @Override
    public int updateTripleaOpinion(String managerId, String tripleaOpinion) {
        ScholarshipOpinion scholarshipOpinion = new ScholarshipOpinion();
        scholarshipOpinion.setTripleaOpinion(tripleaOpinion);
        ScholarshipOpinionExample example = new ScholarshipOpinionExample();
        example.or().andManagerIdEqualTo(managerId);
        return scholarshipOpinionMapper.updateByExampleSelective(scholarshipOpinion,example);
    }
}
