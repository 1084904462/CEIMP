package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionScore;
import org.obsidian.ceimp.entity.CompetitionScoreExample;

public interface CompetitionScoreMapper {
    long countByExample(CompetitionScoreExample example);

    int deleteByExample(CompetitionScoreExample example);

    int insert(CompetitionScore record);

    int insertSelective(CompetitionScore record);

    List<CompetitionScore> selectByExample(CompetitionScoreExample example);

    int updateByExampleSelective(@Param("record") CompetitionScore record, @Param("example") CompetitionScoreExample example);

    int updateByExample(@Param("record") CompetitionScore record, @Param("example") CompetitionScoreExample example);
}