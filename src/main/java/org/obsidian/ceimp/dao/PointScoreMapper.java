package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.PointScore;
import org.obsidian.ceimp.entity.PointScoreExample;

public interface PointScoreMapper {
    long countByExample(PointScoreExample example);

    int deleteByExample(PointScoreExample example);

    int insert(PointScore record);

    int insertSelective(PointScore record);

    List<PointScore> selectByExample(PointScoreExample example);

    int updateByExampleSelective(@Param("record") PointScore record, @Param("example") PointScoreExample example);

    int updateByExample(@Param("record") PointScore record, @Param("example") PointScoreExample example);
}