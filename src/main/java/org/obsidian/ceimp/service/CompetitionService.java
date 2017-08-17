package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Competition;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
public interface CompetitionService {

    int insertCompetition(String competitionName,String organizer);

    int updateCompetition(int competitionId,String competitionName,String organizer);

    int deleteCompetition(int competitionId);

    Competition selectBuCompetitionId(int competitionId);

    List<Competition> selectAllByCompetitionName(String competitionName);

    List<Competition> selectAllByOrganizer(String organizer);

    List<Competition> selectAll();

}
