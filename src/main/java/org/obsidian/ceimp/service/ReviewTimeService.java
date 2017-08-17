package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ReviewTime;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface ReviewTimeService {

    int insertReviewTime(long reviewStart,long reviewEnd,int reviewTypeId);

    int updateReviewTime(int reviewTimeId,long reviewStart,long reviewEnd,int reviewTypeId);

    int deleteReviewTime(int reviewTimeId);

    ReviewTime selectByReviewTimeId(int reviewTimeId);

    List<ReviewTime> selectAllByThisYear();
    List<ReviewTime> selectAllByYearScope(int yearScope);

    List<ReviewTime> selectAll();
}
