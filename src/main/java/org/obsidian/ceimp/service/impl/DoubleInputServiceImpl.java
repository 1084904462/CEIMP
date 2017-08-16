package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.DoubleInputMapper;
import org.obsidian.ceimp.entity.DoubleInput;
import org.obsidian.ceimp.entity.DoubleInputExample;
import org.obsidian.ceimp.service.DoubleInputService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class DoubleInputServiceImpl implements DoubleInputService {

    @Autowired
    private DoubleInputMapper doubleInputMapper;

    @Transactional
    @Override
    public int insertDoubleInput(String userId, int pointId, String evidence) {
        DoubleInput doubleInput = new DoubleInput(userId,pointId,evidence);
        return doubleInputMapper.insertSelective(doubleInput);
    }

    @Transactional
    @Override
    public int updateDoubleInput(int inputId, String userId, int pointId, String evidence) {
        DoubleInput doubleInput = new DoubleInput(inputId,userId,pointId,evidence);
        DoubleInputExample example = new DoubleInputExample();
        example.or().andInputIdEqualTo(inputId);
        return doubleInputMapper.updateByExample(doubleInput,example);
    }

    @Transactional
    @Override
    public int deleteDoubleInput(int inputId) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andInputIdEqualTo(inputId);
        return doubleInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public DoubleInput selectByInputId(int inputId) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByUserId(String userId) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andUserIdEqualTo(userId);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        DoubleInputExample example = new DoubleInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByPointId(int pointId) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andPointIdEqualTo(pointId);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByPointIdAndThisYear(int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        DoubleInputExample example = new DoubleInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByPointIdAndYearScope(int pointId,int yearScope) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByUserIdAndPointId(String userId, int pointId) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByUserIdAndPointIdAndThisYear(String userId, int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        DoubleInputExample example = new DoubleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAllByUserIdAndPointIdAndYearScope(String userId, int pointId,int yearScope) {
        DoubleInputExample example = new DoubleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<DoubleInput> selectAll() {
        DoubleInputExample example = new DoubleInputExample();
        List<DoubleInput> list = doubleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
