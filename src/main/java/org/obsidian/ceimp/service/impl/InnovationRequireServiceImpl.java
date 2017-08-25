package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.InnovationRequireMapper;
import org.obsidian.ceimp.entity.InnovationRequire;
import org.obsidian.ceimp.entity.InnovationRequireExample;
import org.obsidian.ceimp.service.InnovationRequireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
@Service
public class InnovationRequireServiceImpl implements InnovationRequireService {

    @Autowired
    private InnovationRequireMapper innovationRequireMapper;

    @Transactional
    @Override
    public int insertInnovationRequire(String require, int innovationId) {
        InnovationRequire innovationRequire =  new InnovationRequire(require,innovationId);
        return innovationRequireMapper.insertSelective(innovationRequire);
    }

    @Transactional
    @Override
    public int updateInnovationRequire(int requireId, String require, int innovationId) {
        InnovationRequire innovationRequire =  new InnovationRequire(requireId,require,innovationId);
        InnovationRequireExample example = new InnovationRequireExample();
        example.or().andRequireIdEqualTo(requireId);
        return innovationRequireMapper.updateByExample(innovationRequire,example);
    }

    @Transactional
    @Override
    public int deleteInnovationRequire(int requireId) {
        InnovationRequireExample example = new InnovationRequireExample();
        example.or().andRequireIdEqualTo(requireId);
        return innovationRequireMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public InnovationRequire selectByRequireId(int requireId) {
        InnovationRequireExample example = new InnovationRequireExample();
        example.or().andRequireIdEqualTo(requireId);
        List<InnovationRequire> list = innovationRequireMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<InnovationRequire> selectAllByRequire(String require) {
        require = "%" + require + "%";
        InnovationRequireExample example = new InnovationRequireExample();
        example.or().andRequireLike(require);
        List<InnovationRequire> list = innovationRequireMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationRequire> selectAllByInnovationId(int innovationId) {
        InnovationRequireExample example = new InnovationRequireExample();
        example.or().andInnovationIdEqualTo(innovationId);
        List<InnovationRequire> list = innovationRequireMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }

    @Transactional
    @Override
    public List<InnovationRequire> selectAll() {
        InnovationRequireExample example = new InnovationRequireExample();
        List<InnovationRequire> list = innovationRequireMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
