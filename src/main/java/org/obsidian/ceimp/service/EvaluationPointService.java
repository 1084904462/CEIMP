package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.EvaluationPoint;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface EvaluationPointService {

    int insertEvaluationPoint(String content,String remark,double score,int itemId,int calculateType,int inputType);

    int updateEvaluationPoint(int pointId,String content,String remark,double score,int itemId,int calculateType,int inputType);

    int deleteEvaluationPoint(int pointId);

    EvaluationPoint selectByPointId(int pointId);

    List<EvaluationPoint> selectAllByContent(String content);

    List<EvaluationPoint> selectAllByCalculateType(int calculateType);

    List<EvaluationPoint> selectAllByInputType(int inputType);

    List<EvaluationPoint> selectAllByItemId(int itemId);

    List<EvaluationPoint> selectAllByClassId(int classId);

    List<EvaluationPoint> selectAllByFormId(int formId);

    List<EvaluationPoint> selectAll();
}
