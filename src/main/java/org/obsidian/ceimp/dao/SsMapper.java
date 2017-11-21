package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.entity.Ss;
import org.obsidian.ceimp.entity.SsExample;

public interface SsMapper {
    long countByExample(SsExample example);

    int deleteByExample(SsExample example);

    int deleteByPrimaryKey(Long ssId);

    int insert(Ss record);

    int insertSelective(Ss record);

    List<Ss> selectByExample(SsExample example);

    Ss selectByPrimaryKey(Long ssId);

    int updateByExampleSelective(@Param("record") Ss record, @Param("example") SsExample example);

    int updateByExample(@Param("record") Ss record, @Param("example") SsExample example);

    int updateByPrimaryKeySelective(Ss record);

    int updateByPrimaryKey(Ss record);

    SsBean selectSsBeanByUserIdAndYearScope(@Param("userId") Long userId,@Param("yearScope") int yearScope);
}