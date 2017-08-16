package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionLevelConnection;
import org.obsidian.ceimp.entity.CompetitionLevelConnectionExample;

public interface CompetitionLevelConnectionMapper {
    long countByExample(CompetitionLevelConnectionExample example);

    int deleteByExample(CompetitionLevelConnectionExample example);

    int insert(CompetitionLevelConnection record);

    int insertSelective(CompetitionLevelConnection record);

    List<CompetitionLevelConnection> selectByExample(CompetitionLevelConnectionExample example);

    int updateByExampleSelective(@Param("record") CompetitionLevelConnection record, @Param("example") CompetitionLevelConnectionExample example);

    int updateByExample(@Param("record") CompetitionLevelConnection record, @Param("example") CompetitionLevelConnectionExample example);
}