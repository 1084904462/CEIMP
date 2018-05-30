package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ExcelUserBean;

import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
public interface UserInfoService {
    List<ExcelUserBean> getExcelUserBeanList(Long schoolId,Integer yearScope);

    int insertExcelUserBeanList(Long schoolId,List<ExcelUserBean> insertExcelUserBeanList,Integer yearScope);

    int updateExcelUserBeanList(Long schoolId,List<ExcelUserBean> updateExcelUserBeanList,Integer yearScope);
}
