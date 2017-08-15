package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.EvaluationItem;
import org.obsidian.ceimp.entity.EvaluationItemExample;

import java.util.List;

public interface EvaluationItemMapper {
    List<EvaluationItem> selectAllByFormId(int formId);

    long countByExample(EvaluationItemExample example);

    int deleteByExample(EvaluationItemExample example);

    int insert(EvaluationItem record);

    int insertSelective(EvaluationItem record);

    List<EvaluationItem> selectByExample(EvaluationItemExample example);

    int updateByExampleSelective(@Param("record") EvaluationItem record, @Param("example") EvaluationItemExample example);

    int updateByExample(@Param("record") EvaluationItem record, @Param("example") EvaluationItemExample example);
}