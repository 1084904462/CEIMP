package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.MajorMapper;
import org.obsidian.ceimp.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;

    @Transactional
    @Override
    public List<String> selectAllGradeBySchoolId(Long schoolId) {
        return majorMapper.selectAllGradeBySchoolId(schoolId);
    }
}
