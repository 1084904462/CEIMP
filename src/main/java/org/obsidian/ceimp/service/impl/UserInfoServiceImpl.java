package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.UserInfoMapper;
import org.obsidian.ceimp.entity.UserInfo;
import org.obsidian.ceimp.entity.UserInfoExample;
import org.obsidian.ceimp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by BillChen on 2017/11/21.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional
    @Override
    public UserInfoBean selectUserInfoBeanByUserIdAndYearScope(Long userId, Integer yearScope) {
        return userInfoMapper.selectUserInfoBeanByUserIdAndYearScope(userId,yearScope);
    }

    @Transactional
    @Override
    public int updateByUserIdAndNgBeanAndYearScope(Long userId,NgBean ngBean,Integer yearScope) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPolitical(ngBean.getPolitical());
        userInfo.setPhone(ngBean.getPhone());
        UserInfoExample example = new UserInfoExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndNisBeanAndYearScope(Long userId, NisBean nisBean,Integer yearScope) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPolitical(nisBean.getPolitical());
        userInfo.setPhone(nisBean.getPhone());
        UserInfoExample example = new UserInfoExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndPgsBeanAndYearScope(Long userId, PgsBean pgsBean,Integer yearScope) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPolitical(pgsBean.getPolitical());
        userInfo.setPhone(pgsBean.getPhone());
        UserInfoExample example = new UserInfoExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndSsBeanAndYearScope(Long userId, SsBean ssBean,Integer yearScope) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPolitical(ssBean.getPolitical());
        userInfo.setJob(ssBean.getJob());
        UserInfoExample example = new UserInfoExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return userInfoMapper.updateByExampleSelective(userInfo,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndTasBeanAndYearScope(Long userId, TasBean tasBean,Integer yearScope) {
        UserInfo userInfo = new UserInfo();
        userInfo.setPolitical(tasBean.getPolitical());
        userInfo.setJob(tasBean.getJob());
        UserInfoExample example = new UserInfoExample();
        example.or().andUserIdEqualTo(userId).andYearScopeEqualTo(yearScope);
        return userInfoMapper.updateByExampleSelective(userInfo,example);
    }
}
