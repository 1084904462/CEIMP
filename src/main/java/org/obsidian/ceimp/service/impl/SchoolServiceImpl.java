package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.SchoolMapper;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.entity.SchoolExample;
import org.obsidian.ceimp.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BillChen on 2017/8/12.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public int insertSchool(String schoolName) {
        School school = new School(schoolName);
        return schoolMapper.insertSelective(school);
    }

    @Override
    public int updateSchool(int schoolId, String schoolName) {
        SchoolExample example = new SchoolExample();
        example.or().andSchoolIdEqualTo(schoolId);
        School school = new School(schoolId,schoolName);
        return schoolMapper.updateByExample(school,example);
    }

    @Override
    public int deleteSchool(int schoolId) {
        SchoolExample example = new SchoolExample();
        example.or().andSchoolIdEqualTo(schoolId);
        return schoolMapper.deleteByExample(example);
    }

    @Override
    public School selectById(int schoolId) {
        SchoolExample example = new SchoolExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<School> list = schoolMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public School selectBySchoolName(String schoolName) {
        SchoolExample example = new SchoolExample();
        example.or().andSchoolNameEqualTo(schoolName);
        List<School> list = schoolMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<School> selectAllBySchoolName(String schoolName) {
        schoolName = "%" + schoolName + "%";
        SchoolExample example = new SchoolExample();
        example.or().andSchoolNameLike(schoolName);
        List<School> list = schoolMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
