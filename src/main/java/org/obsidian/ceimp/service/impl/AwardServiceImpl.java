package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardMapper awardMapper;

    @Transactional
    @Override
    public List<AwardBean> getList(Long userId, Integer yearScope) {
        return awardMapper.getList(userId,yearScope);
    }

    @Transactional
    @Override
    public List<ScholarshipFormBean> getAll(String subName, Integer yearScope,String grade) {
        return awardMapper.getAll(subName,yearScope,grade);
    }

    @Transactional
    @Override
    public Boolean exist(Long userId,String subName, Integer yearScope) {
        return awardMapper.exist(userId,subName,yearScope);
    }

    @Transactional
    @Override
    public int updateIsFilled(Long userId, Integer yearScope,String subName) {
        return awardMapper.updateIsFilled(userId,yearScope,subName);
    }

    @Transactional
    @Override
    public int cancelIsFilled(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope) {
        return awardMapper.cancelIsFilled(subName,userAccountBeanList,yearScope);
    }
}
