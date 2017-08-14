package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.TechnologyCompetitionMapper;
import org.obsidian.ceimp.entity.TechnologyCompetition;
import org.obsidian.ceimp.entity.TechnologyCompetitionExample;
import org.obsidian.ceimp.service.TechnologyCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class TechnologyCompetitionServiceImpl implements TechnologyCompetitionService {

    @Autowired
    private TechnologyCompetitionMapper technologyCompetitionMapper;

    @Transactional
    @Override
    public int insertTechnologyCompetition(String competitionName, int competitionTypeId, int schoolId, String organizer) {
        TechnologyCompetition technologyCompetition = new TechnologyCompetition(competitionName,competitionTypeId,schoolId,organizer);
        return technologyCompetitionMapper.insertSelective(technologyCompetition);
    }

    @Transactional
    @Override
    public int updateTechnologyCompetition(int competitionId, String competitionName, int competitionTypeId, int schoolId, String organizer) {
        TechnologyCompetition technologyCompetition = new TechnologyCompetition(competitionId,competitionName,competitionTypeId,schoolId,organizer);
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        return technologyCompetitionMapper.updateByExample(technologyCompetition,example);
    }

    @Transactional
    @Override
    public int deleteTechnologyCompetition(int competitionId) {
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        return technologyCompetitionMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public TechnologyCompetition selectByCompetitionId(int competitionId) {
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public TechnologyCompetition selectByCompetitionName(String competitionName) {
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andCompetitionNameEqualTo(competitionName);
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<TechnologyCompetition> selectAllByCompetitionName(String competitionName) {
        competitionName = "%" + competitionName + "%";
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andCompetitionNameLike(competitionName);
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TechnologyCompetition> selectAllByCompetitionTypeId(int competitionTypeId) {
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andCompetitionTypeIdEqualTo(competitionTypeId);
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TechnologyCompetition> selectAllBySchoolId(int schoolId) {
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TechnologyCompetition> selectAllByOrganizer(String organizer) {
        organizer = "%" + organizer + "%";
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        example.or().andOrganizerLike(organizer);
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<TechnologyCompetition> selectAll() {
        TechnologyCompetitionExample example = new TechnologyCompetitionExample();
        List<TechnologyCompetition> list = technologyCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
