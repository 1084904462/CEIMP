package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.UserssMapper;
import org.obsidian.ceimp.entity.Userss;
import org.obsidian.ceimp.entity.UserssExample;
import org.obsidian.ceimp.service.UserssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/10/13.
 */
@Service
public class UserssServiceImpl implements UserssService {

    @Autowired
    private UserssMapper userssMapper;

    @Transactional
    @Override
    public int updateUserss(String userId, String sex, String entryTime, String phone) {
        Userss userss = new Userss();
        userss.setUserId(userId);
        userss.setSex(sex);
        userss.setEntrance(entryTime);
        userss.setPhone(phone);
        UserssExample example = new UserssExample();
        example.or().andUserIdEqualTo(userId);
        return userssMapper.updateByExampleSelective(userss,example);
    }

    @Transactional
    @Override
    public List<String> selectAllUserId() {
        List<String> list = userssMapper.selectAllUserId();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public Userss selectByUserId(String userId) {
        return userssMapper.selectByUserId(userId);
    }

    @Transactional
    @Override
    public int updatePassword(String userId,String password) {
        return userssMapper.updatePassword(userId,password);
    }
}
