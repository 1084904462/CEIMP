package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.ExcelUserBean;
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
    public List<ExcelUserBean> getExcelUserBeanList(Integer yearScope) {
        return userInfoMapper.getExcelUserBeanList(yearScope);
    }

    @Transactional
    @Override
    public int insertExcelUserBeanList(List<ExcelUserBean> insertExcelUserBeanList,Integer yearScope) {
        return userInfoMapper.insertExcelUserBeanList(insertExcelUserBeanList,yearScope);
    }

    @Transactional
    @Override
    public int updateExcelUserBeanList(List<ExcelUserBean> updateExcelUserBeanList,Integer yearScope) {
        return userInfoMapper.updateExcelUserBeanList(updateExcelUserBeanList,yearScope);
    }
}
