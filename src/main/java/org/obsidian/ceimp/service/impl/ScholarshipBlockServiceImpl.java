package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ScholarshipBlockMapper;
import org.obsidian.ceimp.entity.ScholarshipBlock;
import org.obsidian.ceimp.entity.ScholarshipBlockExample;
import org.obsidian.ceimp.service.ScholarshipBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class ScholarshipBlockServiceImpl implements ScholarshipBlockService {

    @Autowired
    private ScholarshipBlockMapper scholarshipBlockMapper;

    @Transactional
    @Override
    public int insertScholarshipBlock(String scholarshipBlockName, int scholarshipId) {
        ScholarshipBlock scholarshipBlock = new ScholarshipBlock(scholarshipBlockName,scholarshipId);
        return scholarshipBlockMapper.insertSelective(scholarshipBlock);
    }

    @Transactional
    @Override
    public int updateScholarshipBlock(int scholarshipBlockId, String scholarshipBlockName, int scholarshipId) {
        ScholarshipBlock scholarshipBlock = new ScholarshipBlock(scholarshipBlockId,scholarshipBlockName,scholarshipId);
        ScholarshipBlockExample example = new ScholarshipBlockExample();
        example.or().andScholarshipBlockIdEqualTo(scholarshipBlockId);
        return scholarshipBlockMapper.updateByExample(scholarshipBlock,example);
    }

    @Transactional
    @Override
    public int deleteScholarshipBlock(int scholarshipBlockId) {
        ScholarshipBlockExample example = new ScholarshipBlockExample();
        example.or().andScholarshipBlockIdEqualTo(scholarshipBlockId);
        return scholarshipBlockMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ScholarshipBlock selectByScholarshipBlockId(int scholarshipBlockId) {
        ScholarshipBlockExample example = new ScholarshipBlockExample();
        example.or().andScholarshipBlockIdEqualTo(scholarshipBlockId);
        List<ScholarshipBlock> list = scholarshipBlockMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ScholarshipBlock> selectAllByScholarshipBlockName(String scholarshipBlockName) {
        scholarshipBlockName = "%" + scholarshipBlockName + "%";
        ScholarshipBlockExample example = new ScholarshipBlockExample();
        example.or().andScholarshipBlockNameLike(scholarshipBlockName);
        List<ScholarshipBlock> list = scholarshipBlockMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipBlock> selectAllByScholarshipId(int scholarshipId) {
        ScholarshipBlockExample example = new ScholarshipBlockExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        List<ScholarshipBlock> list = scholarshipBlockMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ScholarshipBlock> selectAll(){
        ScholarshipBlockExample example = new ScholarshipBlockExample();
        List<ScholarshipBlock> list = scholarshipBlockMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
