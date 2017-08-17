package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.EvaluationItemMapper;
import org.obsidian.ceimp.entity.EvaluationItem;
import org.obsidian.ceimp.entity.EvaluationItemExample;
import org.obsidian.ceimp.service.EvaluationItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class EvaluationItemServiceImpl implements EvaluationItemService {

    @Autowired
    private EvaluationItemMapper evaluationItemMapper;

    @Transactional
    @Override
    public int insertEvaluationItem(String itemName, int classId, double maxScore) {
        EvaluationItem evaluationItem = new EvaluationItem(itemName,classId,maxScore);
        return evaluationItemMapper.insertSelective(evaluationItem);
    }

    @Transactional
    @Override
    public int updateEvaluationItem(int itemId, String itemName, int classId, double maxScore) {
        EvaluationItem evaluationItem = new EvaluationItem(itemId,itemName,classId,maxScore);
        EvaluationItemExample example = new EvaluationItemExample();
        example.or().andItemIdEqualTo(itemId);
        return evaluationItemMapper.updateByExample(evaluationItem,example);
    }

    @Transactional
    @Override
    public int deleteEvaluationItem(int itemId) {
        EvaluationItemExample example = new EvaluationItemExample();
        example.or().andItemIdEqualTo(itemId);
        return evaluationItemMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public EvaluationItem selectByItemId(int itemId) {
        EvaluationItemExample example = new EvaluationItemExample();
        example.or().andItemIdEqualTo(itemId);
        List<EvaluationItem> list = evaluationItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<EvaluationItem> selectAllByItemName(String itemName) {
        itemName = "%" + itemName + "%";
        EvaluationItemExample example = new EvaluationItemExample();
        example.or().andItemNameLike(itemName);
        List<EvaluationItem> list = evaluationItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationItem> selectAllByClassId(int classId) {
        EvaluationItemExample example = new EvaluationItemExample();
        example.or().andClassIdEqualTo(classId);
        List<EvaluationItem> list = evaluationItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationItem> selectAllByFormId(int formId) {
        List<EvaluationItem> list = evaluationItemMapper.selectAllByFormId(formId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationItem> selectAll() {
        EvaluationItemExample example = new EvaluationItemExample();
        List<EvaluationItem> list = evaluationItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
