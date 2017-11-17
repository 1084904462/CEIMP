package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.AwardExample;
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
    public List<Award> selectAllByUserIdAndYearScope(Long userId, Integer yearScope) {
        AwardExample example = new AwardExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Award> list = awardMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
