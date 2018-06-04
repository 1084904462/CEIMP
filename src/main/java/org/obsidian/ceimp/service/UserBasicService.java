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
    StatusBean insert(Long schoolId,List<ExcelUserBean> excelUserBeanList) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    StatusBean userLogin(HttpSession session, LogBean logBean) throws NoSuchAlgorithmException, UnsupportedEncodingException;

    StatusBean resetPassword(UserAccountListBean userAccountListBean, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    UserBasic selectByAccount(String account);

    List<InsertUserBasicBean> getInsertUserBasicBeanList();

    int insertUserBasicBeanList(List<InsertUserBasicBean> insertUserBasicBeanList);

    List<UserSearchBean> getUserSearchBeanList(Long schoolId,String grade,Integer yearScope);

    StatusBean changeUserPassword(Long userId,PasswordBean passwordBean) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    List<String> getAccountList(Long schoolId,Integer yearScope);

    List<String> getAccountListReverse(Long schoolId,Integer yearScope);

    StatusBean deleteUser(UserAccountListBean userAccountListBean);
}
