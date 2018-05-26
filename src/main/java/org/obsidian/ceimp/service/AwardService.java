package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ExcelScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.UserAccountBean;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface AwardService {
    int insertExcelScholarshipBeanList(List<ExcelScholarshipBean> excelScholarshipBeanList,Integer yearScope);

    List<ExcelScholarshipBean> getExcelScholarshipBeanList(Integer yearScope);

    List<AwardBean> getList(Long userId, Integer yearScope);

    List<ScholarshipFormBean> getAll(String subName,Integer yearScope,String grade);

    Boolean exist(Long userId,String subName,Integer yearScope);

    int updateIsFilled(Long userId,Integer yearScope,String subName);

    int cancelIsFilled(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope);

    int insert(List<ExcelScholarshipBean> excelScholarshipBeanList);
}
