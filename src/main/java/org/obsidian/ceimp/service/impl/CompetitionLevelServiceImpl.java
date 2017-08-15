package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionLevelMapper;
import org.obsidian.ceimp.entity.CompetitionLevel;
import org.obsidian.ceimp.entity.CompetitionLevelExample;
import org.obsidian.ceimp.service.CompetitionLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class CompetitionLevelServiceImpl implements CompetitionLevelService {

    @Autowired
    private CompetitionLevelMapper competitionLevelMapper;

    @Transactional
    @Override
    public int insertCompetitionLevel(String level) {
        CompetitionLevel competitionLevel = new CompetitionLevel(level);
        return competitionLevelMapper.insertSelective(competitionLevel);
    }

    @Transactional
    @Override
    public int updateCompetitionLevel(int competitionLevelId, String level) {
        CompetitionLevel competitionLevel = new CompetitionLevel(competitionLevelId,level);
        CompetitionLevelExample example = new CompetitionLevelExample();
        example.or().andCompetitionLevelIdEqualTo(competitionLevelId);
        return competitionLevelMapper.updateByExample(competitionLevel,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionLevel(int competitionLevelId) {
        CompetitionLevelExample example = new CompetitionLevelExample();
        example.or().andCompetitionLevelIdEqualTo(competitionLevelId);
        return competitionLevelMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionLevel selectByCompetitionLevelId(int competitionLevelId) {
        CompetitionLevelExample example = new CompetitionLevelExample();
        example.or().andCompetitionLevelIdEqualTo(competitionLevelId);
        List<CompetitionLevel> list = competitionLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public CompetitionLevel selectByLevel(String level) {
        level = "%" + level + "%";
        CompetitionLevelExample example = new CompetitionLevelExample();
        example.or().andLevelLike(level);
        List<CompetitionLevel> list = competitionLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionLevel> selectAll() {
        CompetitionLevelExample example = new CompetitionLevelExample();
        List<CompetitionLevel> list = competitionLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
