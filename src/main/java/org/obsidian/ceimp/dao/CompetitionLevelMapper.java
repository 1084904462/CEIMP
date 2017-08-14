package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionLevel;
import org.obsidian.ceimp.entity.CompetitionLevelExample;

public interface CompetitionLevelMapper {
    long countByExample(CompetitionLevelExample example);

    int deleteByExample(CompetitionLevelExample example);

    int insert(CompetitionLevel record);

    int insertSelective(CompetitionLevel record);

    List<CompetitionLevel> selectByExample(CompetitionLevelExample example);

    int updateByExampleSelective(@Param("record") CompetitionLevel record, @Param("example") CompetitionLevelExample example);

    int updateByExample(@Param("record") CompetitionLevel record, @Param("example") CompetitionLevelExample example);
}