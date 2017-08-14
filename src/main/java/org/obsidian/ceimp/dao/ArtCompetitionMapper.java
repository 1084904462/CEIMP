package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ArtCompetition;
import org.obsidian.ceimp.entity.ArtCompetitionExample;

public interface ArtCompetitionMapper {
    long countByExample(ArtCompetitionExample example);

    int deleteByExample(ArtCompetitionExample example);

    int insert(ArtCompetition record);

    int insertSelective(ArtCompetition record);

    List<ArtCompetition> selectByExample(ArtCompetitionExample example);

    int updateByExampleSelective(@Param("record") ArtCompetition record, @Param("example") ArtCompetitionExample example);

    int updateByExample(@Param("record") ArtCompetition record, @Param("example") ArtCompetitionExample example);
}