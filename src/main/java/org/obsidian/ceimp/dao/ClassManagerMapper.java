package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ClassManager;
import org.obsidian.ceimp.entity.ClassManagerExample;

public interface ClassManagerMapper {
    long countByExample(ClassManagerExample example);

    int deleteByExample(ClassManagerExample example);

    int insert(ClassManager record);

    int insertSelective(ClassManager record);

    List<ClassManager> selectByExample(ClassManagerExample example);

    int updateByExampleSelective(@Param("record") ClassManager record, @Param("example") ClassManagerExample example);

    int updateByExample(@Param("record") ClassManager record, @Param("example") ClassManagerExample example);
}