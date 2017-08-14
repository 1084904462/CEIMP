package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ScholarshipBlock;
import org.obsidian.ceimp.entity.ScholarshipBlockExample;

public interface ScholarshipBlockMapper {
    long countByExample(ScholarshipBlockExample example);

    int deleteByExample(ScholarshipBlockExample example);

    int insert(ScholarshipBlock record);

    int insertSelective(ScholarshipBlock record);

    List<ScholarshipBlock> selectByExample(ScholarshipBlockExample example);

    int updateByExampleSelective(@Param("record") ScholarshipBlock record, @Param("example") ScholarshipBlockExample example);

    int updateByExample(@Param("record") ScholarshipBlock record, @Param("example") ScholarshipBlockExample example);
}