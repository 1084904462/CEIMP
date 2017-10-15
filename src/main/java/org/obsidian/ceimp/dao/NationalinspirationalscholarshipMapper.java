package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.NationalinspirationalscholarshipShowBean;
import org.obsidian.ceimp.entity.Nationalinspirationalscholarship;
import org.obsidian.ceimp.entity.NationalinspirationalscholarshipExample;

import java.util.List;

public interface NationalinspirationalscholarshipMapper {
    List<NationalinspirationalscholarshipShowBean> selectAllNationalinspirationalscholarship();
    long countByExample(NationalinspirationalscholarshipExample example);

    int deleteByExample(NationalinspirationalscholarshipExample example);

    int insert(Nationalinspirationalscholarship record);

    int insertSelective(Nationalinspirationalscholarship record);

    List<Nationalinspirationalscholarship> selectByExample(NationalinspirationalscholarshipExample example);

    int updateByExampleSelective(@Param("record") Nationalinspirationalscholarship record, @Param("example") NationalinspirationalscholarshipExample example);

    int updateByExample(@Param("record") Nationalinspirationalscholarship record, @Param("example") NationalinspirationalscholarshipExample example);
}