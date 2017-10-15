package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.TripleastudentShowBean;
import org.obsidian.ceimp.entity.Tripleastudent;
import org.obsidian.ceimp.entity.TripleastudentExample;

import java.util.List;

public interface TripleastudentMapper {
    List<TripleastudentShowBean> selectAllTripleastudent();

    long countByExample(TripleastudentExample example);

    int deleteByExample(TripleastudentExample example);

    int insert(Tripleastudent record);

    int insertSelective(Tripleastudent record);

    List<Tripleastudent> selectByExample(TripleastudentExample example);

    int updateByExampleSelective(@Param("record") Tripleastudent record, @Param("example") TripleastudentExample example);

    int updateByExample(@Param("record") Tripleastudent record, @Param("example") TripleastudentExample example);
}