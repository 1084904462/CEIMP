package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ManagerMapper;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.ManagerExample;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    ManagerMapper managerMapper;

    @Transactional
    @Override
    public Manager selectByAccount(String account) {
        ManagerExample example = new ManagerExample();
        example.or().andAccountEqualTo(account);
        List<Manager> list = managerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }else {
            return list.get(0);
        }

    }

    @Transactional
    @Override
    public Manager selectByManagerId(Long managerId) {
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(managerId);
        List<Manager> managerList = managerMapper.selectByExample(example);
        if(managerList.isEmpty()){
            return null;
        }
        return managerList.get(0);
    }

    @Transactional
    @Override
    public int update(Manager manager) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        manager.setPassword(MD5Util.getInstance().EncoderByMd5(manager.getPassword()));
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(manager.getManagerId());
        return managerMapper.updateByExampleSelective(manager,example);
    }
}
