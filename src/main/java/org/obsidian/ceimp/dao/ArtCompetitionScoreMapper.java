package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ArtCompetitionScore;
import org.obsidian.ceimp.entity.ArtCompetitionScoreExample;

public interface ArtCompetitionScoreMapper {
    long countByExample(ArtCompetitionScoreExample example);

    int deleteByExample(ArtCompetitionScoreExample example);

    int insert(ArtCompetitionScore record);

    int insertSelective(ArtCompetitionScore record);

    List<ArtCompetitionScore> selectByExample(ArtCompetitionScoreExample example);

    int updateByExampleSelective(@Param("record") ArtCompetitionScore record, @Param("example") ArtCompetitionScoreExample example);

    int updateByExample(@Param("record") ArtCompetitionScore record, @Param("example") ArtCompetitionScoreExample example);
}