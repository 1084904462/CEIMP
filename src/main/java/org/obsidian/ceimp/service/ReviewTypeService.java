package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ReviewType;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface ReviewTypeService {

    int insertReviewType(String type);

    int updateReviewType(int typeId,String type);

    int deleteReviewType(int typeId);

    ReviewType selectByTypeId(int typeId);

    List<ReviewType> selectAllByType(String type);

    List<ReviewType> selectAll();
}
