package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ManagerMapper;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.ManagerExample;
import org.obsidian.ceimp.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    @Transactional
    @Override
    public Manager selectByManagerId(String managerId) {
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(managerId);
        List<Manager> list = managerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
