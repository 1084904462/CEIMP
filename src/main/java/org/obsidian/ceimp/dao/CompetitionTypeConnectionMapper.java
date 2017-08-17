package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionTypeConnection;
import org.obsidian.ceimp.entity.CompetitionTypeConnectionExample;

public interface CompetitionTypeConnectionMapper {
    long countByExample(CompetitionTypeConnectionExample example);

    int deleteByExample(CompetitionTypeConnectionExample example);

    int insert(CompetitionTypeConnection record);

    int insertSelective(CompetitionTypeConnection record);

    List<CompetitionTypeConnection> selectByExample(CompetitionTypeConnectionExample example);

    int updateByExampleSelective(@Param("record") CompetitionTypeConnection record, @Param("example") CompetitionTypeConnectionExample example);

    int updateByExample(@Param("record") CompetitionTypeConnection record, @Param("example") CompetitionTypeConnectionExample example);
}