package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.TechnologyCompetitionScore;
import org.obsidian.ceimp.entity.TechnologyCompetitionScoreExample;

public interface TechnologyCompetitionScoreMapper {
    long countByExample(TechnologyCompetitionScoreExample example);

    int deleteByExample(TechnologyCompetitionScoreExample example);

    int insert(TechnologyCompetitionScore record);

    int insertSelective(TechnologyCompetitionScore record);

    List<TechnologyCompetitionScore> selectByExample(TechnologyCompetitionScoreExample example);

    int updateByExampleSelective(@Param("record") TechnologyCompetitionScore record, @Param("example") TechnologyCompetitionScoreExample example);

    int updateByExample(@Param("record") TechnologyCompetitionScore record, @Param("example") TechnologyCompetitionScoreExample example);
}