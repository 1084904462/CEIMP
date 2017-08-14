package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.FillInType;
import org.obsidian.ceimp.entity.FillInTypeExample;

public interface FillInTypeMapper {
    long countByExample(FillInTypeExample example);

    int deleteByExample(FillInTypeExample example);

    int insert(FillInType record);

    int insertSelective(FillInType record);

    List<FillInType> selectByExample(FillInTypeExample example);

    int updateByExampleSelective(@Param("record") FillInType record, @Param("example") FillInTypeExample example);

    int updateByExample(@Param("record") FillInType record, @Param("example") FillInTypeExample example);
}