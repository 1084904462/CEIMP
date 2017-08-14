package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.DoubleInput;
import org.obsidian.ceimp.entity.DoubleInputExample;

public interface DoubleInputMapper {
    long countByExample(DoubleInputExample example);

    int deleteByExample(DoubleInputExample example);

    int insert(DoubleInput record);

    int insertSelective(DoubleInput record);

    List<DoubleInput> selectByExample(DoubleInputExample example);

    int updateByExampleSelective(@Param("record") DoubleInput record, @Param("example") DoubleInputExample example);

    int updateByExample(@Param("record") DoubleInput record, @Param("example") DoubleInputExample example);
}