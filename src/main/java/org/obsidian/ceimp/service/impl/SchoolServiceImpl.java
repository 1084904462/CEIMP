package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.StatusBean;
import org.obsidian.ceimp.dao.SchoolMapper;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.entity.SchoolExample;
import org.obsidian.ceimp.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2018/5/24.
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Transactional
    @Override
    public List<School> getAll() {
        SchoolExample example = new SchoolExample();
        List<School> list = schoolMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public boolean exist(String name){
        return schoolMapper.exist(name);
    }

    @Transactional
    @Override
    public StatusBean insert(String name) {
        if("".equals(name) || name.length()<=0){
            return new StatusBean("学院名称不能为空");
        }
        if(this.exist(name)){
            return new StatusBean("已存在相同名称的学院");
        }
        return schoolMapper.insertSelective(new School(name))==0?new StatusBean("新增学院失败"):new StatusBean("新增学院成功");
    }
}
