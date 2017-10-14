package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Nationalinspirationalscholarship;
import org.obsidian.ceimp.entity.NationalinspirationalscholarshipExample;

public interface NationalinspirationalscholarshipMapper {
    long countByExample(NationalinspirationalscholarshipExample example);

    int deleteByExample(NationalinspirationalscholarshipExample example);

    int insert(Nationalinspirationalscholarship record);

    int insertSelective(Nationalinspirationalscholarship record);

    List<Nationalinspirationalscholarship> selectByExample(NationalinspirationalscholarshipExample example);

    int updateByExampleSelective(@Param("record") Nationalinspirationalscholarship record, @Param("example") NationalinspirationalscholarshipExample example);

    int updateByExample(@Param("record") Nationalinspirationalscholarship record, @Param("example") NationalinspirationalscholarshipExample example);
}