package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.InsertMajorBean;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface MajorService {
    List<String> getAll(Long schoolId);

    List<String> getLastThree(Long schoolId);

    List<InsertMajorBean> getInsertMajorBeanList();

    int insertMajorList(List<InsertMajorBean> insertMajorBeanList);
}
