package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.AwardExample;

public interface AwardMapper {
    long countByExample(AwardExample example);

    int deleteByExample(AwardExample example);

    int deleteByPrimaryKey(Long awardId);

    int insert(Award record);

    int insertSelective(Award record);

    List<Award> selectByExample(AwardExample example);

    Award selectByPrimaryKey(Long awardId);

    int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByExample(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKey(Award record);
}