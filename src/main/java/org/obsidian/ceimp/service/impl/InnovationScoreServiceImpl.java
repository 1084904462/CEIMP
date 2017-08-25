package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.InnovationScoreMapper;
import org.obsidian.ceimp.entity.InnovationScore;
import org.obsidian.ceimp.entity.InnovationScoreExample;
import org.obsidian.ceimp.service.InnovationScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class InnovationScoreServiceImpl implements InnovationScoreService {

    @Autowired
    private InnovationScoreMapper innovationScoreMapper;

    @Transactional
    @Override
    public int insertInnovationScore(int levelId, int requireId, double score) {
        InnovationScore innovationScore = new InnovationScore(levelId,requireId,score);
        return innovationScoreMapper.insertSelective(innovationScore);
    }

    @Transactional
    @Override
    public int updateInnovationScore(int scoreId, int levelId, int requireId, double score) {
        InnovationScore innovationScore = new InnovationScore(scoreId,levelId,requireId,score);
        InnovationScoreExample example = new InnovationScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return innovationScoreMapper.updateByExample(innovationScore,example);
    }

    @Transactional
    @Override
    public int deleteInnovationScore(int scoreId) {
        InnovationScoreExample example = new InnovationScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        return innovationScoreMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public InnovationScore selectByScoreId(int scoreId) {
        InnovationScoreExample example = new InnovationScoreExample();
        example.or().andScoreIdEqualTo(scoreId);
        List<InnovationScore> list = innovationScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public InnovationScore selectByLevelIdAndRequireId(int levelId, int requireId) {
        InnovationScoreExample example = new InnovationScoreExample();
        example.or().andLevelIdEqualTo(levelId).andRequireIdEqualTo(requireId);
        List<InnovationScore> list = innovationScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<InnovationScore> selectAll() {
        InnovationScoreExample example = new InnovationScoreExample();
        List<InnovationScore> list = innovationScoreMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
