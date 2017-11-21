package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NgBean;
import org.obsidian.ceimp.dao.NgMapper;
import org.obsidian.ceimp.entity.Ng;
import org.obsidian.ceimp.entity.NgExample;
import org.obsidian.ceimp.service.NgService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class NgServiceImpl implements NgService {

    @Autowired
    private NgMapper ngMapper;

    @Transactional
    @Override
    public Ng selectByUserIdAndYearScope(Long userId,Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ng> list = ngMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Ng> selectAllByUserId(Long userId) {
        NgExample example = new NgExample();
        example.or().andUserIdEqualTo(userId);
        List<Ng> list = ngMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Override
    public NgBean getNgBeanByUserIdAndYearScope(Long userId,Integer yearScope) {
        NgBean ngBean = ngMapper.selectNgBeanByUserIdAndYearScope(userId,yearScope);
        ngBean.setTs(TimeUtil.getInstance().getThisYear());
        ngBean.setTe(TimeUtil.getInstance().getThisYear() + 1);
        return ngBean;
    }
}
