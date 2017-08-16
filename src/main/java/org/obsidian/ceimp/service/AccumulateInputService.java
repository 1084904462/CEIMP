package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.AccumulateInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface AccumulateInputService {

    int insertAccumulateInput(String userId,int pointId,String evidence,int times);

    int updateAccumulateInput(int inputId,String userId,int pointId,String evidence,int times);

    int deleteAccumulateInput(int inputId);

    AccumulateInput selectByInputId(int inputId);

    List<AccumulateInput> selectAllByUserId(String userId);
    List<AccumulateInput> selectAllByUserIdAndThisYear(String userId);
    List<AccumulateInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<AccumulateInput> selectAllByPointId(int pointId);
    List<AccumulateInput> selectAllByPointIdAndThisYear(int pointId);
    List<AccumulateInput> selectAllByPointIdAndYearScope(int pointId,int yearScope);

    List<AccumulateInput> selectAllByUserIdAndPointId(String userId,int pointId);
    List<AccumulateInput> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId);
    List<AccumulateInput> selectAllByUserIdAndPointIdAndYearScope(String userId,int pointId,int yearScope);

    List<AccumulateInput> selectAll();
}
