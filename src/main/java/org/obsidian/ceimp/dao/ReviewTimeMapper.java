package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ReviewTime;
import org.obsidian.ceimp.entity.ReviewTimeExample;

public interface ReviewTimeMapper {
    long countByExample(ReviewTimeExample example);

    int deleteByExample(ReviewTimeExample example);

    int insert(ReviewTime record);

    int insertSelective(ReviewTime record);

    List<ReviewTime> selectByExample(ReviewTimeExample example);

    int updateByExampleSelective(@Param("record") ReviewTime record, @Param("example") ReviewTimeExample example);

    int updateByExample(@Param("record") ReviewTime record, @Param("example") ReviewTimeExample example);
}