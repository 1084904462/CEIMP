package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionGroup;
import org.obsidian.ceimp.entity.CompetitionGroupExample;

public interface CompetitionGroupMapper {
    long countByExample(CompetitionGroupExample example);

    int deleteByExample(CompetitionGroupExample example);

    int insert(CompetitionGroup record);

    int insertSelective(CompetitionGroup record);

    List<CompetitionGroup> selectByExample(CompetitionGroupExample example);

    int updateByExampleSelective(@Param("record") CompetitionGroup record, @Param("example") CompetitionGroupExample example);

    int updateByExample(@Param("record") CompetitionGroup record, @Param("example") CompetitionGroupExample example);
}