package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ExcelScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;
import org.obsidian.ceimp.bean.UserAccountBean;
import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.service.AwardService;
import org.obsidian.ceimp.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * Created by BillChen on 2017/11/14.
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardMapper awardMapper;

    @Transactional
    @Override
    public int insert(List<ExcelScholarshipBean> excelScholarshipBeanList) {
        int result = 0;
        int yearScope = TimeUtil.getInstance().getThisYear();
        List<ExcelScholarshipBean> excelScholarshipBeans = this.getExcelScholarshipBeanList(yearScope);
        Set<ExcelScholarshipBean> excelScholarshipBeanSet = new HashSet<>(excelScholarshipBeans);
        ListIterator<ExcelScholarshipBean> iterator = excelScholarshipBeanList.listIterator();
        while(iterator.hasNext()){
            if(excelScholarshipBeanSet.contains(iterator.next())){
                iterator.remove();
            }
        }
        if(!excelScholarshipBeanList.isEmpty()){
            result = this.insertExcelScholarshipBeanList(excelScholarshipBeanList,yearScope);
        }
        return result;
    }

    @Transactional
    @Override
    public int insertExcelScholarshipBeanList(List<ExcelScholarshipBean> excelScholarshipBeanList, Integer yearScope) {
        return awardMapper.insertExcelScholarshipBeanList(excelScholarshipBeanList,yearScope);
    }

    @Transactional
    @Override
    public List<ExcelScholarshipBean> getExcelScholarshipBeanList(Integer yearScope) {
        return awardMapper.getExcelScholarshipBeanList(yearScope);
    }

    @Transactional
    @Override
    public List<AwardBean> getList(Long userId, Integer yearScope) {
        return awardMapper.getList(userId,yearScope);
    }

    @Transactional
    @Override
    public List<ScholarshipFormBean> getAll(String subName, Integer yearScope,String grade) {
        return awardMapper.getAll(subName,yearScope,grade);
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
