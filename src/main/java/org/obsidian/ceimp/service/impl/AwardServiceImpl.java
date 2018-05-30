package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.*;
import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.entity.Scholarship;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.service.ScholarshipService;
import org.obsidian.ceimp.service.UserBasicService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by BillChen on 2017/11/14.
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardMapper awardMapper;

    @Autowired
    private ScholarshipService scholarshipService;

    @Autowired
    private UserBasicService userBasicService;

    @Transactional
    @Override
    public StatusBean insert(Long schoolId,List<ExcelScholarshipBean> excelScholarshipBeanList) {
        int yearScope = TimeUtil.getInstance().getThisYear();
        Set<String> accountSet = new HashSet<>(userBasicService.getAccountList(schoolId,yearScope));
        for(ExcelScholarshipBean bean:excelScholarshipBeanList){
            if(!accountSet.contains(bean.getAccount())){
                return new StatusBean("上传名单中包含非本学院的学生");
            }
        }
        int result = 0;
        //添加奖学金缩写
        List<Scholarship> scholarshipList = scholarshipService.getList();
        for(ExcelScholarshipBean bean:excelScholarshipBeanList){
            for(Scholarship scholarship:scholarshipList){
                if(bean.getScholarship().equals(scholarship.getName())){
                    bean.setSubName(scholarship.getSubName());
                    break;
                }
            }
        }
        //用于只保存第一个校奖学金
        Set<String> ssSet = new HashSet<>();
        //除去数据库中用户已有的奖学金
        Set<ExcelScholarshipBean> excelScholarshipBeanSet = new HashSet<>(awardMapper.getExcelScholarshipBeanList(yearScope));
        ListIterator<ExcelScholarshipBean> iterator = excelScholarshipBeanList.listIterator();
        while(iterator.hasNext()){
            ExcelScholarshipBean bean = iterator.next();
            if(excelScholarshipBeanSet.contains(bean)){
                if(bean.getSubName().equals("ss")){
                    ssSet.add(bean.getAccount());
                }
                iterator.remove();
            }
            else if(bean.getSubName().equals("ss")){
                if(!ssSet.contains(bean.getAccount())){
                    ssSet.add(bean.getAccount());
                }
                else{
                    iterator.remove();
                }
            }
        }
        if(!excelScholarshipBeanList.isEmpty()){
            result = this.insertExcelScholarshipBeanList(excelScholarshipBeanList,yearScope);
        }
        return result==0 ? new StatusBean("无记录更新"):new StatusBean("成功上传" + result + "条记录");
    }

    @Transactional
    @Override
    public int insertExcelScholarshipBeanList(List<ExcelScholarshipBean> excelScholarshipBeanList, Integer yearScope) {
        return awardMapper.insertExcelScholarshipBeanList(excelScholarshipBeanList,yearScope);
    }

    @Transactional
    @Override
    public List<AwardBean> getList(Long userId, Integer yearScope) {
        return awardMapper.getList(userId,yearScope);
    }

    @Transactional
    @Override
    public List<ScholarshipFormBean> getAll(Long schoolId,String subName, Integer yearScope,String grade) {
        return awardMapper.getAll(schoolId,subName,yearScope,grade);
    }

    @Transactional
    @Override
    public Boolean exist(Long userId,String subName, Integer yearScope) {
        return awardMapper.exist(userId,subName,yearScope);
    }

    @Transactional
    @Override
    public int updateIsFilled(Long userId, Integer yearScope,String subName) {
        return awardMapper.updateIsFilled(userId,yearScope,subName);
    }

    @Transactional
    @Override
    public int cancelIsFilled(String subName, List<UserAccountBean> userAccountBeanList, Integer yearScope) {
        return awardMapper.cancelIsFilled(subName,userAccountBeanList,yearScope);
    }
}
