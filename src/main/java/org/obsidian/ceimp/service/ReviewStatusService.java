package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ReviewStatus;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface ReviewStatusService {

    int insertReviewStatus(String userId,int reviewTypeId,int status);

    int updateReviewStatus(int statusId,String userId,int reviewTypeId,int status);

    int deleteReviewStatus(int statusId);

    ReviewStatus selectByStatusId(int statusId);

    List<ReviewStatus> selectAllByYearScope(int yearScope);

    List<ReviewStatus> selectAllByUserId(String userId);
    List<ReviewStatus> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<ReviewStatus> selectAllByReviewTypeId(int reviewTypeId);
    List<ReviewStatus> selectAllByReviewTypeIdAndYearScope(int reviewTypeId,int yearScope);

    List<ReviewStatus> selectAllByStatus(int status);
    List<ReviewStatus> selectAllByStatusAndYearScope(int status,int yearScope);

    List<ReviewStatus> selectAllByUserIdAndReviewTypeId(String userId,int reviewTypeId);
    List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndYearScope(String userId,int reviewTypeId,int yearScope);

    List<ReviewStatus> selectAllByUserIdAndStatus(String userId,int status);
    List<ReviewStatus> selectAllByUserIdAndStatusAndYearScope(String userId,int status,int yearScope);

    List<ReviewStatus> selectAllByReviewTypeIdAndStatus(int reviewTypeId,int status);
    List<ReviewStatus> selectAllByReviewTypeIdAndStatusAndYearScope(int reviewTypeId,int status,int yearScope);

    List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndStatus(String userId,int reviewTypeId,int status);
    List<ReviewStatus> selectAllByUserIdAndReviewTypeIdAndStatusAndYearScope(String userId,int reviewTypeId,int status,int yearScope);

    List<ReviewStatus> selectAll();
}
