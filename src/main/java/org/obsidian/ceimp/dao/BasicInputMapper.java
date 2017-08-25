package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.BasicInput;
import org.obsidian.ceimp.entity.BasicInputExample;

public interface BasicInputMapper {
    long countByExample(BasicInputExample example);

    int deleteByExample(BasicInputExample example);

    int insert(BasicInput record);

    int insertSelective(BasicInput record);

    List<BasicInput> selectByExample(BasicInputExample example);

    int updateByExampleSelective(@Param("record") BasicInput record, @Param("example") BasicInputExample example);

    int updateByExample(@Param("record") BasicInput record, @Param("example") BasicInputExample example);
}