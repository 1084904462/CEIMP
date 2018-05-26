package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ExcelUserBean;

import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
public interface UserInfoService {
    List<ExcelUserBean> getExcelUserBeanList(Integer yearScope);

    int insertExcelUserBeanList(List<ExcelUserBean> insertExcelUserBeanList,Integer yearScope);

    int updateExcelUserBeanList(List<ExcelUserBean> updateExcelUserBeanList,Integer yearScope);
}
