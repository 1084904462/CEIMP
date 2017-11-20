package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.PgsBean;
import org.obsidian.ceimp.entity.Pgs;
import org.obsidian.ceimp.entity.PgsExample;

public interface PgsMapper {
    long countByExample(PgsExample example);

    int deleteByExample(PgsExample example);

    int deleteByPrimaryKey(Long pgsId);

    int insert(Pgs record);

    int insertSelective(Pgs record);

    List<Pgs> selectByExample(PgsExample example);

    Pgs selectByPrimaryKey(Long pgsId);

    int updateByExampleSelective(@Param("record") Pgs record, @Param("example") PgsExample example);

    int updateByExample(@Param("record") Pgs record, @Param("example") PgsExample example);

    int updateByPrimaryKeySelective(Pgs record);

    int updateByPrimaryKey(Pgs record);

    PgsBean selectPgsBeanByUserIdAndYearScope(@Param("userId") Long userId,@Param("yearScope") int yearScope);
}