package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.LogBean;
import org.obsidian.ceimp.bean.PasswordBean;
import org.obsidian.ceimp.bean.StatusBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.entity.Manager;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/11/14.
 */

public interface ManagerService {
    StatusBean managerLogin(HttpSession session, LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    Manager get(String account);

    Manager get(Long managerId);

    int update(Manager manager) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    StatusBean resetPassword(UserAccountBean userAccountBean,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    StatusBean changePassword(Long managerId, PasswordBean passwordBean) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
