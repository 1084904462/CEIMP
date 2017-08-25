package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.BasicInputMapper;
import org.obsidian.ceimp.entity.BasicInput;
import org.obsidian.ceimp.entity.BasicInputExample;
import org.obsidian.ceimp.service.BasicInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class BasicInputServiceImpl implements BasicInputService {

    @Autowired
    private BasicInputMapper basicInputMapper;

    @Transactional
    @Override
    public int insertBasicInput(String userId, int pointId, String evidence, int times, double subjectiveScore, String addition) {
        BasicInput basicInput = new BasicInput(userId,pointId,evidence,times,subjectiveScore,addition);
        return basicInputMapper.insertSelective(basicInput);
    }

    @Transactional
    @Override
    public int updateBasicInput(int inputId, String userId, int pointId, String evidence, int times, double subjectiveScore, String addition) {
        BasicInput basicInput = new BasicInput(inputId,userId,pointId,evidence,times,subjectiveScore,addition);
        BasicInputExample example = new BasicInputExample();
        example.or().andInputIdEqualTo(inputId);
        return basicInputMapper.updateByExample(basicInput,example);
    }

    @Transactional
    @Override
    public int deleteBasicInput(int inputId) {
        BasicInputExample example = new BasicInputExample();
        example.or().andInputIdEqualTo(inputId);
        return basicInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public BasicInput selectByInputId(int inputId) {
        BasicInputExample example = new BasicInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<BasicInput> list = basicInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<BasicInput> selectAllByUserId(String userId) {
        BasicInputExample example = new BasicInputExample();
        example.or().andUserIdEqualTo(userId);
        List<BasicInput> list = basicInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<BasicInput> selectAllByYearScope(int yearScope) {
        BasicInputExample example = new BasicInputExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<BasicInput> list = basicInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<BasicInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        BasicInputExample example = new BasicInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<BasicInput> list = basicInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<BasicInput> selectAll() {
        BasicInputExample example = new BasicInputExample();
        List<BasicInput> list = basicInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
