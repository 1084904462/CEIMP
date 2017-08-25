package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.InnovationLevel;
import org.obsidian.ceimp.entity.InnovationLevelExample;

public interface InnovationLevelMapper {
    long countByExample(InnovationLevelExample example);

    int deleteByExample(InnovationLevelExample example);

    int insert(InnovationLevel record);

    int insertSelective(InnovationLevel record);

    List<InnovationLevel> selectByExample(InnovationLevelExample example);

    int updateByExampleSelective(@Param("record") InnovationLevel record, @Param("example") InnovationLevelExample example);

    int updateByExample(@Param("record") InnovationLevel record, @Param("example") InnovationLevelExample example);
}