package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.TechnologyCompetitionScoreMapper;
import org.obsidian.ceimp.entity.TechnologyCompetitionScore;
import org.obsidian.ceimp.entity.TechnologyCompetitionScoreExample;
import org.obsidian.ceimp.service.TechnologyCompetitionScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class TechnologyCompetitionScoreServiceImpl implements TechnologyCompetitionScoreService {

    @Autowired
    private TechnologyCompetitionScoreMapper technologyCompetitionScoreMapper;

    @Transactional
    @Override
    public int insertTechnologyCompetitionScore(int competitionLevelId, int awardLevelId, int competitionTypeId, int score) {
        TechnologyCompetitionScore technologyCompetitionScore = new TechnologyCompetitionScore(competitionLevelId,awardLevelId,competitionTypeId,score);
        return technologyCompetitionScoreMapper.insertSelective(technologyCompetitionScore);
    }

    @Transactional
    @Override
    public int updateTechnologyCompetitionScore(int scoreId, int competitionLevelId, int awardLevelId, int competitionTypeId, int score) {
        TechnologyCompetitionScore technologyCompetitionScore = new TechnologyCompetitionScore(scoreId,competitionLevelId,awardLevelId,competitionTypeId,score);
        TechnologyCompetitionScoreExample example = new TechnologyCompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return technologyCompetitionScoreMapper.updateByExample(technologyCompetitionScore,example);
    }

    @Transactional
    @Override
    public int deleteTechnologyCompetitionScore(int scoreId) {
        TechnologyCompetitionScoreExample example = new TechnologyCompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return technologyCompetitionScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public TechnologyCompetitionScore selectByScoreId(int scoreId) {
        TechnologyCompetitionScoreExample example = new TechnologyCompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        List<TechnologyCompetitionScore> list = technologyCompetitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public TechnologyCompetitionScore selectByCompetitionLevelIdAndAwardLevelIdAndCompetitionTypeId(int competitionLevelId, int awardLevelId, int competitionTypeId) {
        TechnologyCompetitionScoreExample example = new TechnologyCompetitionScoreExample();
        example.or().andCompetitionLevelIdEqualTo(competitionLevelId).andAwardLevelIdEqualTo(awardLevelId).andCompetitionTypeIdEqualTo(competitionTypeId);
        List<TechnologyCompetitionScore> list = technologyCompetitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<TechnologyCompetitionScore> selectAll() {
        TechnologyCompetitionScoreExample example = new TechnologyCompetitionScoreExample();
        List<TechnologyCompetitionScore> list = technologyCompetitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
