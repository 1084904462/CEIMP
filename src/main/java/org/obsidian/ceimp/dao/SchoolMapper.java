package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.entity.SchoolExample;

public interface SchoolMapper {
    long countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int deleteByPrimaryKey(Long schoolId);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    School selectByPrimaryKey(Long schoolId);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}