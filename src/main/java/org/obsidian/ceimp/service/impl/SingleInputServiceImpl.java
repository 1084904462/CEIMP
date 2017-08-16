package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.SingleInputMapper;
import org.obsidian.ceimp.entity.SingleInput;
import org.obsidian.ceimp.entity.SingleInputExample;
import org.obsidian.ceimp.service.SingleInputService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class SingleInputServiceImpl implements SingleInputService {

    @Autowired
    private SingleInputMapper singleInputMapper;

    @Transactional
    @Override
    public int insertSingleInput(String userId, int pointId) {
        SingleInput singleInput = new SingleInput(userId,pointId);
        return singleInputMapper.insertSelective(singleInput);
    }

    @Transactional
    @Override
    public int updateSingleInput(int inputId,String userId,int pointId) {
        SingleInput singleInput = new SingleInput(inputId,userId,pointId);
        SingleInputExample example = new SingleInputExample();
        example.or().andInputIdEqualTo(inputId);
        return singleInputMapper.updateByExample(singleInput,example);
    }

    @Transactional
    @Override
    public int deleteSingleInput(int inputId) {
        SingleInputExample example = new SingleInputExample();
        example.or().andInputIdEqualTo(inputId);
        return singleInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public SingleInput selectByInputId(int inputId) {
        SingleInputExample example = new SingleInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByUserId(String userId) {
        SingleInputExample example = new SingleInputExample();
        example.or().andUserIdEqualTo(userId);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        SingleInputExample example = new SingleInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        SingleInputExample example = new SingleInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByPointId(int pointId) {
        SingleInputExample example = new SingleInputExample();
        example.or().andPointIdEqualTo(pointId);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByPointIdAndThisYear(int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        SingleInputExample example = new SingleInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByPointIdAndYearScope(int pointId, int yearScope) {
        SingleInputExample example = new SingleInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByUserIdAndPointId(String userId, int pointId) {
        SingleInputExample example = new SingleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByUserIdAndPointIdAndThisYear(String userId, int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        SingleInputExample example = new SingleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAllByUserIdAndPointIdAndYearScope(String userId, int pointId, int yearScope) {
        SingleInputExample example = new SingleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<SingleInput> selectAll() {
        SingleInputExample example = new SingleInputExample();
        List<SingleInput> list = singleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
