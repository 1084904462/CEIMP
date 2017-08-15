package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.ArtCompetitionMapper;
import org.obsidian.ceimp.entity.ArtCompetition;
import org.obsidian.ceimp.entity.ArtCompetitionExample;
import org.obsidian.ceimp.service.ArtCompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class ArtCompetitionServiceImpl implements ArtCompetitionService {

    @Autowired
    private ArtCompetitionMapper artCompetitionMapper;

    @Transactional
    @Override
    public int insertArtCompetition(String competitionName) {
        ArtCompetition artCompetition = new ArtCompetition(competitionName);
        return artCompetitionMapper.insertSelective(artCompetition);
    }

    @Transactional
    @Override
    public int updateArtCompetition(int competitionId, String competitionName) {
        ArtCompetition artCompetition = new ArtCompetition(competitionId,competitionName);
        ArtCompetitionExample example = new ArtCompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        return artCompetitionMapper.updateByExample(artCompetition,example);
    }

    @Transactional
    @Override
    public int deleteArtCompetition(int competitionId) {
        ArtCompetitionExample example = new ArtCompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        return artCompetitionMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public ArtCompetition selectByCompetitionId(int competitionId) {
        ArtCompetitionExample example = new ArtCompetitionExample();
        example.or().andCompetitionIdEqualTo(competitionId);
        List<ArtCompetition> list = artCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public ArtCompetition selectByCompetitionName(String competitionName) {
        ArtCompetitionExample example = new ArtCompetitionExample();
        example.or().andCompetitionNameEqualTo(competitionName);
        List<ArtCompetition> list = artCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<ArtCompetition> selectAllByCompetitionName(String competitionName) {
        competitionName = "%" + competitionName + "%";
        ArtCompetitionExample example = new ArtCompetitionExample();
        example.or().andCompetitionNameLike(competitionName);
        List<ArtCompetition> list = artCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<ArtCompetition> selectAll() {
        ArtCompetitionExample example = new ArtCompetitionExample();
        List<ArtCompetition> list = artCompetitionMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
