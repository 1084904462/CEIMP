package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Nis;
import org.obsidian.ceimp.entity.NisExample;

public interface NisMapper {
    long countByExample(NisExample example);

    int deleteByExample(NisExample example);

    int deleteByPrimaryKey(Long nisId);

    int insert(Nis record);

    int insertSelective(Nis record);

    List<Nis> selectByExample(NisExample example);

    Nis selectByPrimaryKey(Long nisId);

    int updateByExampleSelective(@Param("record") Nis record, @Param("example") NisExample example);

    int updateByExample(@Param("record") Nis record, @Param("example") NisExample example);

    int updateByPrimaryKeySelective(Nis record);

    int updateByPrimaryKey(Nis record);
}