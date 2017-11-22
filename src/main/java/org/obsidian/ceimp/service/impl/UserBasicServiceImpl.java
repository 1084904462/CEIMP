package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.NgBean;
import org.obsidian.ceimp.bean.UserBasicBean;
import org.obsidian.ceimp.bean.UserSearchBean;
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
    public int insertUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userBasic.setPassword(MD5Util.getInstance().EncoderByMd5(userBasic.getPassword()));
        return userBasicMapper.insertSelective(userBasic);
    }

    @Transactional
    @Override
    public int updateUserBasic(UserBasic userBasic) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        userBasic.setPassword(MD5Util.getInstance().EncoderByMd5(userBasic.getPassword()));
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userBasic.getUserId());
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int deleteUserBasic(Long userId) {
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public UserBasic selectByUserId(Long userId) {
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        List<UserBasic> list = userBasicMapper.selectByExample(example);
        if(list.isEmpty()){
            return  null;
        }
        return list.get(0);
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
}
