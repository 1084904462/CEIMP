package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ReviewStatus;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface ReviewStatusService {

    int insertReviewStatus(String userId,int status,int reviewTypeId);

    int updateReviewStatus(int statusId,String userId,int status,int reviewTypeId);

    int deleteReviewStatus(int statusId);

    ReviewStatus selectByStatusId(int statusId);

    List<ReviewStatus> selectAllByThisYear();
    List<ReviewStatus> selectAllByYearScope(int yearScope);

    List<ReviewStatus> selectAllByUserId(String userId);
    List<ReviewStatus> selectAllByUserIdAndThisYear(String userId);
    List<ReviewStatus> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<ReviewStatus> selectAllByStatus(int status);
    List<ReviewStatus> selectAllByStatusAndThisYear(int status);
    List<ReviewStatus> selectAllByStatusAndYearScope(int status,int yearScope);

    List<ReviewStatus> selectAllByReviewTypeId(int reviewTypeId);
    List<ReviewStatus> selectAllByReviewTypeIdAndThisYear(int reviewTypeId);
    List<ReviewStatus> selectAllByReviewTypeIdAndYearScope(int reviewTypeId,int yearScope);

    List<ReviewStatus> selectAllByUserIdAndStatus(String userId,int status);
    List<ReviewStatus> selectAllByUserIdAndStatusAndThisYear(String userId,int status);
    List<ReviewStatus> selectAllByUserIdAndStatusAndYearScope(String userId,int status,int yearScope);

    List<ReviewStatus> selectAllByUserIdAndReviewTypeId(String userId,int reviewTypeId);
    List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndThisYear(String userId,int reviewTypeId);
    List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndYearScope(String userId,int reviewTypeId,int yearScope);

    List<ReviewStatus> selectAllByStatusAndReviewTypeId(int status,int reviewTypeId);
    List<ReviewStatus> selectAllByStatusAndReviewTypeIdAndThisYear(int status,int reviewTypeId);
    List<ReviewStatus> selectAllByStatusAndReviewTypeIdAndYearScope(int status,int reviewTypeId,int yearScope);

    List<ReviewStatus> selectAllByUserIdAndStatusAndReviewTypeId(String userId,int status,int reviewTypeId);
    List<ReviewStatus> selectAllByUserIdAndStatusAndReviewTypeIdAndThisYear(String userId,int status,int reviewTypeId);
    List<ReviewStatus> selectAllByUserIdAndStatusAndReviewTypeIdAndYearScope(String userId,int status,int reviewTypeId,int yearScope);

    List<ReviewStatus> selectAll();
}
