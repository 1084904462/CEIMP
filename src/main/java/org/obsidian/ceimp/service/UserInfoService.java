package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.*;

/**
 * Created by BillChen on 2017/11/21.
 */
public interface UserInfoService {
    UserInfoBean selectUserInfoBeanByUserIdAndYearScope(Long userId, Integer yearScope);

    int updateByUserIdAndNgBeanAndYearScope(Long userId,NgBean ngBean,Integer yearScope);

    int updateByUserIdAndNisBeanAndYearScope(Long userId, NisBean nisBean,Integer yearScope);

    int updateByUserIdAndPgsBeanAndYearScope(Long userId, PgsBean pgsBean,Integer yearScope);

    int updateByUserIdAndSsBeanAndYearScope(Long userId,SsBean ssBean,Integer yearScope);

    int updateByUserIdAndTasBeanAndYearScope(Long userId,TasBean tasBean,Integer yearScope);
}
