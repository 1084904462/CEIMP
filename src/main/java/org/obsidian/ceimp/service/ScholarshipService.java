package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.ShowScholarshipBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.bean.ZipInfoBean;

import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface ScholarshipService {
    List<Map<String,String>> getTextMapList(String subName,List<ZipInfoBean> zipInfoBeanList,Integer yearScope);

    List<String> getModelNameList(String subName,String scholarshipName, List<ZipInfoBean> zipInfoBeanList,Integer yearScope);

    String getScholarshipName(String subName);

    int deleteAll(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope);

    ShowScholarshipBean getShowScholarshipBean(String subName, Long schoolId);

    List<ScholarshipFormBean> getScholarshipFormBeanList(Long schoolId,String subName, Integer yearScope, String grade);

    List<String> getSsNameList();
}
