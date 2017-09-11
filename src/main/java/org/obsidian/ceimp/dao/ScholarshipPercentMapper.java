package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ScholarshipPercent;
import org.obsidian.ceimp.entity.ScholarshipPercentExample;

public interface ScholarshipPercentMapper {
    long countByExample(ScholarshipPercentExample example);

    int deleteByExample(ScholarshipPercentExample example);

    int insert(ScholarshipPercent record);

    int insertSelective(ScholarshipPercent record);

    List<ScholarshipPercent> selectByExample(ScholarshipPercentExample example);

    int updateByExampleSelective(@Param("record") ScholarshipPercent record, @Param("example") ScholarshipPercentExample example);

    int updateByExample(@Param("record") ScholarshipPercent record, @Param("example") ScholarshipPercentExample example);
}