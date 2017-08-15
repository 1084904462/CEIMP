package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.PointReview;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface PointReviewService {

    int insertPointReview(String userId,int pointId,int reviewStatus);

    int updatePointReview(int reviewId,String userId,int pointId,int reviewStatus);

    int deletePointReview(int reviewId);

    PointReview selectByReviewId(int reviewId);

    List<PointReview> selectAllByUserId(String userId);
    List<PointReview> selectAllByUserIdAndThisYear(String userId);
    List<PointReview> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<PointReview> selectAllByPointId(int pointId);
    List<PointReview> selectAllByPointIdAndThisYear(int pointId);
    List<PointReview> selectAllByPointIdAndYearScope(int pointId,int yearScope);

    List<PointReview> selectAllByReviewStatus(int reviewStatus);
    List<PointReview> selectAllByReviewStatusAndThisYear(int reviewStatus);
    List<PointReview> selectAllByReviewStatusAndYearScope(int reviewStatus,int yearScope);

    List<PointReview> selectAllByUserIdAndPointId(String userId,int pointId);
    List<PointReview> selectAllByUserIdAndPointIdAndThisYear(String userId,int pointId);
    List<PointReview> selectAllByUserIdAndPointIdAndYearScope(String userId,int pointId,int yearScope);

    List<PointReview> selectAllByUserIdAndReviewStatus(String userId,int reviewStatus);
    List<PointReview> selectAllByUserIdAndReviewStatusAndThisYear(String userId,int reviewStatus);
    List<PointReview> selectAllByUserIdAndReviewStatusAndYearScope(String userId,int reviewStatus,int yearScope);

    List<PointReview> selectAllByPointIdAndReviewStatus(int pointId,int reviewStatus);
    List<PointReview> selectAllByPointIdAndReviewStatusAndThisYear(int pointId,int reviewStatus);
    List<PointReview> selectAllByPointIdAndReviewStatusAndYearScope(int pointId,int reviewStatus,int yearScope);

    List<PointReview> selectAllByUserIdAndPointIdAndReviewStatus(String userId,int pointId,int reviewStatus);
    List<PointReview> selectAllByUserIdAndPointIdAndReviewStatusAndThisYear(String userId,int pointId,int reviewStatus);
    List<PointReview> selectAllByUserIdAndPointIdAndReviewStatusAndYearScope(String userId,int pointId,int reviewStatus,int yearScope);

    List<PointReview> selectAll();
}
