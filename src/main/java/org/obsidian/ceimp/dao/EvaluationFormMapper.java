package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.EvaluationForm;
import org.obsidian.ceimp.entity.EvaluationFormExample;

public interface EvaluationFormMapper {
    long countByExample(EvaluationFormExample example);

    int deleteByExample(EvaluationFormExample example);

    int insert(EvaluationForm record);

    int insertSelective(EvaluationForm record);

    List<EvaluationForm> selectByExample(EvaluationFormExample example);

    int updateByExampleSelective(@Param("record") EvaluationForm record, @Param("example") EvaluationFormExample example);

    int updateByExample(@Param("record") EvaluationForm record, @Param("example") EvaluationFormExample example);
}