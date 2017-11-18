package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.PgsMapper;
import org.obsidian.ceimp.entity.Pgs;
import org.obsidian.ceimp.entity.PgsExample;
import org.obsidian.ceimp.service.PgsService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class PgsServiceImpl implements PgsService {

    @Autowired
    private PgsMapper pgsMapper;

    @Transactional
    @Override
    public Pgs selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        PgsExample example = new PgsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Pgs> list = pgsMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Pgs> selectAllByUserId(Long userId) {
        PgsExample example = new PgsExample();
        example.or().andUserIdEqualTo(userId);
        List<Pgs> list = pgsMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
