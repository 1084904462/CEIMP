package org.obsidian.ceimp.service.impl;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.UserBasicMapper;
import org.obsidian.ceimp.entity.School;
import org.obsidian.ceimp.entity.UserBasic;
import org.obsidian.ceimp.entity.UserBasicExample;
import org.obsidian.ceimp.service.*;
import org.obsidian.ceimp.util.MD5Util;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
            insertUserBasicBeanSet.add(new InsertUserBasicBean(bean.getAccount(),MD5Util.getInstance().EncoderByMd5("888666"),bean.getUsername(),bean.getSex(),bean.getEntrance()));

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
    public List<UserSearchBean> searchUser(SearchBean searchBean, Long schoolId, Integer yearScope) {
        String searchKey = searchBean.getSearchKey().replaceAll("\\s+", "");
        List<String> searchKeyList = new ArrayList<>();
        Pattern pattern1 = Pattern.compile("\\D+");
        Matcher matcher1 = pattern1.matcher(searchKey);
        while(matcher1.find()){
            searchKeyList.add("%" + matcher1.group() + "%");
        }
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher2 = pattern2.matcher(searchKey);
        while(matcher2.find()){
            searchKeyList.add("%" + matcher2.group() + "%");
        }
        return userBasicMapper.searchUser(searchKeyList,schoolId,yearScope);
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
}
