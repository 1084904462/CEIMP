package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ResetUserssBean;
import org.obsidian.ceimp.entity.Userss;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/10/13.
 */
public interface UserssService {
    int updateUserss(String userId,String sex,String entryTime,String phone);

    int updateUserss(String userId,String sex, String nation, String political, String job);

    int updateUserss(String userId,String phone,String sex,String political,String birth,String nation,
                     String entrance,String identity,String passSum,String subSum);

    List<String> selectAllUserId();

    Userss selectByUserId(String userId);

    int updatePassword(String userId,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int updateUserss(int id,String entrance);

    int updateUserssPassword(List<String> list) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int resetAllUsersPassword() throws UnsupportedEncodingException, NoSuchAlgorithmException;

    List<ResetUserssBean> selectAllResetUserssBean();
}
