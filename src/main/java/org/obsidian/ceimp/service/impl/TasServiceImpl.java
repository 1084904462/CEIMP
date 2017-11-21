package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.TasBean;
import org.obsidian.ceimp.dao.TasMapper;
import org.obsidian.ceimp.entity.Tas;
import org.obsidian.ceimp.entity.TasExample;
import org.obsidian.ceimp.service.TasService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class TasServiceImpl implements TasService {

    @Autowired
    private TasMapper tasMapper;

    @Transactional
    @Override
    public Tas selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        TasExample example = new TasExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Tas> list = tasMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Tas> selectAllByUserId(Long userId) {
        TasExample example = new TasExample();
        example.or().andUserIdEqualTo(userId);
        List<Tas> list = tasMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Override
    public TasBean getTasBeanByUserIdAndYearScope(Long userId, int yearScope) {
        TasBean tasBean = tasMapper.selectTasBeanByUserIdAndYearScope(userId,yearScope);
        tasBean.setTs(tasBean.getTe()-1);
        return tasBean;
    }
}
