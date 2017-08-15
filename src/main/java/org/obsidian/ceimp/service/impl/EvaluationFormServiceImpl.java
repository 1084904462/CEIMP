package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.EvaluationFormMapper;
import org.obsidian.ceimp.entity.EvaluationForm;
import org.obsidian.ceimp.entity.EvaluationFormExample;
import org.obsidian.ceimp.service.EvaluationFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class EvaluationFormServiceImpl implements EvaluationFormService {

    @Autowired
    private EvaluationFormMapper evaluationFormMapper;

    @Transactional
    @Override
    public int insertEvaluationForm(String formName, String content, String publishingUnit, int schoolId) {
        EvaluationForm evaluationForm = new EvaluationForm(formName,content,publishingUnit,schoolId);
        return evaluationFormMapper.insertSelective(evaluationForm);
    }

    @Transactional
    @Override
    public int updateEvaluationForm(int formId, String formName, String content, String publishingUnit, int schoolId) {
        EvaluationForm evaluationForm = new EvaluationForm(formId,formName,content,publishingUnit,schoolId);
        EvaluationFormExample example = new EvaluationFormExample();
        example.or().andFormIdEqualTo(formId);
        return evaluationFormMapper.updateByExample(evaluationForm,example);
    }

    @Transactional
    @Override
    public int deleteEvaluationForm(int formId) {
        EvaluationFormExample example = new EvaluationFormExample();
        example.or().andFormIdEqualTo(formId);
        return evaluationFormMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public EvaluationForm selectByFormId(int formId) {
        EvaluationFormExample example = new EvaluationFormExample();
        example.or().andFormIdEqualTo(formId);
        List<EvaluationForm> list = evaluationFormMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<EvaluationForm> selectAllByFormName(String formName) {
        formName = "%" + formName + "%";
        EvaluationFormExample example = new EvaluationFormExample();
        example.or().andFormNameLike(formName);
        List<EvaluationForm> list = evaluationFormMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationForm> selectAllByPublishingUnit(String publishingUnit) {
        publishingUnit = "%" + publishingUnit + "%";
        EvaluationFormExample example = new EvaluationFormExample();
        example.or().andPublishingUnitLike(publishingUnit);
        List<EvaluationForm> list = evaluationFormMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationForm> selectAllBySchoolId(int schoolId) {
        EvaluationFormExample example = new EvaluationFormExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<EvaluationForm> list = evaluationFormMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<EvaluationForm> selectAll() {
        EvaluationFormExample example = new EvaluationFormExample();
        List<EvaluationForm> list = evaluationFormMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
