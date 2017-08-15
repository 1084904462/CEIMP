package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.TechnologyCompetition;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface TechnologyCompetitionService {

    int insertTechnologyCompetition(String competitionName,int competitionTypeId,int schoolId,String organizer);

    int updateTechnologyCompetition(int competitionId,String competitionName,int competitionTypeId,int schoolId,String organizer);

    int deleteTechnologyCompetition(int competitionId);

    TechnologyCompetition selectByCompetitionId(int competitionId);

    TechnologyCompetition selectByCompetitionName(String competitionName);

    List<TechnologyCompetition> selectAllByCompetitionName(String competitionName);

    List<TechnologyCompetition> selectAllByCompetitionTypeId(int competitionTypeId);

    List<TechnologyCompetition> selectAllBySchoolId(int schoolId);

    List<TechnologyCompetition> selectAllByOrganizer(String organizer);

    List<TechnologyCompetition> selectAll();
}
