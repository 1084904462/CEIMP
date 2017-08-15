package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ReviewType;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface ReviewTypeService {

    int insertReviewType(String type);

    int updateReviewType(int reviewTypeId,String type);

    int deleteReviewType(int reviewTypeId);

    ReviewType selectByReviewTypeId(int reviewTypeId);

    ReviewType selectByType(String type);

    List<ReviewType> selectAllByType(String type);

    List<ReviewType> selectAll();
}