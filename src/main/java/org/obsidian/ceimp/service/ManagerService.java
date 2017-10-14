package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Manager;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface ManagerService {
    Manager selectByManagerId(String managerId);
}
