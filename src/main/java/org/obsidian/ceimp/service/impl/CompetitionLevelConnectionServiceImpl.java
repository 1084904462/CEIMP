package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionLevelConnectionMapper;
import org.obsidian.ceimp.entity.CompetitionLevelConnection;
import org.obsidian.ceimp.entity.CompetitionLevelConnectionExample;
import org.obsidian.ceimp.service.CompetitionLevelConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
@Service
public class CompetitionLevelConnectionServiceImpl implements CompetitionLevelConnectionService {

    @Autowired
    private CompetitionLevelConnectionMapper competitionLevelConnectionMapper;

    @Transactional
    @Override
    public int insertCompetitionLevelConnection(int competitionId, int levelId, int competitionType) {
        CompetitionLevelConnection competitionLevelConnection = new CompetitionLevelConnection(competitionId,levelId,competitionType);
        return competitionLevelConnectionMapper.insertSelective(competitionLevelConnection);
    }

    @Transactional
    @Override
    public int updateCompetitionLevelConnection(int connectionId, int competitionId, int levelId, int competitionType) {
        CompetitionLevelConnection competitionLevelConnection = new CompetitionLevelConnection(connectionId,competitionId,levelId,competitionType);
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        example.or().andConnectionIdEqualTo(connectionId);
        return competitionLevelConnectionMapper.updateByExample(competitionLevelConnection,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionLevelConnection(int connectionId) {
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        example.or().andConnectionIdEqualTo(connectionId);
        return competitionLevelConnectionMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionLevelConnection selectByConnectionId(int connectionId) {
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        example.or().andConnectionIdEqualTo(connectionId);
        List<CompetitionLevelConnection> list = competitionLevelConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionLevelConnection> selectAllByConnectionIdAndCompetitionType(int competitionId, int competitionType) {
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        example.or().andCompetitionIdEqualTo(competitionId).andCompetitionTypeEqualTo(competitionType);
        List<CompetitionLevelConnection> list = competitionLevelConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionLevelConnection> selectAllByLevelIdAndCompetitionType(int levelId, int competitionType) {
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        example.or().andLevelIdEqualTo(levelId).andCompetitionTypeEqualTo(competitionType);
        List<CompetitionLevelConnection> list = competitionLevelConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionLevelConnection> selectAllByCompetitionType(int competitionType) {
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        example.or().andCompetitionTypeEqualTo(competitionType);
        List<CompetitionLevelConnection> list = competitionLevelConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionLevelConnection> selectAll() {
        CompetitionLevelConnectionExample example = new CompetitionLevelConnectionExample();
        List<CompetitionLevelConnection> list = competitionLevelConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
