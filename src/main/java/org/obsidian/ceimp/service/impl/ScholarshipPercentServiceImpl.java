package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ScholarshipPercentMapper;
import org.obsidian.ceimp.entity.ScholarshipPercent;
import org.obsidian.ceimp.entity.ScholarshipPercentExample;
import org.obsidian.ceimp.service.ScholarshipPercentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/9/7.
 */
@Service
public class ScholarshipPercentServiceImpl implements ScholarshipPercentService {

    @Autowired
    private ScholarshipPercentMapper scholarshipPercentMapper;

    @Transactional
    @Override
    public int insertScholarshipPercent(int scholarshipId, String level, double percent) {
        ScholarshipPercent scholarshipPercent = new ScholarshipPercent(scholarshipId,level,percent);
        return scholarshipPercentMapper.insertSelective(scholarshipPercent);
    }

    @Transactional
    @Override
    public int updateScholarshipPercent(int percentId, int scholarshipId, String level, double percent) {
        ScholarshipPercent scholarshipPercent = new ScholarshipPercent(percentId,scholarshipId,level,percent);
        ScholarshipPercentExample example = new ScholarshipPercentExample();
        example.or().andPercentIdEqualTo(percentId);
        return scholarshipPercentMapper.updateByExample(scholarshipPercent,example);
    }

    @Transactional
    @Override
    public int deleteScholarshipPercent(int percentId) {
        ScholarshipPercentExample example = new ScholarshipPercentExample();
        example.or().andPercentIdEqualTo(percentId);
        return scholarshipPercentMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ScholarshipPercent selectByPercentId(int percentId) {
        ScholarshipPercentExample example = new ScholarshipPercentExample();
        example.or().andPercentIdEqualTo(percentId);
        List<ScholarshipPercent> list = scholarshipPercentMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ScholarshipPercent> selectAllByScholarshipId(int scholarshipId) {
        ScholarshipPercentExample example = new ScholarshipPercentExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        List<ScholarshipPercent> list = scholarshipPercentMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipPercent> selectAll() {
        ScholarshipPercentExample example = new ScholarshipPercentExample();
        List<ScholarshipPercent> list = scholarshipPercentMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
