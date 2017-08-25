package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.InnovationInputMapper;
import org.obsidian.ceimp.entity.InnovationInput;
import org.obsidian.ceimp.entity.InnovationInputExample;
import org.obsidian.ceimp.service.InnovationInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class InnovationInputServiceImpl implements InnovationInputService {

    @Autowired
    private InnovationInputMapper innovationInputMapper;

    @Transactional
    @Override
    public int insertInnovationInput(String userId, int innovationId, String content, int levelId, int requireId, String evidence) {
        InnovationInput innovationInput = new InnovationInput(userId,innovationId,content,levelId,requireId,evidence);
        return innovationInputMapper.insertSelective(innovationInput);
    }

    @Transactional
    @Override
    public int updateInnovationInput(int inputId, String userId, int innovationId, String content, int levelId, int requireId, String evidence) {
        InnovationInput innovationInput = new InnovationInput(inputId,userId,innovationId,content,levelId,requireId,evidence);
        InnovationInputExample example = new InnovationInputExample();
        example.or().andInputIdEqualTo(inputId);
        return innovationInputMapper.updateByExample(innovationInput,example);
    }

    @Transactional
    @Override
    public int deleteInnovationInput(int inputId) {
        InnovationInputExample example = new InnovationInputExample();
        example.or().andInputIdEqualTo(inputId);
        return innovationInputMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public InnovationInput selectByInputId(int inputId) {
        InnovationInputExample example = new InnovationInputExample();
        example.or().andInputIdEqualTo(inputId);
        List<InnovationInput> list = innovationInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<InnovationInput> selectAllByYearScope(int yearScope) {
        InnovationInputExample example = new InnovationInputExample();
        example.or().andYearScopeEqualTo(yearScope);
        List<InnovationInput> list = innovationInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationInput> selectAllByUserId(String userId) {
        InnovationInputExample example = new InnovationInputExample();
        example.or().andUserIdEqualTo(userId);
        List<InnovationInput> list = innovationInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationInput> selectAllByUserIdAndYearScope(String userId, int yearScope) {
        InnovationInputExample example = new InnovationInputExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        List<InnovationInput> list = innovationInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationInput> selectAll() {
        InnovationInputExample example = new InnovationInputExample();
        List<InnovationInput> list = innovationInputMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
