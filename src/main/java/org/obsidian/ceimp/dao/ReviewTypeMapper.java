package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ReviewType;
import org.obsidian.ceimp.entity.ReviewTypeExample;

public interface ReviewTypeMapper {
    long countByExample(ReviewTypeExample example);

    int deleteByExample(ReviewTypeExample example);

    int insert(ReviewType record);

    int insertSelective(ReviewType record);

    List<ReviewType> selectByExample(ReviewTypeExample example);

    int updateByExampleSelective(@Param("record") ReviewType record, @Param("example") ReviewTypeExample example);

    int updateByExample(@Param("record") ReviewType record, @Param("example") ReviewTypeExample example);
}