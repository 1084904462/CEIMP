package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.EvaluationPoint;
import org.obsidian.ceimp.entity.EvaluationPointExample;

import java.util.List;

public interface EvaluationPointMapper {
    List<EvaluationPoint> selectAllByClassId(int classId);

    List<EvaluationPoint> selectAllByFormId(int formId);

    long countByExample(EvaluationPointExample example);

    int deleteByExample(EvaluationPointExample example);

    int insert(EvaluationPoint record);

    int insertSelective(EvaluationPoint record);

    List<EvaluationPoint> selectByExample(EvaluationPointExample example);

    int updateByExampleSelective(@Param("record") EvaluationPoint record, @Param("example") EvaluationPointExample example);

    int updateByExample(@Param("record") EvaluationPoint record, @Param("example") EvaluationPointExample example);
}