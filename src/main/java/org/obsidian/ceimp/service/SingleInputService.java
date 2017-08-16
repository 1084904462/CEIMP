package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.SingleInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface SingleInputService {

    int insertSingleInput(String userId,int pointId);

    int updateSingleInput(int inputId,String userId,int pointId);

    int deleteSingleInput(int inputId);

    SingleInput selectByInputId(int inputId);

    List<SingleInput> selectAllByUserId(String userId);
    List<SingleInput> selectAllByUserIdAndThisYear(String userId);
    List<SingleInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<SingleInput> selectAllByPointId(int pointId);
    List<SingleInput> selectAllByPointIdAndThisYear(int pointId);
    List<SingleInput> selectAllByPointIdAndYearScope(int pointId,int yearScope);

    List<SingleInput> selectAllByUserIdAndPointId(String userId,int pointId);
    List<SingleInput> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId);
    List<SingleInput> selectAllByUserIdAndPointIdAndYearScope(String userId,int pointId,int yearScope);

    List<SingleInput> selectAll();
}
