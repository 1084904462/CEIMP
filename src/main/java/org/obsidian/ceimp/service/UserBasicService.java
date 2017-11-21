package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.UserSearchBean;
import org.obsidian.ceimp.entity.UserBasic;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/13.
 */
public interface UserBasicService {
    int insertUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int updateUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int deleteUserBasic(Long userId);

    UserBasic selectByUserId(Long userId);

    UserBasic selectByAccount(String account);

    List<UserSearchBean> selectByAccountAndUsername(String account, String username);
}
