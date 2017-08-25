package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.InnovationRequire;
import org.obsidian.ceimp.entity.InnovationRequireExample;

public interface InnovationRequireMapper {
    long countByExample(InnovationRequireExample example);

    int deleteByExample(InnovationRequireExample example);

    int insert(InnovationRequire record);

    int insertSelective(InnovationRequire record);

    List<InnovationRequire> selectByExample(InnovationRequireExample example);

    int updateByExampleSelective(@Param("record") InnovationRequire record, @Param("example") InnovationRequireExample example);

    int updateByExample(@Param("record") InnovationRequire record, @Param("example") InnovationRequireExample example);
}