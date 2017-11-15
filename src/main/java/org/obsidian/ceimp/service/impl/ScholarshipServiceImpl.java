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
 * Created by BillChen on 2017/11/14.
 */
@Service
public class ScholarshipServiceImpl implements ScholarshipService {
    @Autowired
    private ScholarshipMapper scholarshipMapper;

    @Transactional
    @Override
    public Scholarship selectByScholarshipId(Long scholarshipId) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
