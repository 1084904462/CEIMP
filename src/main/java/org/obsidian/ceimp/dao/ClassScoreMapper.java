package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ClassScore;
import org.obsidian.ceimp.entity.ClassScoreExample;

public interface ClassScoreMapper {
    long countByExample(ClassScoreExample example);

    int deleteByExample(ClassScoreExample example);

    int insert(ClassScore record);

    int insertSelective(ClassScore record);

    List<ClassScore> selectByExample(ClassScoreExample example);

    int updateByExampleSelective(@Param("record") ClassScore record, @Param("example") ClassScoreExample example);

    int updateByExample(@Param("record") ClassScore record, @Param("example") ClassScoreExample example);
}