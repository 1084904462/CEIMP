package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.dao.ScholarshipMapper;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipExample;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.service.UserBasicService;
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

    @Autowired
    private UserBasicService userBasicService;

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

    @Transactional
    @Override
    public String selectScholarshipNameBySubName(String subName) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andSubNameEqualTo(subName);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0).getModelName().split("模板")[0];
    }

    @Transactional
    @Override
    public int deleteBySubNameAndUserAccountBeanListAndYearScope(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope) {
        return scholarshipMapper.deleteAllBySubNameAndUserAccountBeanListAndYearScope(subName,userAccountBeanList,yearScope);
    }


}
