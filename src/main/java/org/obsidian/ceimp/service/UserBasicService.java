package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.UserBasic;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by BillChen on 2017/11/13.
 */
public interface UserBasicService {
    int insertUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int updateUserBasic(UserBasic userBasic);

    int deleteUserBasic(Long userId);

    UserBasic selectByUserId(Long userId);

    UserBasic selectByAccount(String account);
}
