package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ArtCompetitionScoreMapper;
import org.obsidian.ceimp.entity.ArtCompetitionScore;
import org.obsidian.ceimp.entity.ArtCompetitionScoreExample;
import org.obsidian.ceimp.service.ArtCompetitionScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
@Service
public class ArtCompetitionScoreServiceImpl implements ArtCompetitionScoreService {

    @Autowired
    private ArtCompetitionScoreMapper artCompetitionScoreMapper;

    @Transactional
    @Override
    public int insertArtCompetitionScore(int competitionLevelId, int awardLevelId, int score) {
        ArtCompetitionScore artCompetitionScore = new ArtCompetitionScore(competitionLevelId,awardLevelId,score);
        return artCompetitionScoreMapper.insertSelective(artCompetitionScore);
    }

    @Transactional
    @Override
    public int updateArtCompetitionScore(int scoreId, int competitionLevelId, int awardLevelId, int score) {
        ArtCompetitionScore artCompetitionScore = new ArtCompetitionScore(scoreId,competitionLevelId,awardLevelId,score);
        ArtCompetitionScoreExample example = new ArtCompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return artCompetitionScoreMapper.updateByExample(artCompetitionScore,example);
    }

    @Transactional
    @Override
    public int deleteArtCompetitionScore(int scoreId) {
        ArtCompetitionScoreExample example = new ArtCompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return artCompetitionScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ArtCompetitionScore selectByScoreId(int scoreId) {
        ArtCompetitionScoreExample example = new ArtCompetitionScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        List<ArtCompetitionScore> list = artCompetitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public ArtCompetitionScore selectByCompetitionLevelIdAndAwardLevelId(int competitionLevelId, int awardLevelId) {
        ArtCompetitionScoreExample example = new ArtCompetitionScoreExample();
        example.or().andCompetitionLevelIdEqualTo(competitionLevelId).andAwardLevelIdEqualTo(awardLevelId);
        List<ArtCompetitionScore> list = artCompetitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ArtCompetitionScore> selectAll() {
        ArtCompetitionScoreExample example = new ArtCompetitionScoreExample();
        List<ArtCompetitionScore> list = artCompetitionScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
