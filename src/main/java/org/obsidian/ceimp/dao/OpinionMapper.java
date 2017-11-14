package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Opinion;
import org.obsidian.ceimp.entity.OpinionExample;

public interface OpinionMapper {
    long countByExample(OpinionExample example);

    int deleteByExample(OpinionExample example);

    int deleteByPrimaryKey(Long opinionId);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    List<Opinion> selectByExample(OpinionExample example);

    Opinion selectByPrimaryKey(Long opinionId);

    int updateByExampleSelective(@Param("record") Opinion record, @Param("example") OpinionExample example);

    int updateByExample(@Param("record") Opinion record, @Param("example") OpinionExample example);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}