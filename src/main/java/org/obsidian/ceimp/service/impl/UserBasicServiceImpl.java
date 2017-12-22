package org.obsidian.ceimp.service.impl;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.UserBasicMapper;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.entity.UserBasicExample;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

/**
 * Created by BillChen on 2017/11/13.
 */
@Service
public class UserBasicServiceImpl implements UserBasicService {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicMapper userBasicMapper;

    @Transactional
    @Override
    public StatusBean userLogin(HttpSession session, LogBean logBean,Map<Long,HttpSession> userSessionMap) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        session.setAttribute("userLogBean",null);   //防止同一个浏览器窗口同时登录用户和管理员身份
        session.setAttribute("managerLogBean",null);
        StatusBean statusBean = new StatusBean();
        UserBasic userBasic = this.selectByAccount(logBean.getAccount());
        if(userBasic != null){
            if(userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(logBean.getPassword()))){
                Long userId = userBasic.getUserId();
                HttpSession preSession = userSessionMap.get(userId);
                if(preSession != null){ //如果原先已有该用户登录的session
                    preSession.setAttribute("userLogBean","");    //把原登录用户的session失效
                    userSessionMap.remove(userId);  //移出userSessionMap中的userId对应的session
                    logger.debug("用户" + userBasic.getAccount() + userBasic.getUsername() + "重复登录");
                }
                UserLogBean userLogBean = new UserLogBean(userBasic.getUserId(),userBasic.getAccount(),userBasic.getUsername());
                session.setAttribute("userLogBean",userLogBean);
                session.setMaxInactiveInterval(30*86400);  //把session的时长设为30天
                userSessionMap.put(userId,session); //把当前登录用户的userId和session放入userSessionMap
                statusBean.setStatus("登录成功");
            }
            else{
                statusBean.setStatus("密码错误");
            }
        }
        else{
            statusBean.setStatus("无该用户");
        }
        return statusBean;
    }

    @Transactional
    @Override
    public List<UserSearchBean> getUserSearchBeanListBySearchKeyListAndSchoolIdAndYearScope(List<String> searchKeyList,Long schoolId,Integer yearScope) {
        return userBasicMapper.getUserSearchBeanListBySearchKeyListAndSchoolIdAndYearScope(searchKeyList,schoolId,yearScope);
    }

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
    public UserBasicBean selectUserBasicBeanByUserId(Long userId) {
        return userBasicMapper.selectUserBasicBeanByUserId(userId);
    }

    @Transactional
    @Override
    public int updateByUserIdAndNgBean(Long userId, NgBean ngBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(ngBean.getSex());
        userBasic.setBirth(ngBean.getBirth());
        userBasic.setNation(ngBean.getNation());
        userBasic.setEntrance(ngBean.getEntrance());
        userBasic.setIdentity(ngBean.getIdentity());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndNisBean(Long userId, NisBean nisBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(nisBean.getSex());
        userBasic.setBirth(nisBean.getBirth());
        userBasic.setNation(nisBean.getNation());
        userBasic.setEntrance(nisBean.getEntrance());
        userBasic.setIdentity(nisBean.getIdentity());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndPgsBean(Long userId, PgsBean pgsBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(pgsBean.getSex());
        userBasic.setBirth(pgsBean.getBirth());
        userBasic.setNation(pgsBean.getNation());
        userBasic.setEntrance(pgsBean.getEntrance());
        userBasic.setIdentity(pgsBean.getIdentity());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndSsBean(Long userId, SsBean ssBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(ssBean.getSex());
        userBasic.setNation(ssBean.getNation());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }

    @Transactional
    @Override
    public int updateByUserIdAndTasBean(Long userId, TasBean tasBean) {
        UserBasic userBasic = new UserBasic();
        userBasic.setSex(tasBean.getSex());
        userBasic.setNation(tasBean.getNation());
        UserBasicExample example = new UserBasicExample();
        example.or().andUserIdEqualTo(userId);
        return userBasicMapper.updateByExampleSelective(userBasic,example);
    }
}
