package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ScholarshipItem;
import org.obsidian.ceimp.entity.ScholarshipItemExample;

public interface ScholarshipItemMapper {
    long countByExample(ScholarshipItemExample example);

    int deleteByExample(ScholarshipItemExample example);

    int insert(ScholarshipItem record);

    int insertSelective(ScholarshipItem record);

    List<ScholarshipItem> selectByExample(ScholarshipItemExample example);

    int updateByExampleSelective(@Param("record") ScholarshipItem record, @Param("example") ScholarshipItemExample example);

    int updateByExample(@Param("record") ScholarshipItem record, @Param("example") ScholarshipItemExample example);
}