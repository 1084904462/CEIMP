package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Innovation;
import org.obsidian.ceimp.entity.InnovationExample;

public interface InnovationMapper {
    long countByExample(InnovationExample example);

    int deleteByExample(InnovationExample example);

    int insert(Innovation record);

    int insertSelective(Innovation record);

    List<Innovation> selectByExample(InnovationExample example);

    int updateByExampleSelective(@Param("record") Innovation record, @Param("example") InnovationExample example);

    int updateByExample(@Param("record") Innovation record, @Param("example") InnovationExample example);
}