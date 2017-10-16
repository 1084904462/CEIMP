package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.SchoolscholarshipShowBean;
import org.obsidian.ceimp.entity.Schoolscholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface SchoolscholarshipService {
    List<SchoolscholarshipShowBean> selectAllSchoolscholarship();

    int insertSchoolscholarship(String userId,String level,String reason,String opinion);

    int updateSchoolscholarship(String userId,String level,String reason,String opinion);

    int deleteSchoolscholarship(String userId);

    Schoolscholarship selectByUserId(String userId);

    Schoolscholarship selectByUserIdAndLevel(String userId,String level);

    int deleteSchoolscholarshipByUserIdAndLevel(String userId,String level);

    int updateAllOpinion(String opinion);
}
