package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.InnovationInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface InnovationInputService {

    int insertInnovationInput(String userId,int innovationId,String content,int levelId,int requireId,String evidence);

    int updateInnovationInput(int inputId,String userId,int innovationId,String content,int levelId,int requireId,String evidence);

    int deleteInnovationInput(int inputId);

    InnovationInput selectByInputId(int inputId);

    List<InnovationInput> selectAllByYearScope(int yearScope);

    List<InnovationInput> selectAllByUserId(String userId);
    List<InnovationInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<InnovationInput> selectAll();
}
