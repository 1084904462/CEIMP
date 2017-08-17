package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.TripleInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface TripleInputService {

    int insertTripleInput(String userId,int pointId,String evidence,String addition);

    int updateTripleInput(int inputId,String userId,int pointId,String evidence,String addition);

    int deleteTripleInput(int inputId);

    TripleInput selectByInputId(int inputId);

    List<TripleInput> selectAllByThisYear();
    List<TripleInput> selectAllByYearScope(int yearScope);

    List<TripleInput> selectAllByUserId(String userId);
    List<TripleInput> selectAllByUserIdAndThisYear(String userId);
    List<TripleInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<TripleInput> selectAllByPointId(int pointId);
    List<TripleInput> selectAllByPointIdAndThisYear(int pointId);
    List<TripleInput> selectAllByPointIdAndYearScope(int pointId,int yearScope);

    List<TripleInput> selectAllByUserIdAndPointId(String userId,int pointId);
    List<TripleInput> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId);
    List<TripleInput> selectAllByUserIdAndPointIdAndYearScope(String userId,int pointId,int yearScope);

    List<TripleInput> selectAll();
}
