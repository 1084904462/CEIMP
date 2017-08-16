package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.TripleInputMapper;
import org.obsidian.ceimp.entity.TripleInput;
import org.obsidian.ceimp.entity.TripleInputExample;
import org.obsidian.ceimp.service.TripleInputService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class TripleInputServiceImpl implements TripleInputService {

    @Autowired
    private TripleInputMapper tripleInputMapper;

    @Transactional
    @Override
    public int insertTripleInput(String userId, int pointId, String evidence, String addition) {
        TripleInput tripleInput = new TripleInput(userId,pointId,evidence,addition);
        return tripleInputMapper.insertSelective(tripleInput);
    }

    @Transactional
    @Override
    public int updateTripleInput(int inputId, String userId, int pointId, String evidence, String addition) {
        TripleInput tripleInput = new TripleInput(inputId,userId,pointId,evidence,addition);
        TripleInputExample example = new TripleInputExample();
        example.or().andInputIdEqualTo(inputId);
        return tripleInputMapper.updateByExample(tripleInput,example);
    }

    @Transactional
    @Override
    public int deleteTripleInput(int inputId) {
        TripleInputExample example = new TripleInputExample();
        example.or().andInputIdEqualTo(inputId);
        return tripleInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public TripleInput selectByInputId(int inputId) {
        TripleInputExample example = new TripleInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByUserId(String userId) {
        TripleInputExample example = new TripleInputExample();
        example.or().andUserIdEqualTo(userId);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByUserIdAndThisYear(String userId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        TripleInputExample example = new TripleInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        TripleInputExample example = new TripleInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByPointId(int pointId) {
        TripleInputExample example = new TripleInputExample();
        example.or().andPointIdEqualTo(pointId);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByPointIdAndThisYear(int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        TripleInputExample example = new TripleInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByPointIdAndYearScope(int pointId, int yearScope) {
        TripleInputExample example = new TripleInputExample();
        example.or().andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByUserIdAndPointId(String userId, int pointId) {
        TripleInputExample example = new TripleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByUserIdAndPointIdAndThisYear(String userId, int pointId) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        TripleInputExample example = new TripleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAllByUserIdAndPointIdAndYearScope(String userId, int pointId, int yearScope) {
        TripleInputExample example = new TripleInputExample();
        example.or().andUserIdEqualTo(userId).andPointIdEqualTo(pointId).andYearScopeEqualTo(yearScope);
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TripleInput> selectAll() {
        TripleInputExample example = new TripleInputExample();
        List<TripleInput> list = tripleInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
