package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.UserInfoBean;

/**
 * Created by BillChen on 2017/11/21.
 */
public interface UserInfoService {
    UserInfoBean selectUserInfoBeanByUserIdAndYearScope(Long userId, Integer yearScope);
}
