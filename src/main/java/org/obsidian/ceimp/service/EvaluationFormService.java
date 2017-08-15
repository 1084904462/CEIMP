package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.EvaluationForm;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface EvaluationFormService {

    int insertEvaluationForm(String formName,String content,String publishingUnit,int schoolId);

    int updateEvaluationForm(int formId,String formName,String content,String publishingUnit,int schoolId);

    int deleteEvaluationForm(int formId);

    EvaluationForm selectByFormId(int formId);

    List<EvaluationForm> selectAllByFormName(String formName);

    List<EvaluationForm> selectAllByPublishingUnit(String publishingUnit);

    List<EvaluationForm> selectAllBySchoolId(int schoolId);

    List<EvaluationForm> selectAll();
}
