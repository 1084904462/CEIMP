package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.SingleInput;
import org.obsidian.ceimp.entity.SingleInputExample;

public interface SingleInputMapper {
    long countByExample(SingleInputExample example);

    int deleteByExample(SingleInputExample example);

    int insert(SingleInput record);

    int insertSelective(SingleInput record);

    List<SingleInput> selectByExample(SingleInputExample example);

    int updateByExampleSelective(@Param("record") SingleInput record, @Param("example") SingleInputExample example);

    int updateByExample(@Param("record") SingleInput record, @Param("example") SingleInputExample example);
}