package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.InnovationLevelMapper;
import org.obsidian.ceimp.entity.InnovationLevel;
import org.obsidian.ceimp.entity.InnovationLevelExample;
import org.obsidian.ceimp.service.InnovationLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class InnovationLevelServiceImpl implements InnovationLevelService {

    @Autowired
    private InnovationLevelMapper innovationLevelMapper;

    @Transactional
    @Override
    public int insertInnovationLevel(String level, int innovationId) {
        InnovationLevel innovationLevel = new InnovationLevel(level,innovationId);
        return innovationLevelMapper.insertSelective(innovationLevel);
    }

    @Transactional
    @Override
    public int updateInnovationLevel(int levelId, String level, int innovationId) {
        InnovationLevel innovationLevel = new InnovationLevel(levelId,level,innovationId);
        InnovationLevelExample example = new InnovationLevelExample();
        example.or().andLevelIdEqualTo(levelId);
        return innovationLevelMapper.updateByExample(innovationLevel,example);
    }

    @Transactional
    @Override
    public int deleteInnovationLevel(int levelId) {
        InnovationLevelExample example = new InnovationLevelExample();
        example.or().andLevelIdEqualTo(levelId);
        return innovationLevelMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public InnovationLevel selectByLevelId(int levelId) {
        InnovationLevelExample example = new InnovationLevelExample();
        example.or().andLevelIdEqualTo(levelId);
        List<InnovationLevel> list = innovationLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<InnovationLevel> selectAllByLevel(String level) {
        level = "%" + level + "%";
        InnovationLevelExample example = new InnovationLevelExample();
        example.or().andLevelLike(level);
        List<InnovationLevel> list = innovationLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationLevel> selectAllByInnovationId(int innovationId) {
        InnovationLevelExample example = new InnovationLevelExample();
        example.or().andInnovationIdEqualTo(innovationId);
        List<InnovationLevel> list = innovationLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationLevel> selectAll() {
        InnovationLevelExample example = new InnovationLevelExample();
        List<InnovationLevel> list = innovationLevelMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
