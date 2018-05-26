package org.obsidian.ceimp.dao;

import org.apache.ibatis.annotations.Param;
import org.obsidian.ceimp.bean.InsertMajorBean;
import org.obsidian.ceimp.entity.Major;
import org.obsidian.ceimp.entity.MajorExample;

import java.util.List;

public interface MajorMapper {
    int insertMajorList(List<InsertMajorBean> insertMajorBeanList);

    List<InsertMajorBean> getInsertMajorBeanList();

    List<String> getAll(Long schoolId);

    List<String> getLastThree(Long schoolId);

    long countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    int deleteByPrimaryKey(Long majorId);

    int insert(Major record);

    int insertSelective(Major record);

    List<Major> selectByExample(MajorExample example);

    Major selectByPrimaryKey(Long majorId);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}