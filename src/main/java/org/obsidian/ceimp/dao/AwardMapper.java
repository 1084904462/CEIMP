package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.AwardExample;

import java.util.List;

public interface AwardMapper {
    List<Award> selectAllByClassId(int classId);

    List<Award> selectAllBySchoolId(int schoolId);

    long countByExample(AwardExample example);

    int deleteByExample(AwardExample example);

    int insert(Award record);

    int insertSelective(Award record);

    List<Award> selectByExample(AwardExample example);

    int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByExample(@Param("record") Award record, @Param("example") AwardExample example);
}