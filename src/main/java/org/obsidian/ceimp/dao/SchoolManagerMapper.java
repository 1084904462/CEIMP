package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.SchoolManager;
import org.obsidian.ceimp.entity.SchoolManagerExample;

public interface SchoolManagerMapper {
    long countByExample(SchoolManagerExample example);

    int deleteByExample(SchoolManagerExample example);

    int insert(SchoolManager record);

    int insertSelective(SchoolManager record);

    List<SchoolManager> selectByExample(SchoolManagerExample example);

    int updateByExampleSelective(@Param("record") SchoolManager record, @Param("example") SchoolManagerExample example);

    int updateByExample(@Param("record") SchoolManager record, @Param("example") SchoolManagerExample example);
}