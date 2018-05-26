package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.SchoolMapper;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.entity.SchoolExample;
import org.obsidian.ceimp.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2018/5/24.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Transactional
    @Override
    public List<School> getAll() {
        SchoolExample example = new SchoolExample();
        List<School> list = schoolMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public int insertSchoolList(List<String> schoolList) {
        return schoolMapper.insertSchoolList(schoolList);
    }
}
