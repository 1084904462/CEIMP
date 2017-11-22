package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.UserBasicMapper;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.entity.UserBasicExample;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/13.
 */
@Service
public class UserBasicServiceImpl implements UserBasicService {

    @Autowired
    private UserBasicMapper userBasicMapper;

    @Transactional
    @Override
    public int updateUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userBasic.setPassword(MD5Util.getInstance().EncoderByMd5(userBasic.getPassword()));
        UserBasicExample example = new UserBasicExample();
        example.or().andAccountEqualTo(userBasic.getAccount());
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public UserBasic selectByAccount(String account) {
        UserBasicExample example = new UserBasicExample();
        example.or().andAccountEqualTo(account);
        List<UserBasic> list = userBasicMapper.selectByExample(example);
        if(list.isEmpty()){
            return  null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<UserSearchBean> selectByAccountAndUsername(String account, String username) {
        return userBasicMapper.selectByAccountAndUsername(account,username);
    }

    @Transactional
    @Override
    public UserBasicBean selectUserBasicBeanByUserId(Long userId) {
        return userBasicMapper.selectUserBasicBeanByUserId(userId);
    }

    @Transactional
    @Override
    public int updateByUserIdAndNgBean(Long userId,NgBean ngBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(ngBean.getSex());
        userBasic.setPolitical(ngBean.getPolitical());
        userBasic.setNation(ngBean.getNation());
        userBasic.setPhone(ngBean.getPhone());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndNisBean(Long userId, NisBean nisBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(nisBean.getSex());
        userBasic.setPolitical(nisBean.getPolitical());
        userBasic.setNation(nisBean.getNation());
        userBasic.setPhone(nisBean.getPhone());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndPgsBean(Long userId, PgsBean pgsBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(pgsBean.getSex());
        userBasic.setPolitical(pgsBean.getPolitical());
        userBasic.setNation(pgsBean.getNation());
        userBasic.setPhone(pgsBean.getPhone());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndSsBean(Long userId, SsBean ssBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setPolitical(ssBean.getPolitical());
        userBasic.setSex(ssBean.getSex());
        userBasic.setNation(ssBean.getNation());
        userBasic.setJob(ssBean.getJob());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndTasBean(Long userId, TasBean tasBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setPolitical(tasBean.getPolitical());
        userBasic.setSex(tasBean.getSex());
        userBasic.setNation(tasBean.getNation());
        userBasic.setJob(tasBean.getJob());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }
}
