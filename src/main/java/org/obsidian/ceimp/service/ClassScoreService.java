package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ClassScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface ClassScoreService {

    int insertClassScore(String userId,int classId,double score);

    int updateClassScore(int classScoreId,String userId,int classId,double score);

    int deleteClassScore(int classScoreId);

    ClassScore selectByClassScoreId(int classScoreId);

    List<ClassScore> selectAllByYearScope(int yearScope);

    List<ClassScore> selectAllByUserId(String userId);
    List<ClassScore> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<ClassScore> selectAllByClassId(int classId);
    List<ClassScore> selectAllByClassIdAndYearScope(int classId,int yearScope);

    List<ClassScore> selectAllByUserIdAndClassId(String userId,int classId);
    List<ClassScore> selectAllByUserIdAndClassIdAndYearScope(String userId,int classId,int yearScope);

    List<ClassScore> selectAll();
}
