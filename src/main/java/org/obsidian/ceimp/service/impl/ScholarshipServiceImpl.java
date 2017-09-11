package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.bean.ScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipBlockBean;
import org.obsidian.ceimp.bean.ScholarshipDetailBean;
import org.obsidian.ceimp.bean.ScholarshipItemBean;
import org.obsidian.ceimp.dao.ScholarshipMapper;
import org.obsidian.ceimp.entity.*;
import org.obsidian.ceimp.service.ScholarshipBlockService;
import org.obsidian.ceimp.service.ScholarshipItemService;
import org.obsidian.ceimp.service.ScholarshipPercentService;
import org.obsidian.ceimp.service.ScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class ScholarshipServiceImpl implements ScholarshipService {

    @Autowired
    private ScholarshipMapper scholarshipMapper;

    @Autowired
    private ScholarshipPercentService scholarshipPercentService;

    @Autowired
    private ScholarshipBlockService scholarshipBlockService;

    @Autowired
    private ScholarshipItemService scholarshipItemService;

    @Transactional
    @Override
    public int insertScholarship(String scholarshipName, String modelName) {
        Scholarship scholarship = new Scholarship(scholarshipName,modelName);
        return scholarshipMapper.insertSelective(scholarship);
    }

    @Transactional
    @Override
    public int updateScholarship(int scholarshipId, String scholarshipName, String modelName) {
        Scholarship scholarship = new Scholarship(scholarshipId,scholarshipName,modelName);
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        return scholarshipMapper.updateByExample(scholarship,example);
    }

    @Transactional
    @Override
    public int deleteScholarship(int scholarshipId) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        return scholarshipMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Scholarship selectByScholarshipId(int scholarshipId) {
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Scholarship> selectAllByScholarshipName(String scholarshipName) {
        scholarshipName = "%" + scholarshipName + "%";
        ScholarshipExample example = new ScholarshipExample();
        example.or().andScholarshipNameLike(scholarshipName);
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Scholarship> selectAll(){
        ScholarshipExample example = new ScholarshipExample();
        List<Scholarship> list = scholarshipMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipBean> selectAllIdAndName() {
        List<ScholarshipBean> list = scholarshipMapper.selectAllIdAndName();
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public ScholarshipDetailBean selectScholarshipDetail(int scholarshipId) {
        ScholarshipDetailBean scholarshipDetailBean = new ScholarshipDetailBean();
        scholarshipDetailBean.setScholarshipId(scholarshipId);
        Scholarship scholarship = this.selectByScholarshipId(scholarshipId);
        if(scholarship != null){
            scholarshipDetailBean.setScholarshipName(scholarship.getScholarshipName());
        }
        List<String> awardList = new ArrayList<>();
        List<ScholarshipPercent> scholarshipPercentList = scholarshipPercentService.selectAllByScholarshipId(scholarshipId);
        if(scholarshipPercentList != null){
            for(int i=0;i<scholarshipPercentList.size();i++){
                awardList.add(scholarshipPercentList.get(i).getLevel());
            }
            scholarshipDetailBean.setAwardList(awardList);
        }
        List<ScholarshipBlockBean> scholarshipBlockBeans = new ArrayList<>();
        List<ScholarshipBlock> scholarshipBlockList = scholarshipBlockService.selectAllByScholarshipId(scholarshipId);
        if(scholarshipBlockList != null){
            for(ScholarshipBlock block : scholarshipBlockList){
                int blockId = block.getScholarshipBlockId();
                List<ScholarshipItemBean> scholarshipItemBeans = new ArrayList<>();
                List<ScholarshipItem> scholarshipItemList = scholarshipItemService.selectAllByScholarshipBlockId(blockId);
                if(scholarshipItemList != null){
                    for(ScholarshipItem item : scholarshipItemList){
                        ScholarshipItemBean scholarshipItemBean = new ScholarshipItemBean();
                        scholarshipItemBean.setScholarshipItemId(item.getScholarshipItemId());
                        scholarshipItemBean.setScholarshipItemName(item.getScholarshipItemName());
                        scholarshipItemBean.setFillInTypeId(item.getFillInTypeId());
                        scholarshipItemBean.setFillInHint(item.getFillInHint());
                        scholarshipItemBeans.add(scholarshipItemBean);
                    }
                }
                ScholarshipBlockBean scholarshipBlockBean = new ScholarshipBlockBean(blockId,block.getScholarshipBlockName(),scholarshipItemBeans);
                scholarshipBlockBeans.add(scholarshipBlockBean);
            }
            scholarshipDetailBean.setScholarshipBlockBeans(scholarshipBlockBeans);
        }
        return scholarshipDetailBean;
    }
}
