package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.DoubleInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface DoubleInputService {

    int insertDoubleInput(String userId,int pointId,String evidence);

    int updateDoubleInput(int inputId,String userId,int pointId,String evidence);

    int deleteDoubleInput(int inputId);

    DoubleInput selectByInputId(int inputId);

    List<DoubleInput> selectAllByUserId(String userId);
    List<DoubleInput> selectAllByUserIdAndThisYear(String userId);
    List<DoubleInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<DoubleInput> selectAllByPointId(int pointId);
    List<DoubleInput> selectAllByPointIdAndThisYear(int pointId);
    List<DoubleInput> selectAllByPointIdAndYearScope(int pointId,int yearScope);

    List<DoubleInput> selectAllByUserIdAndPointId(String userId,int pointId);
    List<DoubleInput> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId);
    List<DoubleInput> selectAllByUserIdAndPointIdAndYearScope(String userId,int pointId,int yearScope);

    List<DoubleInput> selectAll();
}
