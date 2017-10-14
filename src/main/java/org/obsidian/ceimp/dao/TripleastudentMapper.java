package org.obsidian.ceimp.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.entity.Tripleastudent;
import org.obsidian.ceimp.entity.TripleastudentExample;

public interface TripleastudentMapper {
    long countByExample(TripleastudentExample example);

    int deleteByExample(TripleastudentExample example);

    int insert(Tripleastudent record);

    int insertSelective(Tripleastudent record);

    List<Tripleastudent> selectByExample(TripleastudentExample example);

    int updateByExampleSelective(@Param("record") Tripleastudent record, @Param("example") TripleastudentExample example);

    int updateByExample(@Param("record") Tripleastudent record, @Param("example") TripleastudentExample example);
}