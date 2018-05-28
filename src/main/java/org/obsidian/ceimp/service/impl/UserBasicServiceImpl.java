package org.obsidian.ceimp.service.impl;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.UserBasicMapper;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.entity.UserBasicExample;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.MD5Util;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by BillChen on 2017/11/13.
 */
@Service
public class UserBasicServiceImpl implements UserBasicService {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserBasicMapper userBasicMapper;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private MajorService majorService;

    @Autowired
    private ClassNumService classNumService;

    @Autowired
    private UserInfoService userInfoService;

    @Transactional
    @Override
    public int insert(List<ExcelUserBean> excelUserBeanList) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        int result = 0;
        Set<String> schoolSet = new HashSet<>();
        Set<InsertMajorBean> insertMajorBeanSet = new HashSet<>();
        Set<InsertClassNumBean> insertClassNumBeanSet = new HashSet<>();
        Set<InsertUserBasicBean> insertUserBasicBeanSet = new HashSet<>();
        for(ExcelUserBean bean:excelUserBeanList){
            schoolSet.add(bean.getSchoolName());
            insertMajorBeanSet.add(new InsertMajorBean(bean.getSchoolName(),bean.getMajorName(),bean.getGrade()));
            insertClassNumBeanSet.add(new InsertClassNumBean(bean.getSchoolName(),bean.getMajorName(),bean.getGrade(),bean.getClassNum()));
            insertUserBasicBeanSet.add(new InsertUserBasicBean(bean.getAccount(),MD5Util.getInstance().EncoderByMd5("888888"),bean.getUsername(),bean.getSex(),bean.getEntrance()));
        }
        //插入数据库中不存在的学院
        List<String> schoolList = new ArrayList<>(schoolSet);
        List<School> schools = schoolService.getAll();
        for(School school:schools){
            if(schoolList.contains(school.getName())){
                schoolList.remove(school.getName());
            }
        }
        if(!schoolList.isEmpty()){
            schoolService.insertSchoolList(schoolList);
        }

        //插入数据库中不存在的专业及年级
        List<InsertMajorBean> insertMajorBeanList = new ArrayList<>(insertMajorBeanSet);
        List<InsertMajorBean> insertMajorBeans = majorService.getInsertMajorBeanList();
        for(InsertMajorBean bean:insertMajorBeans){
            if(insertMajorBeanList.contains(bean)){
                insertMajorBeanList.remove(bean);
            }
        }
        if(!insertMajorBeanList.isEmpty()){
            majorService.insertMajorList(insertMajorBeanList);
        }

        //插入数据库中不存在的班级号
        List<InsertClassNumBean> insertClassNumBeanList = new ArrayList<>(insertClassNumBeanSet);
        List<InsertClassNumBean> insertClassNumBeans = classNumService.getInsertClassNumBeanList();
        for(InsertClassNumBean bean:insertClassNumBeans){
            if(insertClassNumBeanList.contains(bean)){
                insertClassNumBeanList.remove(bean);
            }
        }
        if(!insertClassNumBeanList.isEmpty()){
            classNumService.insertClassNumList(insertClassNumBeanList);
        }

        //插入数据库中不存在的用户基本信息
        List<InsertUserBasicBean> insertUserBasicBeanList = new ArrayList<>(insertUserBasicBeanSet);
        List<InsertUserBasicBean> insertUserBasicBeans = this.getInsertUserBasicBeanList();
        for(InsertUserBasicBean bean:insertUserBasicBeans){
            if(insertUserBasicBeanList.contains(bean)){
                insertUserBasicBeanList.remove(bean);
            }
        }
        if(!insertUserBasicBeanList.isEmpty()){
            this.insertUserBasicBeanList(insertUserBasicBeanList);
        }

        //插入数据库中不存在的用户动态信息
        int yearScope = TimeUtil.getInstance().getThisYear();
        Set<ExcelUserBean> excelUserBeanSet = new HashSet<>(userInfoService.getExcelUserBeanList(yearScope));
        List<ExcelUserBean> updateExcelUserBeanList = new ArrayList<>();
        for(ExcelUserBean bean:excelUserBeanList){
            if(excelUserBeanSet.contains(bean)){
                updateExcelUserBeanList.add(bean);
            }
        }
        excelUserBeanList.removeAll(updateExcelUserBeanList);
        if(!excelUserBeanList.isEmpty()){
            result = userInfoService.insertExcelUserBeanList(excelUserBeanList,yearScope);
        }
        if(!updateExcelUserBeanList.isEmpty()){
            result = userInfoService.updateExcelUserBeanList(updateExcelUserBeanList,yearScope);
        }
        return result;
    }

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
    public int resetPassword(ResetPasswordBean resetPasswordBean,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return userBasicMapper.resetPassword(resetPasswordBean,password);
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
    public List<InsertUserBasicBean> getInsertUserBasicBeanList() {
        return userBasicMapper.getInsertUserBasicBeanList();
    }

    @Transactional
    @Override
    public int insertUserBasicBeanList(List<InsertUserBasicBean> insertUserBasicBeanList) {
        return userBasicMapper.insertUserBasicBeanList(insertUserBasicBeanList);
    }

    @Transactional
    @Override
    public List<UserSearchBean> getUserSearchBeanList(Long schoolId, String grade, Integer yearScope) {
        return userBasicMapper.getUserSearchBeanList(schoolId,grade,yearScope);
    }

    @Transactional
    @Override
    public StatusBean changeUserPassword(Long userId, PasswordBean passwordBean) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserBasic userBasic = userBasicMapper.selectByPrimaryKey(userId);
        StatusBean statusBean = new StatusBean();
        if(userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(passwordBean.getOldPassword()))){
            if(passwordBean.getNewPassword().length() >= 6){
                if(passwordBean.getNewPassword().length() <= 16){
                    if(passwordBean.getNewPassword().equals(passwordBean.getConfirmPassword())){
                        if(!userBasic.getPassword().equals(MD5Util.getInstance().EncoderByMd5(passwordBean.getNewPassword()))){
                            userBasic.setPassword(MD5Util.getInstance().EncoderByMd5(passwordBean.getNewPassword()));
                            UserBasicExample example = new UserBasicExample();
                            example.or().andUserIdEqualTo(userId);
                            userBasicMapper.updateByExampleSelective(userBasic,example);
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
}
