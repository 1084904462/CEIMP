package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.entity.ScholarshipExample;

import java.util.List;

public interface ScholarshipMapper {
    int deleteAllBySubNameAndUserAccountBeanListAndYearScope(@Param("subName")String subName,
                                                             @Param("userAccountBeanList")List<UserAccountBean> userAccountBeanList,
                                                             @Param("yearScope")Integer yearScope);

    long countByExample(ScholarshipExample example);

    int deleteByExample(ScholarshipExample example);

    int deleteByPrimaryKey(Long scholarshipId);

    int insert(Scholarship record);

    int insertSelective(Scholarship record);

    List<Scholarship> selectByExample(ScholarshipExample example);

    Scholarship selectByPrimaryKey(Long scholarshipId);

    int updateByExampleSelective(@Param("record") Scholarship record, @Param("example") ScholarshipExample example);

    int updateByExample(@Param("record") Scholarship record, @Param("example") ScholarshipExample example);

    int updateByPrimaryKeySelective(Scholarship record);

    int updateByPrimaryKey(Scholarship record);

    Scholarship selectBySubName(@Param("subName")String subName);
}