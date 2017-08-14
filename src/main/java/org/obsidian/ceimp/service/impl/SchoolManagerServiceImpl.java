package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.SchoolManagerMapper;
import org.obsidian.ceimp.entity.SchoolManager;
import org.obsidian.ceimp.entity.SchoolManagerExample;
import org.obsidian.ceimp.service.SchoolManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class SchoolManagerServiceImpl implements SchoolManagerService {

    @Autowired
    private SchoolManagerMapper schoolManagerMapper;

    @Transactional
    @Override
    public int insertSchoolManager(String schoolManagerId, String password, int schoolId) {
        SchoolManager schoolManager = new SchoolManager(schoolManagerId,password,schoolId);
        return schoolManagerMapper.insert(schoolManager);
    }

    @Transactional
    @Override
    public int updateSchoolManager(String schoolManagerId, String password, int schoolId) {
        SchoolManager schoolManager = new SchoolManager(schoolManagerId,password,schoolId);
        SchoolManagerExample example = new SchoolManagerExample();
        example.or().andSchoolManagerIdEqualTo(schoolManagerId);
        return schoolManagerMapper.updateByExample(schoolManager,example);
    }

    @Transactional
    @Override
    public int deleteSchoolManager(String schoolManagerId) {
        SchoolManagerExample example = new SchoolManagerExample();
        example.or().andSchoolManagerIdEqualTo(schoolManagerId);
        return schoolManagerMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public SchoolManager selectBySchoolManagerId(String schoolManagerId) {
        SchoolManagerExample example = new SchoolManagerExample();
        example.or().andSchoolManagerIdEqualTo(schoolManagerId);
        List<SchoolManager> list = schoolManagerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<SchoolManager> selectAllBySchoolId(int schoolId) {
        SchoolManagerExample example = new SchoolManagerExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<SchoolManager> list = schoolManagerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SchoolManager> selectAll(){
        SchoolManagerExample example = new SchoolManagerExample();
        List<SchoolManager> list = schoolManagerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
