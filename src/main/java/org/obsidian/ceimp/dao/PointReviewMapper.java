package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.PointReview;
import org.obsidian.ceimp.entity.PointReviewExample;

public interface PointReviewMapper {
    long countByExample(PointReviewExample example);

    int deleteByExample(PointReviewExample example);

    int insert(PointReview record);

    int insertSelective(PointReview record);

    List<PointReview> selectByExample(PointReviewExample example);

    int updateByExampleSelective(@Param("record") PointReview record, @Param("example") PointReviewExample example);

    int updateByExample(@Param("record") PointReview record, @Param("example") PointReviewExample example);
}