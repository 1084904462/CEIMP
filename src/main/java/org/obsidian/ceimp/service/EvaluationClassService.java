package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.EvaluationClass;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface EvaluationClassService {

    int insertEvaluationClass(String className,int formId,String content,double weight);

    int updateEvaluationClass(int classId,String className,int formId,String content,double weight);

    int deleteEvaluationClass(int classId);

    EvaluationClass selectByClassId(int classId);

    List<EvaluationClass> selectAllByClassName(String className);

    List<EvaluationClass> selectAllByFormId(int formId);

    List<EvaluationClass> selectAll();
}
