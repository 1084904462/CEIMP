package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.UserInfoBean;
import org.obsidian.ceimp.dao.UserInfoMapper;
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
}
