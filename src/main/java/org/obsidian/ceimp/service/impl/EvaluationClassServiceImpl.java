package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.EvaluationClassMapper;
import org.obsidian.ceimp.entity.EvaluationClass;
import org.obsidian.ceimp.entity.EvaluationClassExample;
import org.obsidian.ceimp.service.EvaluationClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class EvaluationClassServiceImpl implements EvaluationClassService {

    @Autowired
    private EvaluationClassMapper evaluationClassMapper;

    @Transactional
    @Override
    public int insertEvaluationClass(String className, int formId, String content, double weight) {
        EvaluationClass evaluationClass = new EvaluationClass(className,formId,content,weight);
        return evaluationClassMapper.insertSelective(evaluationClass);
    }

    @Transactional
    @Override
    public int updateEvaluationClass(int classId, String className, int formId, String content, double weight) {
        EvaluationClass evaluationClass = new EvaluationClass(classId,className,formId,content,weight);
        EvaluationClassExample example = new EvaluationClassExample();
        example.or().andClassIdEqualTo(classId);
        return evaluationClassMapper.updateByExample(evaluationClass,example);
    }

    @Transactional
    @Override
    public int deleteEvaluationClass(int classId) {
        EvaluationClassExample example = new EvaluationClassExample();
        example.or().andClassIdEqualTo(classId);
        return evaluationClassMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public EvaluationClass selectByClassId(int classId) {
        EvaluationClassExample example = new EvaluationClassExample();
        example.or().andClassIdEqualTo(classId);
        List<EvaluationClass> list = evaluationClassMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<EvaluationClass> selectAllByClassName(String className) {
        className = "%" + className + "%";
        EvaluationClassExample example = new EvaluationClassExample();
        example.or().andClassNameLike(className);
        List<EvaluationClass> list = evaluationClassMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationClass> selectAllByFormId(int formId) {
        EvaluationClassExample example = new EvaluationClassExample();
        example.or().andFormIdEqualTo(formId);
        List<EvaluationClass> list = evaluationClassMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationClass> selectAll() {
        EvaluationClassExample example = new EvaluationClassExample();
        List<EvaluationClass> list = evaluationClassMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
