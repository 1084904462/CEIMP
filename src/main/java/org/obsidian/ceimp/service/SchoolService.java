package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.School;

import java.util.List;

/**
 * Created by BillChen on 2018/5/24.
 */
public interface SchoolService {
    List<School> getAll();

    int insertSchoolList(List<String> schoolList);
}
