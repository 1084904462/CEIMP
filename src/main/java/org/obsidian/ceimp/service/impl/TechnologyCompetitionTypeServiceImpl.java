package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.TechnologyCompetitionTypeMapper;
import org.obsidian.ceimp.entity.TechnologyCompetitionType;
import org.obsidian.ceimp.entity.TechnologyCompetitionTypeExample;
import org.obsidian.ceimp.service.TechnologyCompetitionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class TechnologyCompetitionTypeServiceImpl implements TechnologyCompetitionTypeService {

    @Autowired
    private TechnologyCompetitionTypeMapper technologyCompetitionTypeMapper;

    @Transactional
    @Override
    public int insertTechnologyCompetitionType(String type) {
        TechnologyCompetitionType technologyCompetitionType = new TechnologyCompetitionType(type);
        return technologyCompetitionTypeMapper.insertSelective(technologyCompetitionType);
    }

    @Transactional
    @Override
    public int updateTechnologyCompetitionType(int typeId, String type) {
        TechnologyCompetitionType technologyCompetitionType = new TechnologyCompetitionType(typeId,type);
        TechnologyCompetitionTypeExample example = new TechnologyCompetitionTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        return technologyCompetitionTypeMapper.updateByExample(technologyCompetitionType,example);
    }

    @Transactional
    @Override
    public int deleteTechnologyCompetitionType(int typeId) {
        TechnologyCompetitionTypeExample example = new TechnologyCompetitionTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        return technologyCompetitionTypeMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public TechnologyCompetitionType selectByTypeId(int typeId) {
        TechnologyCompetitionTypeExample example = new TechnologyCompetitionTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        List<TechnologyCompetitionType> list = technologyCompetitionTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public TechnologyCompetitionType selectByType(String type) {
        TechnologyCompetitionTypeExample example = new TechnologyCompetitionTypeExample();
        example.or().andTypeEqualTo(type);
        List<TechnologyCompetitionType> list = technologyCompetitionTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<TechnologyCompetitionType> selectAll() {
        TechnologyCompetitionTypeExample example = new TechnologyCompetitionTypeExample();
        List<TechnologyCompetitionType> list = technologyCompetitionTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
