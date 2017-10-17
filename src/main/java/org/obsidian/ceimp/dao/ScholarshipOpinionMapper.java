package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ScholarshipOpinion;
import org.obsidian.ceimp.entity.ScholarshipOpinionExample;

public interface ScholarshipOpinionMapper {
    long countByExample(ScholarshipOpinionExample example);

    int deleteByExample(ScholarshipOpinionExample example);

    int insert(ScholarshipOpinion record);

    int insertSelective(ScholarshipOpinion record);

    List<ScholarshipOpinion> selectByExample(ScholarshipOpinionExample example);

    int updateByExampleSelective(@Param("record") ScholarshipOpinion record, @Param("example") ScholarshipOpinionExample example);

    int updateByExample(@Param("record") ScholarshipOpinion record, @Param("example") ScholarshipOpinionExample example);
}