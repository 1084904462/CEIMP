package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.UserBasic;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/13.
 */
public interface UserBasicService {
    int updateUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    UserBasic selectByAccount(String account);

    List<UserSearchBean> selectByAccountAndUsername(String account, String username);

    UserBasicBean selectUserBasicBeanByUserId(Long userId);

    int updateByUserIdAndNgBean(Long userId,NgBean ngBean);

    int updateByUserIdAndNisBean(Long userId, NisBean nisBean);

    int updateByUserIdAndPgsBean(Long userId, PgsBean pgsBean);

    int updateByUserIdAndSsBean(Long userId,SsBean ssBean);

    int updateByUserIdAndTasBean(Long userId,TasBean tasBean);
}
