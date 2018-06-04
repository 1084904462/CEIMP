package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.*;
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

    StatusBean changePassword(Long managerId, PasswordBean passwordBean) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    StatusBean insert(InsertManagerBean insertManagerBean) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
