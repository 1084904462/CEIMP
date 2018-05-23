package org.obsidian.ceimp.service.impl;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.LogBean;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.bean.StatusBean;
import org.obsidian.ceimp.dao.ManagerMapper;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.ManagerExample;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ManagerMapper managerMapper;

    @Transactional
    @Override
    public StatusBean managerLogin(HttpSession session, LogBean logBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        session.setAttribute("userLogBean",null);
        session.setAttribute("managerLogBean",null);
        StatusBean statusBean = new StatusBean();
        Manager manager = this.get(logBean.getAccount());
        if(manager != null){
            if(manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(logBean.getPassword()))) {
                ManagerLogBean managerLogBean = new ManagerLogBean(manager.getManagerId(),manager.getAccount(),manager.getSchoolId());
                session.setAttribute("managerLogBean",managerLogBean);
                session.setMaxInactiveInterval(30*86400);  //把session的时长设为30天
                statusBean.setStatus("登录成功");
            }
            else {
                statusBean.setStatus("密码错误");
            }
        }
        else{
            statusBean.setStatus("无该管理员");
        }
        return statusBean;
    }

    @Transactional
    @Override
    public Manager get(String account) {
        ManagerExample example = new ManagerExample();
        example.or().andAccountEqualTo(account);
        List<Manager> list = managerMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }else {
            return list.get(0);
        }

    }

    @Transactional
    @Override
    public Manager get(Long managerId) {
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(managerId);
        List<Manager> managerList = managerMapper.selectByExample(example);
        if(managerList.isEmpty()){
            return null;
        }
        return managerList.get(0);
    }

    @Transactional
    @Override
    public int update(Manager manager) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        manager.setPassword(MD5Util.getInstance().EncoderByMd5(manager.getPassword()));
        ManagerExample example = new ManagerExample();
        example.or().andManagerIdEqualTo(manager.getManagerId());
        return managerMapper.updateByExampleSelective(manager,example);
    }
}
