package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.TasBean;
import org.obsidian.ceimp.entity.Tas;
import org.obsidian.ceimp.entity.TasExample;

public interface TasMapper {
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

    TasBean selectTasBeanByUserIdAndYearScope(@Param("userId") Long userId,@Param("yearScope") int yearScope);
}