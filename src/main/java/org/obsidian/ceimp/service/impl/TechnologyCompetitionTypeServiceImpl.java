package org.obsidian.ceimp.service.impl;

import org.obsidian.ceimp.dao.TechnologyCompetitionTypeMapper;
import org.obsidian.ceimp.entity.TechnologyCompetitionType;
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
        return 0;
    }

    @Transactional
    @Override
    public int updateTechnologyCompetitionType(int typeId, String type) {
        return 0;
    }

    @Transactional
    @Override
    public int deleteTechnologyCompetitionType(int typeId) {
        return 0;
    }

    @Transactional
    @Override
    public TechnologyCompetitionType selectByTypeId(int typeId) {
        return null;
    }

    @Transactional
    @Override
    public TechnologyCompetitionType selectByType(String type) {
        return null;
    }

    @Transactional
    @Override
    public List<TechnologyCompetitionType> selectAll() {
        return null;
    }
}
