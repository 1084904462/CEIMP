package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ManagerMapper;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.ManagerExample;
import org.obsidian.ceimp.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/11/14.
 */
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper managerMapper;

    @Override
    public Manager selectByManagerId(Long managerId) {
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(managerId);
        return managerMapper.selectByExample(example).get(0);
    }
}
