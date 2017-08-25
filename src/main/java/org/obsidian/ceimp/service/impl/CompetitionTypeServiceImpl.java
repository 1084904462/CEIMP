package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.CompetitionTypeMapper;
import org.obsidian.ceimp.entity.CompetitionType;
import org.obsidian.ceimp.entity.CompetitionTypeExample;
import org.obsidian.ceimp.service.CompetitionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
@Service
public class CompetitionTypeServiceImpl implements CompetitionTypeService {

    @Autowired
    private CompetitionTypeMapper competitionTypeMapper;

    @Transactional
    @Override
    public int insertCompetitionType(String type, double percent) {
        CompetitionType competitionType = new CompetitionType(type,percent);
        return competitionTypeMapper.insertSelective(competitionType);
    }

    @Transactional
    @Override
    public int updateCompetitionType(int typeId, String type, double percent) {
        CompetitionType competitionType = new CompetitionType(typeId,type,percent);
        CompetitionTypeExample example = new CompetitionTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        return competitionTypeMapper.updateByExample(competitionType,example);
    }

    @Transactional
    @Override
    public int deleteCompetitionType(int typeId) {
        CompetitionTypeExample example = new CompetitionTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        return competitionTypeMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public CompetitionType selectByTypeId(int typeId) {
        CompetitionTypeExample example = new CompetitionTypeExample();
        example.or().andTypeIdEqualTo(typeId);
        List<CompetitionType> list = competitionTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public CompetitionType selectByType(String type) {
        type = "%" + type + "%";
        CompetitionTypeExample example = new CompetitionTypeExample();
        example.or().andTypeLike(type);
        List<CompetitionType> list = competitionTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Transactional
    @Override
    public List<CompetitionType> selectAll() {
        CompetitionTypeExample example = new CompetitionTypeExample();
        List<CompetitionType> list = competitionTypeMapper.selectByExample(example);
        if(list.isEmpty()){
            return null;
        }
        return list;
    }
}
