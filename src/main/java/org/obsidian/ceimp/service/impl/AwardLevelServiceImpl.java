package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.AwardLevelMapper;
import org.obsidian.ceimp.entity.AwardLevel;
import org.obsidian.ceimp.entity.AwardLevelExample;
import org.obsidian.ceimp.service.AwardLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class AwardLevelServiceImpl implements AwardLevelService {

    @Autowired
    private AwardLevelMapper awardLevelMapper;

    @Transactional
    @Override
    public int insertAwardLevel(String level) {
        AwardLevel awardLevel = new AwardLevel(level);
        return awardLevelMapper.insertSelective(awardLevel);
    }

    @Transactional
    @Override
    public int updateAwardLevel(int awardLevelId, String level) {
        AwardLevel awardLevel = new AwardLevel(awardLevelId,level);
        AwardLevelExample example = new AwardLevelExample();
        example.or().andAwardLevelIdEqualTo(awardLevelId);
        return awardLevelMapper.updateByExample(awardLevel,example);
    }

    @Transactional
    @Override
    public int deleteAwardLevel(int awardLevelId) {
        AwardLevelExample example = new AwardLevelExample();
        example.or().andAwardLevelIdEqualTo(awardLevelId);
        return awardLevelMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public AwardLevel selectByAwardLevelId(int awardLevelId) {
        AwardLevelExample example = new AwardLevelExample();
        example.or().andAwardLevelIdEqualTo(awardLevelId);
        List<AwardLevel> list = awardLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public AwardLevel selectByLevel(String level) {
        level = "%" + level + "%";
        AwardLevelExample example = new AwardLevelExample();
        example.or().andLevelLike(level);
        List<AwardLevel> list = awardLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<AwardLevel> selectAll() {
        AwardLevelExample example = new AwardLevelExample();
        List<AwardLevel> list = awardLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
