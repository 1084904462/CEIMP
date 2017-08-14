package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.AwardLevel;
import org.obsidian.ceimp.entity.AwardLevelExample;

public interface AwardLevelMapper {
    long countByExample(AwardLevelExample example);

    int deleteByExample(AwardLevelExample example);

    int insert(AwardLevel record);

    int insertSelective(AwardLevel record);

    List<AwardLevel> selectByExample(AwardLevelExample example);

    int updateByExampleSelective(@Param("record") AwardLevel record, @Param("example") AwardLevelExample example);

    int updateByExample(@Param("record") AwardLevel record, @Param("example") AwardLevelExample example);
}