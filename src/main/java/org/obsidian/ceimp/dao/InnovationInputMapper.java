package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.InnovationInput;
import org.obsidian.ceimp.entity.InnovationInputExample;

public interface InnovationInputMapper {
    long countByExample(InnovationInputExample example);

    int deleteByExample(InnovationInputExample example);

    int insert(InnovationInput record);

    int insertSelective(InnovationInput record);

    List<InnovationInput> selectByExample(InnovationInputExample example);

    int updateByExampleSelective(@Param("record") InnovationInput record, @Param("example") InnovationInputExample example);

    int updateByExample(@Param("record") InnovationInput record, @Param("example") InnovationInputExample example);
}