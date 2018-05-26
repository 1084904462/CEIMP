package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.InsertClassNumBean;

import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
public interface ClassNumService {
    List<InsertClassNumBean> getInsertClassNumBeanList();

    int insertClassNumList(List<InsertClassNumBean> insertClassNumBeanList);
}
