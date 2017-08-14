package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.AccumulateInput;
import org.obsidian.ceimp.entity.AccumulateInputExample;

public interface AccumulateInputMapper {
    long countByExample(AccumulateInputExample example);

    int deleteByExample(AccumulateInputExample example);

    int insert(AccumulateInput record);

    int insertSelective(AccumulateInput record);

    List<AccumulateInput> selectByExample(AccumulateInputExample example);

    int updateByExampleSelective(@Param("record") AccumulateInput record, @Param("example") AccumulateInputExample example);

    int updateByExample(@Param("record") AccumulateInput record, @Param("example") AccumulateInputExample example);
}