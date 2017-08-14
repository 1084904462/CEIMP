package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.TechnologyCompetitionType;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface TechnologyCompetitionTypeService {

    int insertTechnologyCompetitionType(String type);

    int updateTechnologyCompetitionType(int typeId,String type);

    int deleteTechnologyCompetitionType(int typeId);

    TechnologyCompetitionType selectByTypeId(int typeId);

    TechnologyCompetitionType selectByType(String type);

    List<TechnologyCompetitionType> selectAll();
}
