package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionTypeConnectionMapper;
import org.obsidian.ceimp.entity.CompetitionTypeConnection;
import org.obsidian.ceimp.entity.CompetitionTypeConnectionExample;
import org.obsidian.ceimp.service.CompetitionTypeConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
@Service
public class CompetitionTypeConnectionServiceImpl implements CompetitionTypeConnectionService {

    @Autowired
    private CompetitionTypeConnectionMapper competitionTypeConnectionMapper;

    @Transactional
    @Override
    public int insertCompetitionTypeConnection(int competitionId, int competitionTypeId, int schoolId) {
        CompetitionTypeConnection competitionTypeConnection = new CompetitionTypeConnection(competitionId,competitionTypeId,schoolId);
        return competitionTypeConnectionMapper.insertSelective(competitionTypeConnection);
    }

    @Transactional
    @Override
    public int updateCompetitionTypeConnection(int connectionId, int competitionId, int competitionTypeId, int schoolId) {
        CompetitionTypeConnection competitionTypeConnection = new CompetitionTypeConnection(connectionId,competitionId,competitionTypeId,schoolId);
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        example.or().andConnectionIdEqualTo(connectionId);
        return competitionTypeConnectionMapper.updateByExample(competitionTypeConnection,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionTypeConnection(int connectionId) {
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        example.or().andConnectionIdEqualTo(connectionId);
        return competitionTypeConnectionMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionTypeConnection selectByConnectionId(int connectionId) {
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        example.or().andConnectionIdEqualTo(connectionId);
        List<CompetitionTypeConnection> list = competitionTypeConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionTypeConnection> selectAllByCompetitionId(int competitionId) {
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        List<CompetitionTypeConnection> list = competitionTypeConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionTypeConnection> selectAllByCompetitionTypeId(int competitionTypeId) {
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        example.or().andCompetitionTypeIdEqualTo(competitionTypeId);
        List<CompetitionTypeConnection> list = competitionTypeConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionTypeConnection> selectAllBySchoolId(int schoolId) {
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<CompetitionTypeConnection> list = competitionTypeConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionTypeConnection> selectAll() {
        CompetitionTypeConnectionExample example = new CompetitionTypeConnectionExample();
        List<CompetitionTypeConnection> list = competitionTypeConnectionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
