package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Manager;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/11/14.
 */

public interface ManagerService {

    Manager selectByAccount(String account);

    Manager selectByManagerId(Long managerId);

    int update(Manager manager) throws UnsupportedEncodingException, NoSuchAlgorithmException;
}
