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
    public int insertCompetition(String competitionName, String organizer) {
        Competition competition = new Competition(competitionName,organizer);
        return competitionMapper.insertSelective(competition);
    }

    @Transactional
    @Override
    public int updateCompetition(int competitionId, String competitionName, String organizer) {
        Competition competition = new Competition(competitionId,competitionName,organizer);
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
    public List<Competition> selectAllByCompetitionName(String competitionName) {
        competitionName = "%" + competitionName + "%";
        CompetitionExample example = new CompetitionExample();
        example.or().andCompetitionNameLike(competitionName);
        List<Competition> list = competitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Competition> selectAllByOrganizer(String organizer) {
        organizer = "%" + organizer + "%";
        CompetitionExample example = new CompetitionExample();
        example.or().andOrganizerLike(organizer);
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
