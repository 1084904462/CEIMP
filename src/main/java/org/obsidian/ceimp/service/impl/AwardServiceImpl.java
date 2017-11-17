package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.service.AwardService;
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
    public List<AwardBean> selectAllByUserIdAndYearScope(Long userId, Integer yearScope) {
        return awardMapper.selectAllByUserIdAndYearScope(userId,yearScope);
    }
}
