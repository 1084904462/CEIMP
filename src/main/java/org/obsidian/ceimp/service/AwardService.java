package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.*;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface AwardService {
    int insertExcelScholarshipBeanList(List<ExcelScholarshipBean> excelScholarshipBeanList,Integer yearScope);

    List<AwardBean> getList(Long userId, Integer yearScope);

    List<ScholarshipFormBean> getAll(Long schoolId,String subName,Integer yearScope,String grade);

    Boolean exist(Long userId,String subName,Integer yearScope);

    int updateIsFilled(Long userId,Integer yearScope,String subName);

    int cancelIsFilled(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope);

    StatusBean insert(Long schoolId,List<ExcelScholarshipBean> excelScholarshipBeanList);

    int deleteAll(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope);
}
