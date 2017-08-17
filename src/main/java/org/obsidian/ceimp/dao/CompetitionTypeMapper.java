package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.CompetitionType;
import org.obsidian.ceimp.entity.CompetitionTypeExample;

public interface CompetitionTypeMapper {
    long countByExample(CompetitionTypeExample example);

    int deleteByExample(CompetitionTypeExample example);

    int insert(CompetitionType record);

    int insertSelective(CompetitionType record);

    List<CompetitionType> selectByExample(CompetitionTypeExample example);

    int updateByExampleSelective(@Param("record") CompetitionType record, @Param("example") CompetitionTypeExample example);

    int updateByExample(@Param("record") CompetitionType record, @Param("example") CompetitionTypeExample example);
}