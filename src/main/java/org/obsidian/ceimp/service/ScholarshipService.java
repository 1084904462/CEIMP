package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.ShowScholarshipBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.entity.Scholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface ScholarshipService {
    String selectScholarshipNameBySubName(String subName);

    int deleteBySubNameAndUserAccountBeanListAndYearScope(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope);

    ShowScholarshipBean getShowScholarshipBean(String subName, Long schoolId);

    List<ScholarshipFormBean> getScholarshipFormBeanList(String subName, Integer yearScope, String grade);

}
