package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.PointScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface PointScoreService {

    int insertPointScore(int pointId,String userId,int score);

    int updatePointScore(int pointScoreId,int pointId,String userId,int score);

    int deletePointScore(int pointScoreId);

    PointScore selectByPointScoreId(int pointScoreId);

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
