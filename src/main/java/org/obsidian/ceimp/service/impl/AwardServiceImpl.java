package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.AwardMapper;
import org.obsidian.ceimp.entity.Award;
import org.obsidian.ceimp.entity.AwardExample;
import org.obsidian.ceimp.service.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    private AwardMapper awardMapper;

    @Transactional
    @Override
    public int insertAward(String userId, int scholarshipId) {
        Award award = new Award(userId,scholarshipId);
        return awardMapper.insertSelective(award);
    }

    @Transactional
    @Override
    public int updateAward(int awardId, String userId, int scholarshipId) {
        Award award = new Award(awardId,userId,scholarshipId);
        AwardExample example = new AwardExample();
        example.or().andAwardIdEqualTo(awardId);
        return awardMapper.updateByExample(award,example);
    }

    @Transactional
    @Override
    public int deleteAward(int awardId) {
        AwardExample example = new AwardExample();
        example.or().andAwardIdEqualTo(awardId);
        return awardMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Award selectByAwardId(int awardId) {
        AwardExample example = new AwardExample();
        example.or().andAwardIdEqualTo(awardId);
        List<Award> list = awardMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Award> selectAllByUserId(String userId) {
        AwardExample example = new AwardExample();
        example.or().andUserIdEqualTo(userId);
        List<Award> list = awardMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Award> selectAllByScholarshipId(int scholarshipId) {
        AwardExample example = new AwardExample();
        example.or().andScholarshipIdEqualTo(scholarshipId);
        List<Award> list = awardMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Award> selectAllByClassId(int classId) {
        List<Award> list = awardMapper.selectAllByClassId(classId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Award> selectAllBySchoolId(int schoolId) {
        List<Award> list = awardMapper.selectAllBySchoolId(schoolId);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Award> selectAll(){
        AwardExample example = new AwardExample();
        List<Award> list = awardMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
