package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Competition;
import org.obsidian.ceimp.entity.CompetitionExample;

public interface CompetitionMapper {
    long countByExample(CompetitionExample example);

    int deleteByExample(CompetitionExample example);

    int insert(Competition record);

    int insertSelective(Competition record);

    List<Competition> selectByExample(CompetitionExample example);

    int updateByExampleSelective(@Param("record") Competition record, @Param("example") CompetitionExample example);

    int updateByExample(@Param("record") Competition record, @Param("example") CompetitionExample example);
}