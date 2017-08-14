package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.ItemScore;
import org.obsidian.ceimp.entity.ItemScoreExample;

public interface ItemScoreMapper {
    long countByExample(ItemScoreExample example);

    int deleteByExample(ItemScoreExample example);

    int insert(ItemScore record);

    int insertSelective(ItemScore record);

    List<ItemScore> selectByExample(ItemScoreExample example);

    int updateByExampleSelective(@Param("record") ItemScore record, @Param("example") ItemScoreExample example);

    int updateByExample(@Param("record") ItemScore record, @Param("example") ItemScoreExample example);
}