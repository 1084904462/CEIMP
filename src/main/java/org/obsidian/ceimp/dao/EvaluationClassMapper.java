package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.EvaluationClass;
import org.obsidian.ceimp.entity.EvaluationClassExample;

public interface EvaluationClassMapper {
    long countByExample(EvaluationClassExample example);

    int deleteByExample(EvaluationClassExample example);

    int insert(EvaluationClass record);

    int insertSelective(EvaluationClass record);

    List<EvaluationClass> selectByExample(EvaluationClassExample example);

    int updateByExampleSelective(@Param("record") EvaluationClass record, @Param("example") EvaluationClassExample example);

    int updateByExample(@Param("record") EvaluationClass record, @Param("example") EvaluationClassExample example);
}