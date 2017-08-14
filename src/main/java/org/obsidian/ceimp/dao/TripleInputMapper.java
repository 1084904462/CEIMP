package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.TripleInput;
import org.obsidian.ceimp.entity.TripleInputExample;

public interface TripleInputMapper {
    long countByExample(TripleInputExample example);

    int deleteByExample(TripleInputExample example);

    int insert(TripleInput record);

    int insertSelective(TripleInput record);

    List<TripleInput> selectByExample(TripleInputExample example);

    int updateByExampleSelective(@Param("record") TripleInput record, @Param("example") TripleInputExample example);

    int updateByExample(@Param("record") TripleInput record, @Param("example") TripleInputExample example);
}