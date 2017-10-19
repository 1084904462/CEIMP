package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.NationalGrantOpinionBean;
import org.obsidian.ceimp.bean.NationalGrantShowBean;
import org.obsidian.ceimp.entity.NationalGrant;
import org.obsidian.ceimp.entity.NationalGrantExample;

import java.util.List;

public interface NationalGrantMapper {
    List<NationalGrantOpinionBean> selectAllNationalGrantOpinion();

    List<NationalGrantShowBean> selectAllNationalGrant();

    long countByExample(NationalGrantExample example);

    int deleteByExample(NationalGrantExample example);

    int insert(NationalGrant record);

    int insertSelective(NationalGrant record);

    List<NationalGrant> selectByExample(NationalGrantExample example);

    int updateByExampleSelective(@Param("record") NationalGrant record, @Param("example") NationalGrantExample example);

    int updateByExample(@Param("record") NationalGrant record, @Param("example") NationalGrantExample example);
}