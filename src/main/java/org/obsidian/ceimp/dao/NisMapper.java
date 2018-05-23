package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.BasicScholarshipBean;
import org.obsidian.ceimp.entity.Nis;
import org.obsidian.ceimp.entity.NisExample;

import java.util.List;

public interface NisMapper {
    int insertNis(@Param("userId")Long userId,@Param("yearScope")Integer yearScope,@Param("bean")BasicScholarshipBean basicScholarshipBean);

    int updateNis(@Param("userId")Long userId,@Param("yearScope")Integer yearScope,@Param("bean")BasicScholarshipBean basicScholarshipBean);

    Nis get(@Param("userId")Long userId,@Param("yearScope")Integer yearScope);

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