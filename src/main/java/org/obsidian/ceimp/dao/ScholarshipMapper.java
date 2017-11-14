package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipExample;

public interface ScholarshipMapper {
    long countByExample(ScholarshipExample example);

    int deleteByExample(ScholarshipExample example);

    int deleteByPrimaryKey(Long scholarshipId);

    int insert(Scholarship record);

    int insertSelective(Scholarship record);

    List<Scholarship> selectByExample(ScholarshipExample example);

    Scholarship selectByPrimaryKey(Long scholarshipId);

    int updateByExampleSelective(@Param("record") Scholarship record, @Param("example") ScholarshipExample example);

    int updateByExample(@Param("record") Scholarship record, @Param("example") ScholarshipExample example);

    int updateByPrimaryKeySelective(Scholarship record);

    int updateByPrimaryKey(Scholarship record);
}