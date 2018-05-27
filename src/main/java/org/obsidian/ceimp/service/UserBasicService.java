package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.entity.UserBasic;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/13.
 */
public interface UserBasicService {
    int insert(List<ExcelUserBean> excelUserBeanList) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    StatusBean userLogin(HttpSession session, LogBean logBean) throws NoSuchAlgorithmException, UnsupportedEncodingException;

    int resetPassword(ResetPasswordBean resetPasswordBean,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    UserBasic selectByAccount(String account);

    List<InsertUserBasicBean> getInsertUserBasicBeanList();

    int insertUserBasicBeanList(List<InsertUserBasicBean> insertUserBasicBeanList);

    List<UserSearchBean> getUserSearchBeanList(Long schoolId,String grade,Integer yearScope);
}
