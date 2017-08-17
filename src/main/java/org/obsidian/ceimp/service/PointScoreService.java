package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.PointScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface PointScoreService {

    int insertPointScore(String userId,int pointId,double score);

    int updatePointScore(int pointScoreId,String userId,int pointId,double score);

    int deletePointScore(int pointScoreId);

    PointScore selectByPointScoreId(int pointScoreId);

    List<PointScore> selectAllByThisYear();
    List<PointScore> selectAllByYearScope(int yearScope);

    List<PointScore> selectAllByUserId(String userId);
    List<PointScore> selectAllByUserIdAndThisYear(String userId);
    List<PointScore> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<PointScore> selectAllByPointId(int pointId);
    List<PointScore> selectAllByPointIdAndThisYear(int pointId);
    List<PointScore> selectAllByPointIdAndYearScope(int pointId,int yearScope);

    List<PointScore> selectAllByUserIdAndPointId(String userId,int pointId);
    List<PointScore> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId);
    List<PointScore> selectAllByUserIdAndPointIdAndYearScope(String userId,int pointId,int yearScope);

    List<PointScore> selectAll();

}
