package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.InputReview;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface InputReviewService {

    int insertInputReview(int inputId,int inputType,int reviewStatus);

    int updateInputReview(int reviewId,int inputId,int inputType,int reviewStatus);

    int deleteInputReview(int reviewId);

    InputReview selectByReviewId(int reviewId);

    InputReview selectByInputIdAndInputType(int inputId,int inputType);

    List<InputReview> selectAllByInputType(int inputType);

    List<InputReview> selectAll();
}
