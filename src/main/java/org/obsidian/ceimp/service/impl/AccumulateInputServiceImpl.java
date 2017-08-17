package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.AccumulateInputMapper;
import org.obsidian.ceimp.entity.AccumulateInput;
import org.obsidian.ceimp.entity.AccumulateInputExample;
import org.obsidian.ceimp.service.AccumulateInputService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class AccumulateInputServiceImpl implements AccumulateInputService {

    @Autowired
    private AccumulateInputMapper accumulateInputMapper;

    @Transactional
    @Override
    public int insertAccumulateInput(String userId, int pointId, String evidence, int times) {
        AccumulateInput accumulateInput = new AccumulateInput(userId,pointId,evidence,times);
        return accumulateInputMapper.insertSelective(accumulateInput);
    }

    @Transactional
    @Override
    public int updateAccumulateInput(int inputId, String userId, int pointId, String evidence, int times) {
        AccumulateInput accumulateInput = new AccumulateInput(inputId,userId,pointId,evidence,times);
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andInputIdEqualTo(inputId);
        return accumulateInputMapper.updateByExample(accumulateInput,example);
    }

    @Transactional
    @Override
    public int deleteAccumulateInput(int inputId) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andInputIdEqualTo(inputId);
        return accumulateInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public AccumulateInput selectByInputId(int inputId) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByThisYear() {
        int yearScope = TimeUtil.getInstance().getThisYear();
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByYearScope(int yearScope) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByUserId(String userId) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andUserIdEqualTo(userId);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByPointId(int pointId) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andPointIdEqualTo(pointId);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByPointIdAndThisYear(int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByPointIdAndYearScope(int pointId, int yearScope) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByUserIdAndPointId(String userId,int pointId) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAllByUserIdAndPointIdAndYearScope(String userId ,int pointId, int yearScope) {
        AccumulateInputExample example = new AccumulateInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<AccumulateInput> selectAll() {
        AccumulateInputExample example = new AccumulateInputExample();
        List<AccumulateInput> list = accumulateInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
