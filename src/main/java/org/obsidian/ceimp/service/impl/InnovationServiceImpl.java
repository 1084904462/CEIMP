package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.InnovationMapper;
import org.obsidian.ceimp.entity.Innovation;
import org.obsidian.ceimp.entity.InnovationExample;
import org.obsidian.ceimp.service.InnovationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class InnovationServiceImpl implements InnovationService {

    @Autowired
    private InnovationMapper innovationMapper;

    @Transactional
    @Override
    public int insertInnovation(String content, int type) {
        Innovation innovation = new Innovation(content,type);
        return innovationMapper.insertSelective(innovation);
    }

    @Transactional
    @Override
    public int updateInnovation(int innovationId, String content, int type) {
        Innovation innovation = new Innovation(innovationId,content,type);
        InnovationExample example = new InnovationExample();
        example.or().andInnovationIdEqualTo(innovationId);
        return innovationMapper.updateByExample(innovation,example);
    }

    @Transactional
    @Override
    public int deleteInnovation(int innovationId) {
        InnovationExample example = new InnovationExample();
        example.or().andInnovationIdEqualTo(innovationId);
        return innovationMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public Innovation selectByInnovationId(int innovationId) {
        InnovationExample example = new InnovationExample();
        example.or().andInnovationIdEqualTo(innovationId);
        List<Innovation> list = innovationMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<Innovation> selectAllByType(int type) {
        InnovationExample example = new InnovationExample();
        example.or().andTypeEqualTo(type);
        List<Innovation> list = innovationMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<Innovation> selectAll() {
        InnovationExample example = new InnovationExample();
        List<Innovation> list = innovationMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
