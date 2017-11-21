package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.dao.SsMapper;
import org.obsidian.ceimp.entity.Ss;
import org.obsidian.ceimp.entity.SsExample;
import org.obsidian.ceimp.service.SsService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
@Service
public class SsServiceImpl implements SsService {

    @Autowired
    private SsMapper ssMapper;

    @Transactional
    @Override
    public Ss selectByUserIdAndYearScope(Long userId, Integer yearScope) {
        if(yearScope == null){
            yearScope = TimeUtil.getInstance().getThisYear();
        }
        SsExample example = new SsExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<Ss> list = ssMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Ss> selectAllByUserId(Long userId) {
        SsExample example = new SsExample();
        example.or().andUserIdEqualTo(userId);
        List<Ss> list = ssMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Override
    public SsBean getSsBeanByUserIdAndYearScope(Long userId, Integer yearScope) {
        SsBean ssBean = ssMapper.selectSsBeanByUserIdAndYearScope(userId,yearScope);
        ssBean.setTs(ssBean.getTe()-1);
        return ssBean;
    }
}
