package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Ng;
import org.obsidian.ceimp.entity.NgExample;

public interface NgMapper {
    long countByExample(NgExample example);

    int deleteByExample(NgExample example);

    int deleteByPrimaryKey(Long ngId);

    int insert(Ng record);

    int insertSelective(Ng record);

    List<Ng> selectByExample(NgExample example);

    Ng selectByPrimaryKey(Long ngId);

    int updateByExampleSelective(@Param("record") Ng record, @Param("example") NgExample example);

    int updateByExample(@Param("record") Ng record, @Param("example") NgExample example);

    int updateByPrimaryKeySelective(Ng record);

    int updateByPrimaryKey(Ng record);
}