package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Manager;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface ManagerService {
    Manager selectByManagerId(String managerId);

    int updateManagerPassword(String managerId,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    int insertManager(String managerId,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    List<Manager> selectAllManager();
}
