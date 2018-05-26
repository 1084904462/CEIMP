package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.InsertUserInfoBean;
import org.obsidian.ceimp.dao.UserInfoMapper;
import org.obsidian.ceimp.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2018/5/25.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Transactional
    @Override
    public List<InsertUserInfoBean> getInsertUserInfoBeanList() {
        return userInfoMapper.getInsertUserInfoBeanList();
    }

    @Transactional
    @Override
    public int insertUserInfoBean(List<InsertUserInfoBean> insertUserInfoBeanList) {
        return userInfoMapper.insertUserInfoBean(insertUserInfoBeanList);
    }
}
