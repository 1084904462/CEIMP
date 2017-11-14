package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ClassNum;
import org.obsidian.ceimp.entity.ClassNumExample;

public interface ClassNumMapper {
    long countByExample(ClassNumExample example);

    int deleteByExample(ClassNumExample example);

    int deleteByPrimaryKey(Long classNumId);

    int insert(ClassNum record);

    int insertSelective(ClassNum record);

    List<ClassNum> selectByExample(ClassNumExample example);

    ClassNum selectByPrimaryKey(Long classNumId);

    int updateByExampleSelective(@Param("record") ClassNum record, @Param("example") ClassNumExample example);

    int updateByExample(@Param("record") ClassNum record, @Param("example") ClassNumExample example);

    int updateByPrimaryKeySelective(ClassNum record);

    int updateByPrimaryKey(ClassNum record);
}