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
    public StatusBean userLogin(HttpSession session, LogBean logBean) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        session.setAttribute("userLogBean",null);   //防止同一个浏览器窗口同时登录用户和管理员身份
        session.setAttribute("managerLogBean",null);
        StatusBean statusBean = new StatusBean();
        UserBasic userBasic = this.selectByAccount(logBean.getAccount());
        if(userBasic != null){
            if(userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(logBean.getPassword()))){
                UserLogBean userLogBean = new UserLogBean(userBasic.getUserId(),userBasic.getAccount(),userBasic.getUsername());
                session.setAttribute("userLogBean",userLogBean);
                session.setMaxInactiveInterval(30*86400);  //把session的时长设为30天
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
}
