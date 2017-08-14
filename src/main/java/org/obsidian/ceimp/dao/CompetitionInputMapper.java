package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionInput;
import org.obsidian.ceimp.entity.CompetitionInputExample;

public interface CompetitionInputMapper {
    long countByExample(CompetitionInputExample example);

    int deleteByExample(CompetitionInputExample example);

    int insert(CompetitionInput record);

    int insertSelective(CompetitionInput record);

    List<CompetitionInput> selectByExample(CompetitionInputExample example);

    int updateByExampleSelective(@Param("record") CompetitionInput record, @Param("example") CompetitionInputExample example);

    int updateByExample(@Param("record") CompetitionInput record, @Param("example") CompetitionInputExample example);
}