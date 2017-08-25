package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ScholarshipItemMapper;
import org.obsidian.ceimp.entity.ScholarshipItem;
import org.obsidian.ceimp.entity.ScholarshipItemExample;
import org.obsidian.ceimp.service.ScholarshipItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class ScholarshipItemServiceImpl implements ScholarshipItemService {

    @Autowired
    private ScholarshipItemMapper scholarshipItemMapper;

    @Transactional
    @Override
    public int insertScholarshipItem(String scholarshipItemName, int scholarshipBlockId, int fillInTypeId, String fillInHint) {
        ScholarshipItem scholarshipItem = new ScholarshipItem(scholarshipItemName,scholarshipBlockId,fillInTypeId,fillInHint);
        return scholarshipItemMapper.insertSelective(scholarshipItem);
    }

    @Transactional
    @Override
    public int updateScholarshipItem(int scholarshipItemId, String scholarshipItemName, int scholarshipBlockId, int fillInTypeId, String fillInHint) {
        ScholarshipItem scholarshipItem = new ScholarshipItem(scholarshipItemId,scholarshipItemName,scholarshipBlockId,fillInTypeId,fillInHint);
        ScholarshipItemExample example = new ScholarshipItemExample();
        example.or().andScholarshipItemIdEqualTo(scholarshipItemId);
        return scholarshipItemMapper.updateByExample(scholarshipItem,example);
    }

    @Transactional
    @Override
    public int deleteScholarshipItem(int scholarshipItemId) {
        ScholarshipItemExample example = new ScholarshipItemExample();
        example.or().andScholarshipItemIdEqualTo(scholarshipItemId);
        return scholarshipItemMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ScholarshipItem selectByScholarshipItemId(int scholarshipItemId) {
        ScholarshipItemExample example = new ScholarshipItemExample();
        example.or().andScholarshipItemIdEqualTo(scholarshipItemId);
        List<ScholarshipItem> list = scholarshipItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ScholarshipItem> selectAllByScholarshipItemName(String scholarshipItemName) {
        scholarshipItemName = "%" + scholarshipItemName + "%";
        ScholarshipItemExample example = new ScholarshipItemExample();
        example.or().andScholarshipItemNameLike(scholarshipItemName);
        List<ScholarshipItem> list = scholarshipItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipItem> selectAllByScholarshipBlockId(int scholarshipBlockId) {
        ScholarshipItemExample example = new ScholarshipItemExample();
        example.or().andScholarshipBlockIdEqualTo(scholarshipBlockId);
        List<ScholarshipItem> list = scholarshipItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipItem> selectAllByFillInTypeId(int fillInTypeId) {
        ScholarshipItemExample example = new ScholarshipItemExample();
        example.or().andFillInTypeIdEqualTo(fillInTypeId);
        List<ScholarshipItem> list = scholarshipItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipItem> selectAllByScholarshipId(int scholarshipId) {
        List<ScholarshipItem> list = scholarshipItemMapper.selectAllByScholarshipId(scholarshipId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipItem> selectAll(){
        ScholarshipItemExample example = new ScholarshipItemExample();
        List<ScholarshipItem> list = scholarshipItemMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
