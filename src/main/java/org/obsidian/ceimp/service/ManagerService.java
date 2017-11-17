package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Manager;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/14.
 */

public interface ManagerService {

    Manager selectByAccount(String account);
}
