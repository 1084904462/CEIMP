package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.entity.Ss;
import org.obsidian.ceimp.entity.SsExample;

import java.util.List;

public interface SsMapper {
    List<SsBean> getSsBeanList(@Param("zipInfoBeanList")List<ZipInfoBean> zipInfoBeanList, @Param("yearScope")Integer yearScope);

    String selectRankByUserIdAndYearScope(@Param("userId")Long userId,@Param("yearScope")Integer yearScope);

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
}