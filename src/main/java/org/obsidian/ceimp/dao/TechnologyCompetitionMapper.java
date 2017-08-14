package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.TechnologyCompetition;
import org.obsidian.ceimp.entity.TechnologyCompetitionExample;

public interface TechnologyCompetitionMapper {
    long countByExample(TechnologyCompetitionExample example);

    int deleteByExample(TechnologyCompetitionExample example);

    int insert(TechnologyCompetition record);

    int insertSelective(TechnologyCompetition record);

    List<TechnologyCompetition> selectByExample(TechnologyCompetitionExample example);

    int updateByExampleSelective(@Param("record") TechnologyCompetition record, @Param("example") TechnologyCompetitionExample example);

    int updateByExample(@Param("record") TechnologyCompetition record, @Param("example") TechnologyCompetitionExample example);
}