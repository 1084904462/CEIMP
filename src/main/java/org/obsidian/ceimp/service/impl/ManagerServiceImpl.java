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

    @Transactional
    @Override
    public int updateManagerPassword(String managerId, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        password = MD5Util.getInstance().EncoderByMd5(password);
        Manager manager = new Manager();
        manager.setPassword(password);
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(managerId);
        return managerMapper.updateByExampleSelective(manager,example);
    }

    @Transactional
    @Override
    public int insertManager(String managerId, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        password = MD5Util.getInstance().EncoderByMd5(password);
        Manager manager = new Manager();
        manager.setManagerId(managerId);
        manager.setPassword(password);
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(managerId).andPasswordEqualTo(password);
        return managerMapper.insertSelective(manager);
    }

    @Transactional
    @Override
    public List<Manager> selectAllManager() {
        List<Manager> list = managerMapper.selectAllManager();
        return list;
    }


}
