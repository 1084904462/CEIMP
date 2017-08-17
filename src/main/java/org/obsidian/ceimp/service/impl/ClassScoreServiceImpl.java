package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ClassScoreMapper;
import org.obsidian.ceimp.entity.ClassScore;
import org.obsidian.ceimp.entity.ClassScoreExample;
import org.obsidian.ceimp.service.ClassScoreService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class ClassScoreServiceImpl implements ClassScoreService {

    @Autowired
    private ClassScoreMapper classScoreMapper;

    @Transactional
    @Override
    public int insertClassScore(String userId, int classId, double score) {
        ClassScore classScore = new ClassScore(userId,classId,score);
        return classScoreMapper.insertSelective(classScore);
    }

    @Transactional
    @Override
    public int updateClassScore(int classScoreId, String userId, int classId, double score) {
        ClassScore classScore = new ClassScore(classScoreId,userId,classId,score);
        ClassScoreExample example = new ClassScoreExample();
        example.or().andClassScoreIdEqualTo(classScoreId);
        return classScoreMapper.updateByExample(classScore,example);
    }

    @Transactional
    @Override
    public int deleteClassScore(int classScoreId) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andClassScoreIdEqualTo(classScoreId);
        return classScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ClassScore selectByClassScoreId(int classScoreId) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andClassScoreIdEqualTo(classScoreId);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByThisYear() {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ClassScoreExample example = new ClassScoreExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByYearScope(int yearScope) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByUserId(String userId) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andUserIdEqualTo(userId);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ClassScoreExample example = new ClassScoreExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByClassId(int classId) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andClassIdEqualTo(classId);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByClassIdAndThisYear(int classId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ClassScoreExample example = new ClassScoreExample();
        example.or().andClassIdEqualTo(classId).andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByClassIdAndYearScope(int classId, int yearScope) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andClassIdEqualTo(classId).andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByUserIdAndClassId(String userId, int classId) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andUserIdEqualTo(userId).andClassIdEqualTo(classId);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByUserIdAndClassIdAndThisYear(String userId, int classId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        ClassScoreExample example = new ClassScoreExample();
        example.or().andUserIdEqualTo(userId).andClassIdEqualTo(classId).andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAllByUserIdAndClassIdAndYearScope(String userId, int classId, int yearScope) {
        ClassScoreExample example = new ClassScoreExample();
        example.or().andUserIdEqualTo(userId).andClassIdEqualTo(classId).andYearScopeEqualTo(yearScope);
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ClassScore> selectAll() {
        ClassScoreExample example = new ClassScoreExample();
        List<ClassScore> list = classScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
