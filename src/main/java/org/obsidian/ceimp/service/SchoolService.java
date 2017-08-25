package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.School;

import java.util.List;

/**
 * Created by BillChen on 2017/8/12.
 */
public interface SchoolService {
    int insertSchool(String schoolName);

    int updateSchool(int schoolId,String schoolName);

    int deleteSchool(int schoolId);

    School selectById(int schoolId);

    List<School> selectAllBySchoolName(String schoolName);

    List<School> selectAll();
}
