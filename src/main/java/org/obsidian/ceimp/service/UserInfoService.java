package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.InsertUserInfoBean;

import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
public interface UserInfoService {
    List<InsertUserInfoBean> getInsertUserInfoBeanList();

    int insertUserInfoBean(List<InsertUserInfoBean> insertUserInfoBeanList);
}
