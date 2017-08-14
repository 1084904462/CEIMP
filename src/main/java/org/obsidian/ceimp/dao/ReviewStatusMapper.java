package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ReviewStatus;
import org.obsidian.ceimp.entity.ReviewStatusExample;

public interface ReviewStatusMapper {
    long countByExample(ReviewStatusExample example);

    int deleteByExample(ReviewStatusExample example);

    int insert(ReviewStatus record);

    int insertSelective(ReviewStatus record);

    List<ReviewStatus> selectByExample(ReviewStatusExample example);

    int updateByExampleSelective(@Param("record") ReviewStatus record, @Param("example") ReviewStatusExample example);

    int updateByExample(@Param("record") ReviewStatus record, @Param("example") ReviewStatusExample example);
}