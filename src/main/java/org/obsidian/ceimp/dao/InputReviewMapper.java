package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.InputReview;
import org.obsidian.ceimp.entity.InputReviewExample;

public interface InputReviewMapper {
    long countByExample(InputReviewExample example);

    int deleteByExample(InputReviewExample example);

    int insert(InputReview record);

    int insertSelective(InputReview record);

    List<InputReview> selectByExample(InputReviewExample example);

    int updateByExampleSelective(@Param("record") InputReview record, @Param("example") InputReviewExample example);

    int updateByExample(@Param("record") InputReview record, @Param("example") InputReviewExample example);
}