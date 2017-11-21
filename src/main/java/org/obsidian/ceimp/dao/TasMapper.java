package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.TasBean;
import org.obsidian.ceimp.entity.Tas;
import org.obsidian.ceimp.entity.TasExample;

import java.util.List;

public interface TasMapper {
    TasBean selectTasBeanByUserIdAndYearScope(@Param("userId") Long userId, @Param("yearScope") Integer yearScope);

    long countByExample(TasExample example);

    int deleteByExample(TasExample example);

    int deleteByPrimaryKey(Long tasId);

    int insert(Tas record);

    int insertSelective(Tas record);

    List<Tas> selectByExample(TasExample example);

    Tas selectByPrimaryKey(Long tasId);

    int updateByExampleSelective(@Param("record") Tas record, @Param("example") TasExample example);

    int updateByExample(@Param("record") Tas record, @Param("example") TasExample example);

    int updateByPrimaryKeySelective(Tas record);

    int updateByPrimaryKey(Tas record);
}