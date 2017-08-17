package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionType;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface CompetitionTypeService {

    int insertCompetitionType(String type,double percent);

    int updateCompetitionType(int typeId,String type,double percent);

    int deleteCompetitionType(int typeId);

    CompetitionType selectByTypeId(int typeId);

    CompetitionType selectByType(String type);

    List<CompetitionType> selectAll();
}
