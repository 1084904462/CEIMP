package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Manager;

/**
 * Created by Administrator on 2017/11/14.
 */
public interface ManagerService {

    Manager selectByManagerId(Long managerId);
}
