package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.LogBean;
import org.obsidian.ceimp.bean.StatusBean;
import org.obsidian.ceimp.entity.Manager;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/14.
 */

public interface ManagerService {
    StatusBean managerLogin(HttpSession session, LogBean logBean, Map<Long,HttpSession> managerSessionMap) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    Manager selectByAccount(String account);

    Manager selectByManagerId(Long managerId);

    int updateManager(Manager manager) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
