package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.EvaluationItem;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface EvaluationItemService {

    int insertEvaluationItem(String itemName,int classId,double maxScore);

    int updateEvaluationItem(int itemId,String itemName,int classId,double maxScore);

    int deleteEvaluationItem(int itemId);

    EvaluationItem selectByItemId(int itemId);

    List<EvaluationItem> selectAllByItemName(String itemName);

    List<EvaluationItem> selectAllByClassId(int classId);

    List<EvaluationItem> selectAllByFormId(int formId);

    List<EvaluationItem> selectAll();
}
