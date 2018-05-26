package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.InsertClassNumBean;
import org.obsidian.ceimp.dao.ClassNumMapper;
import org.obsidian.ceimp.service.ClassNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
@Service
public class ClassNumServiceImpl implements ClassNumService {

    @Autowired
    private ClassNumMapper classNumMapper;

    @Transactional
    @Override
    public List<InsertClassNumBean> getInsertClassNumBeanList() {
        return classNumMapper.getInsertClassNumBeanList();
    }

    @Transactional
    @Override
    public int insertClassNumList(List<InsertClassNumBean> insertClassNumBeanList) {
        return classNumMapper.insertClassNumList(insertClassNumBeanList);
    }
}
