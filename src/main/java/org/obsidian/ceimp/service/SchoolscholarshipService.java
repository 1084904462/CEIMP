package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Schoolscholarship;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface SchoolscholarshipService {
    int insertSchoolscholarship(String userId,String level,String reason,String opinion);

    int updateSchoolscholarship(String userId,String level,String reason,String opinion);

    int deleteSchoolscholarship(String userId);

    Schoolscholarship selectByUserId(String userId);

    Schoolscholarship selectByUserIdAndLevel(String userId,String level);
}
