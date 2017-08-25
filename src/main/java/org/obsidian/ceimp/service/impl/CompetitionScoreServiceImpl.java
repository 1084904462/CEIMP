package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionScoreMapper;
import org.obsidian.ceimp.entity.CompetitionScore;
import org.obsidian.ceimp.entity.CompetitionScoreExample;
import org.obsidian.ceimp.service.CompetitionScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
@Service
public class CompetitionScoreServiceImpl implements CompetitionScoreService {

    @Autowired
    private CompetitionScoreMapper competitionScoreMapper;

    @Transactional
    @Override
    public int insertCompetitionScore(int type, int competitionLevelId, int awardLevelId, double score) {
        CompetitionScore competitionScore = new CompetitionScore(type,competitionLevelId,awardLevelId,score);
        return competitionScoreMapper.insertSelective(competitionScore);
    }

    @Transactional
    @Override
    public int updateCompetitionScore(int scoreId, int type, int competitionLevelId, int awardLevelId, double score) {
        CompetitionScore competitionScore = new CompetitionScore(scoreId,type,competitionLevelId,awardLevelId,score);
        CompetitionScoreExample example = new CompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return competitionScoreMapper.updateByExample(competitionScore,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionScore(int scoreId) {
        CompetitionScoreExample example = new CompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return competitionScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionScore selectByScoreId(int scoreId) {
        CompetitionScoreExample example = new CompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        List<CompetitionScore> list = competitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public CompetitionScore selectByTypeAndCompetitionLevelIdAndAwardLevelId(int type, int competitionLevelId, int awardLevelId) {
        CompetitionScoreExample example = new CompetitionScoreExample();
        example.or().andTypeEqualTo(type).andCompetitionLevelIdEqualTo(competitionLevelId).andAwardLevelIdEqualTo(awardLevelId);
        List<CompetitionScore> list = competitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionScore> selectAllByType(int type) {
        CompetitionScoreExample example = new CompetitionScoreExample();
        example.or().andTypeEqualTo(type);
        List<CompetitionScore> list = competitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<CompetitionScore> selectAll() {
        CompetitionScoreExample example = new CompetitionScoreExample();
        List<CompetitionScore> list = competitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
