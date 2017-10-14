package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Provincialgovernmentscholarship;
import org.obsidian.ceimp.entity.ProvincialgovernmentscholarshipExample;

public interface ProvincialgovernmentscholarshipMapper {
    long countByExample(ProvincialgovernmentscholarshipExample example);

    int deleteByExample(ProvincialgovernmentscholarshipExample example);

    int insert(Provincialgovernmentscholarship record);

    int insertSelective(Provincialgovernmentscholarship record);

    List<Provincialgovernmentscholarship> selectByExample(ProvincialgovernmentscholarshipExample example);

    int updateByExampleSelective(@Param("record") Provincialgovernmentscholarship record, @Param("example") ProvincialgovernmentscholarshipExample example);

    int updateByExample(@Param("record") Provincialgovernmentscholarship record, @Param("example") ProvincialgovernmentscholarshipExample example);
}