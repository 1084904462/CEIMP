package org.obsidian.ceimp.service.impl;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.ManagerMapper;
import org.obsidian.ceimp.entity.Manager;
import org.obsidian.ceimp.entity.ManagerExample;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.service.ManagerService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.MD5Util;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private UserBasicService userBasicService;

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

    @Transactional
    @Override
    public StatusBean resetPassword(UserAccountBean userAccountBean,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserBasic userBasic = new UserBasic();
        userBasic.setAccount(userAccountBean.getAccount());
        userBasic.setPassword(password);
        return userBasicService.updateUserBasic(userBasic) == 0?new StatusBean("重置密码失败"):new StatusBean("重置密码成功");
    }

    @Transactional
    @Override
    public StatusBean changePassword(Long managerId, PasswordBean passwordBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Manager manager = this.get(managerId);
        StatusBean statusBean = new StatusBean();
        if(manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(passwordBean.getOldPassword()))){
            if(passwordBean.getNewPassword().length() >= 6){
                if(passwordBean.getNewPassword().length() <= 16){
                    if(passwordBean.getNewPassword().equals(passwordBean.getConfirmPassword())){
                        if(!manager.getPassword().equals(MD5Util.getInstance().EncoderByMd5(passwordBean.getNewPassword()))){
                            manager.setPassword(passwordBean.getNewPassword());
                            this.update(manager);
                            statusBean.setStatus("修改成功");
                        }
                        else{
                            statusBean.setStatus("新密码与原密码相同");
                        }
                    }
                    else {
                        statusBean.setStatus("两次密码输入不同");
                    }
                }
                else{
                    statusBean.setStatus("新密码不能大于16位");
                }
            }
            else{
                statusBean.setStatus("新密码不能小于6位");
            }
        }
        else{
            statusBean.setStatus("原密码不一致");
        }
        return statusBean;
    }

    @Transactional
    @Override
    public StatusBean insert(InsertManagerBean insertManagerBean) {
        StatusBean statusBean = new StatusBean();
        if(this.get(insertManagerBean.getAccount()) == null){
            if(insertManagerBean.getPassword().length() >= 6){
                if(insertManagerBean.getPassword().length() <= 16){
                    if(insertManagerBean.getPassword().equals(insertManagerBean.getConfirmPassword())){
                        Manager manager = new Manager();
                        BeanUtils.copyProperties(insertManagerBean,manager);
                        managerMapper.insertSelective(manager);
                        statusBean.setStatus("新增管理员成功");
                    }
                    else {
                        statusBean.setStatus("两次密码输入不同");
                    }
                }
                else{
                    statusBean.setStatus("密码不能大于16位");
                }
            }
            else{
                statusBean.setStatus("密码不能小于6位");
            }
        }
        else{
            statusBean.setStatus("已存在该管理员");
        }
        return statusBean;
    }
}
