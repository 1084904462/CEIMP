package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ScholarshipMapper;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipExample;
import org.obsidian.ceimp.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class ScholarshipServiceImpl implements ScholarshipService {

    @Autowired
    private ScholarshipMapper scholarshipMapper;

    @Transactional
    @Override
    public int insertScholarship(String scholarshipName, double awardPercent) {
        Scholarship scholarship = new Scholarship(scholarshipName,awardPercent);
        return scholarshipMapper.insertSelective(scholarship);
    }

    @Transactional
    @Override
    public int updateScholarship(int scholarshipId, String scholarshipName, double awardPercent) {
        Scholarship scholarship = new Scholarship(scholarshipId,scholarshipName,awardPercent);
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        return scholarshipMapper.updateByExample(scholarship,example);
    }

    @Transactional
    @Override
    public int deleteScholarship(int scholarshipId) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        return scholarshipMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Scholarship selectByScholarshipId(int scholarshipId) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Scholarship> selectAllByScholarshipName(String scholarshipName) {
        scholarshipName = "%" + scholarshipName + "%";
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipNameLike(scholarshipName);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Scholarship> selectAll(){
        ScholarshipExample example = new ScholarshipExample();
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
