package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.NisMapper;
import org.obsidian.ceimp.entity.Nis;
import org.obsidian.ceimp.entity.NisExample;
import org.obsidian.ceimp.service.NisService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class NisServiceImpl implements NisService {

    @Autowired
    private NisMapper nisMapper;

    @Transactional
    @Override
    public Nis selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        NisExample example = new NisExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Nis> list = nisMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Nis> selectAllByUserId(Long userId) {
        NisExample example = new NisExample();
        example.or().andUserIdEqualTo(userId);
        List<Nis> list = nisMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
