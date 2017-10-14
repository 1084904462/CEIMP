package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.SchoolscholarshipMapper;
import org.obsidian.ceimp.entity.Schoolscholarship;
import org.obsidian.ceimp.entity.SchoolscholarshipExample;
import org.obsidian.ceimp.service.SchoolscholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
@Service
public class SchoolscholarshipServiceImpl implements SchoolscholarshipService {

    @Autowired
    private SchoolscholarshipMapper schoolscholarshipMapper;

    @Transactional
    @Override
    public int insertSchoolscholarship(String userId, String level, String reason) {
        return 0;
    }

    @Transactional
    @Override
    public int updateSchoolscholarship(String userId, String level, String reason) {
        return 0;
    }

    @Transactional
    @Override
    public int deleteSchoolscholarship(String userId) {
        return 0;
    }

    @Transactional
    @Override
    public Schoolscholarship selectByUserId(String userId) {
        SchoolscholarshipExample example = new SchoolscholarshipExample();
        example.or().andUseridEqualTo(userId);
        List<Schoolscholarship> list = schoolscholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
