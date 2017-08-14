package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.TechnologyCompetitionType;
import org.obsidian.ceimp.entity.TechnologyCompetitionTypeExample;

public interface TechnologyCompetitionTypeMapper {
    long countByExample(TechnologyCompetitionTypeExample example);

    int deleteByExample(TechnologyCompetitionTypeExample example);

    int insert(TechnologyCompetitionType record);

    int insertSelective(TechnologyCompetitionType record);

    List<TechnologyCompetitionType> selectByExample(TechnologyCompetitionTypeExample example);

    int updateByExampleSelective(@Param("record") TechnologyCompetitionType record, @Param("example") TechnologyCompetitionTypeExample example);

    int updateByExample(@Param("record") TechnologyCompetitionType record, @Param("example") TechnologyCompetitionTypeExample example);
}