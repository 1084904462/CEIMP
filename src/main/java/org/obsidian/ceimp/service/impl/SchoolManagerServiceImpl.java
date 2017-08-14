package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.SchoolManagerMapper;
import org.obsidian.ceimp.entity.SchoolManager;
import org.obsidian.ceimp.entity.SchoolManagerExample;
import org.obsidian.ceimp.service.SchoolManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class SchoolManagerServiceImpl implements SchoolManagerService {

    @Autowired
    private SchoolManagerMapper schoolManagerMapper;

    @Override
    public int insertSchoolManager(String schoolManagerId, String password, int schoolId) {
        SchoolManager schoolManager = new SchoolManager(schoolManagerId,password,schoolId);
        return schoolManagerMapper.insert(schoolManager);
    }

    @Override
    public int updateSchoolManager(String schoolManagerId, String password, int schoolId) {
        SchoolManager schoolManager = new SchoolManager(schoolManagerId,password,schoolId);
        SchoolManagerExample example = new SchoolManagerExample();
        example.or().andSchoolManagerIdEqualTo(schoolManagerId);
        return schoolManagerMapper.updateByExample(schoolManager,example);
    }

    @Override
    public int deleteSchoolManager(String schoolManagerId) {
        SchoolManagerExample example = new SchoolManagerExample();
        example.or().andSchoolManagerIdEqualTo(schoolManagerId);
        return schoolManagerMapper.deleteByExample(example);
    }

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
}
