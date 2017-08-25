package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionGroupMapper;
import org.obsidian.ceimp.entity.CompetitionGroup;
import org.obsidian.ceimp.entity.CompetitionGroupExample;
import org.obsidian.ceimp.service.CompetitionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class CompetitionGroupServiceImpl implements CompetitionGroupService {

    @Autowired
    private CompetitionGroupMapper competitionGroupMapper;

    @Transactional
    @Override
    public int insertCompetitionGroup(String rank, double percent, int schoolId) {
        CompetitionGroup competitionGroup = new CompetitionGroup(rank,percent,schoolId);
        return competitionGroupMapper.insertSelective(competitionGroup);
    }

    @Transactional
    @Override
    public int updateCompetitionGroup(int rankId, String rank, double percent, int schoolId) {
        CompetitionGroup competitionGroup = new CompetitionGroup(rank,percent,schoolId);
        CompetitionGroupExample example = new CompetitionGroupExample();
        example.or().andRankIdEqualTo(rankId);
        return competitionGroupMapper.updateByExample(competitionGroup,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionGroup(int rankId) {
        CompetitionGroupExample example = new CompetitionGroupExample();
        example.or().andRankIdEqualTo(rankId);
        return competitionGroupMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionGroup selectByRankId(int rankId) {
        CompetitionGroupExample example = new CompetitionGroupExample();
        example.or().andRankIdEqualTo(rankId);
        List<CompetitionGroup> list = competitionGroupMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public CompetitionGroup selectByRank(String rank) {
        rank = "%" + rank + "%";
        CompetitionGroupExample example = new CompetitionGroupExample();
        example.or().andRankLike(rank);
        List<CompetitionGroup> list = competitionGroupMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionGroup> selectAllBySchoolId(int schoolId) {
        CompetitionGroupExample example = new CompetitionGroupExample();
        example.or().andSchoolIdEqualTo(schoolId);
        List<CompetitionGroup> list = competitionGroupMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionGroup> selectAll() {
        CompetitionGroupExample example = new CompetitionGroupExample();
        List<CompetitionGroup> list = competitionGroupMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
