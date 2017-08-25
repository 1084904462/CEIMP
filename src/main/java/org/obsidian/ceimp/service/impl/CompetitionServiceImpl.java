package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionMapper;
import org.obsidian.ceimp.entity.Competition;
import org.obsidian.ceimp.entity.CompetitionExample;
import org.obsidian.ceimp.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionMapper competitionMapper;

    @Transactional
    @Override
    public int insertCompetition(int type, String competitionName, int schoolId, int competitionLevelId, int competitionTypeId, int isGroup) {
        Competition competition = new Competition(type,competitionName,schoolId,competitionLevelId,competitionTypeId,isGroup);
        return competitionMapper.insertSelective(competition);
    }

    @Transactional
    @Override
    public int updateCompetition(int competitionId, int type, String competitionName, int schoolId, int competitionLevelId, int competitionTypeId, int isGroup) {
        Competition competition = new Competition(type,competitionName,schoolId,competitionLevelId,competitionTypeId,isGroup);
        CompetitionExample example = new CompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        return competitionMapper.updateByExample(competition,example);
    }

    @Transactional
    @Override
    public int deleteCompetition(int competitionId) {
        CompetitionExample example = new CompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        return competitionMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Competition selectBuCompetitionId(int competitionId) {
        CompetitionExample example = new CompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        List<Competition> list = competitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Competition> selectAllByType(int type) {
        CompetitionExample example = new CompetitionExample();
        example.or().andTypeEqualTo(type);
        List<Competition> list = competitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Competition> selectAllByTypeAndSchoolId(int type, int schoolId) {
        CompetitionExample example = new CompetitionExample();
        example.or().andTypeEqualTo(type).andSchoolIdEqualTo(schoolId);
        List<Competition> list = competitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Competition> selectAllByTypeAndCompetitionName(int type, String competitionName) {
        competitionName = "%" + competitionName + "%";
        CompetitionExample example = new CompetitionExample();
        example.or().andTypeEqualTo(type).andCompetitionNameLike(competitionName);
        List<Competition> list = competitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Competition> selectAll() {
        CompetitionExample example = new CompetitionExample();
        List<Competition> list = competitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
