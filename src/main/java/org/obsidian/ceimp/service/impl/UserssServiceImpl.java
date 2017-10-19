package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.ResetUserssBean;
import org.obsidian.ceimp.dao.UserssMapper;
import org.obsidian.ceimp.entity.Userss;
import org.obsidian.ceimp.entity.UserssExample;
import org.obsidian.ceimp.service.UserssService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
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
    public int updateUserss(String userId, String phone, String sex, String political, String birth, String nation, String entrance, String identity) {
        Userss userss = new Userss();
        userss.setPhone(phone);
        userss.setSex(sex);
        userss.setPolitical(political);
        userss.setBirth(birth);
        userss.setNation(nation);
        userss.setEntrance(entrance);
        userss.setIdentity(identity);
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
    public int updatePassword(String userId,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        password = MD5Util.getInstance().EncoderByMd5(password);
        return userssMapper.updatePassword(userId,password);
    }

    @Transactional
    @Override
    public int updateUserss(int id, String entrance) {
        Userss userss = new Userss();
        userss.setId(id);
        userss.setEntrance(entrance);
        UserssExample example = new UserssExample();
        example.or().andIdEqualTo(id);
        return userssMapper.updateByExampleSelective(userss,example);
    }

    @Transactional
    @Override
    public int updateUserssPassword(List<String> list) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        int updateSum = 0;
        Userss userss = new Userss();
        String password = MD5Util.getInstance().EncoderByMd5("888888");
        userss.setPassword(password);
        UserssExample example = null;
        if(list != null){
            for(int i=0;i<list.size();i++){
                example = new UserssExample();
                example.or().andUserIdEqualTo(list.get(i));
                userssMapper.updateByExampleSelective(userss,example);
                updateSum++;
            }
        }
        return updateSum;
    }

    @Transactional
    @Override
    public int resetAllUsersPassword() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String password = MD5Util.getInstance().EncoderByMd5("888888");
        Userss userss = new Userss();
        userss.setPassword(password);
        UserssExample example = new UserssExample();
        return userssMapper.updateByExampleSelective(userss,example);
    }

    @Transactional
    @Override
    public List<ResetUserssBean> selectAllResetUserssBean() {
        List<ResetUserssBean> list = userssMapper.selectAllResetUserssBean();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
