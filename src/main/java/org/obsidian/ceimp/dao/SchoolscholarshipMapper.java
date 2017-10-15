package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.SchoolscholarshipShowBean;
import org.obsidian.ceimp.entity.Schoolscholarship;
import org.obsidian.ceimp.entity.SchoolscholarshipExample;

import java.util.List;

public interface SchoolscholarshipMapper {
    List<SchoolscholarshipShowBean> selectAllSchoolscholarship();

    long countByExample(SchoolscholarshipExample example);

    int deleteByExample(SchoolscholarshipExample example);

    int insert(Schoolscholarship record);

    int insertSelective(Schoolscholarship record);

    List<Schoolscholarship> selectByExample(SchoolscholarshipExample example);

    int updateByExampleSelective(@Param("record") Schoolscholarship record, @Param("example") SchoolscholarshipExample example);

    int updateByExample(@Param("record") Schoolscholarship record, @Param("example") SchoolscholarshipExample example);
}