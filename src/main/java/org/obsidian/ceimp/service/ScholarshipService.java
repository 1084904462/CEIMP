package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.entity.Scholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface ScholarshipService {
    Scholarship selectByScholarshipId(Long scholarshipId);

    String selectScholarshipNameBySubName(String subName);

    int deleteBySubNameAndUserAccountBeanListAndYearScope(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope);
}
