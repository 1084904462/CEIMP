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
    public int updateUserss(String userId,String sex, String nation, String political, String job) {
        Userss userss = new Userss();
        userss.setUserId(userId);
        userss.setSex(sex);
        userss.setNation(nation);
        userss.setPolitical(political);
        userss.setJob(job);
        UserssExample example = new UserssExample();
        example.or().andUserIdEqualTo(userId);
        return userssMapper.updateByExampleSelective(userss,example);
    }

    @Transactional
    @Override
    public int updateUserss(String userId, String phone, String sex, String political, String birth, String nation, String entrance, String identity, String passSum, String subSum) {
        Userss userss = new Userss();
        userss.setUserId(userId);
        userss.setPhone(phone);
        userss.setSex(sex);
        userss.setPolitical(political);
        userss.setBirth(birth);
        userss.setNation(nation);
        userss.setEntrance(entrance);
        userss.setIdentity(identity);
        userss.setPassSum(passSum);
        userss.setSubSum(subSum);
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
