package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.InnovationScore;
import org.obsidian.ceimp.entity.InnovationScoreExample;

public interface InnovationScoreMapper {
    long countByExample(InnovationScoreExample example);

    int deleteByExample(InnovationScoreExample example);

    int insert(InnovationScore record);

    int insertSelective(InnovationScore record);

    List<InnovationScore> selectByExample(InnovationScoreExample example);

    int updateByExampleSelective(@Param("record") InnovationScore record, @Param("example") InnovationScoreExample example);

    int updateByExample(@Param("record") InnovationScore record, @Param("example") InnovationScoreExample example);
}