package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ClassScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface ClassScoreService {

    int insertClassScore(int classId,String userId,double score);

    int updateClassScore(int classScoreId,int classId,String userId,double score);

    int deleteClassScore(int classScoreId);

    ClassScore selectByClassScoreId(int classScoreId);

    List<ClassScore> selectAllByUserId(String userId);
    List<ClassScore> selectAllByUserIdAndThisYear(String userId);
    List<ClassScore> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<ClassScore> selectAllByClassId(int classId);
    List<ClassScore> selectAllByClassIdAndThisYear(int classId);
    List<ClassScore> selectAllByClassIdAndYearScope(int classId,int yearScope);

    List<ClassScore> selectAllByUserIdAndClassId(String userId,int classId);
    List<ClassScore> selectAllByUserIdAndClassIdAndThisYear(String userId,int classId);
    List<ClassScore> selectAllByUserIdAndClassIdAndYearScope(String userId,int classId,int yearScope);

    List<ClassScore> selectAll();
}
