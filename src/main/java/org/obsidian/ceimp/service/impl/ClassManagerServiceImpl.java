package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ClassManagerMapper;
import org.obsidian.ceimp.entity.ClassManager;
import org.obsidian.ceimp.entity.ClassManagerExample;
import org.obsidian.ceimp.service.ClassManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class ClassManagerServiceImpl implements ClassManagerService {

    @Autowired
    private ClassManagerMapper classManagerMapper;

    @Override
    public int insertClassManager(String classManagerId, String password, int classId) {
        ClassManager classManager = new ClassManager(classManagerId,password,classId);
        return classManagerMapper.insert(classManager);
    }

    @Override
    public int updateClassManager(String classManagerId, String password, int classId) {
        ClassManager classManager = new ClassManager(classManagerId,password,classId);
        ClassManagerExample example = new ClassManagerExample();
        example.or().andClassManagerIdEqualTo(classManagerId);
        return classManagerMapper.updateByExample(classManager,example);
    }

    @Override
    public int deleteClassManager(String classManagerId) {
        ClassManagerExample example = new ClassManagerExample();
        example.or().andClassManagerIdEqualTo(classManagerId);
        return classManagerMapper.deleteByExample(example);
    }

    @Override
    public ClassManager selectByClassManagerId(String classManagerId) {
        ClassManagerExample example = new ClassManagerExample();
        example.or().andClassManagerIdEqualTo(classManagerId);
        List<ClassManager> list = classManagerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ClassManager> selectAllByClassId(int classId) {
        ClassManagerExample example = new ClassManagerExample();
        example.or().andClassIdEqualTo(classId);
        List<ClassManager> list = classManagerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
