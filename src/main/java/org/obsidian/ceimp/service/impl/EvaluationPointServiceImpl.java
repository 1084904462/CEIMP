package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.EvaluationPointMapper;
import org.obsidian.ceimp.entity.EvaluationPoint;
import org.obsidian.ceimp.entity.EvaluationPointExample;
import org.obsidian.ceimp.service.EvaluationPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class EvaluationPointServiceImpl implements EvaluationPointService {

    @Autowired
    private EvaluationPointMapper evaluationPointMapper;

    @Transactional
    @Override
    public int insertEvaluationPoint(String content, String remark, double score, int itemId, int calculateType, int inputType,int fillInType) {
        EvaluationPoint evaluationPoint = new EvaluationPoint(content,remark,score,itemId,calculateType,inputType,fillInType);
        return evaluationPointMapper.insertSelective(evaluationPoint);
    }

    @Transactional
    @Override
    public int updateEvaluationPoint(int pointId, String content, String remark, double score, int itemId, int calculateType, int inputType, int fillInType) {
        EvaluationPoint evaluationPoint = new EvaluationPoint(pointId,content,remark,score,itemId,calculateType,inputType,fillInType);
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andPointIdEqualTo(pointId);
        return evaluationPointMapper.updateByExample(evaluationPoint,example);
    }

    @Transactional
    @Override
    public int deleteEvaluationPoint(int pointId) {
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andPointIdEqualTo(pointId);
        return evaluationPointMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public EvaluationPoint selectByPointId(int pointId) {
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andPointIdEqualTo(pointId);
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByContent(String content) {
        content = "%" + content + "%";
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andContentLike(content);
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByCalculateType(int calculateType) {
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andCalculateTypeEqualTo(calculateType);
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByInputType(int inputType) {
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andInputTypeEqualTo(inputType);
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByFillInType(int fillInType) {
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andFillInTypeIdEqualTo(fillInType);
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByItemId(int itemId) {
        EvaluationPointExample example = new EvaluationPointExample();
        example.or().andItemIdEqualTo(itemId);
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByClassId(int classId) {
        List<EvaluationPoint> list = evaluationPointMapper.selectAllByClassId(classId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAllByFormId(int formId) {
        List<EvaluationPoint> list = evaluationPointMapper.selectAllByFormId(formId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationPoint> selectAll() {
        EvaluationPointExample example = new EvaluationPointExample();
        List<EvaluationPoint> list = evaluationPointMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
