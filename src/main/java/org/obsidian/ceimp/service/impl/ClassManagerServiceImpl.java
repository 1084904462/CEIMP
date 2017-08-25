package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ClassManagerMapper;
import org.obsidian.ceimp.entity.ClassManager;
import org.obsidian.ceimp.entity.ClassManagerExample;
import org.obsidian.ceimp.service.ClassManagerService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/8/13.
 */
@Service
public class ClassManagerServiceImpl implements ClassManagerService {

    @Autowired
    private ClassManagerMapper classManagerMapper;

    @Transactional
    @Override
    public int insertClassManager(String classManagerId, String password, int classId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        password = MD5Util.getInstance().EncoderByMd5(password);
        ClassManager classManager = new ClassManager(classManagerId,password,classId);
        return classManagerMapper.insert(classManager);
    }

    @Transactional
    @Override
    public int updateClassManager(String classManagerId, String password, int classId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        password = MD5Util.getInstance().EncoderByMd5(password);
        ClassManager classManager = new ClassManager(classManagerId,password,classId);
        ClassManagerExample example = new ClassManagerExample();
        example.or().andClassManagerIdEqualTo(classManagerId);
        return classManagerMapper.updateByExample(classManager,example);
    }

    @Transactional
    @Override
    public int deleteClassManager(String classManagerId) {
        ClassManagerExample example = new ClassManagerExample();
        example.or().andClassManagerIdEqualTo(classManagerId);
        return classManagerMapper.deleteByExample(example);
    }

    @Transactional
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

    @Transactional
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

    @Transactional
    @Override
    public List<ClassManager> selectAll(){
        ClassManagerExample example = new ClassManagerExample();
        List<ClassManager> list = classManagerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
