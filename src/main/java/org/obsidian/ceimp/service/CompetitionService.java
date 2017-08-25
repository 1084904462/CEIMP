package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Competition;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
public interface CompetitionService {

    int insertCompetition(int type,String competitionName,int schoolId,int competitionLevelId,int competitionTypeId,int isGroup);

    int updateCompetition(int competitionId,int type,String competitionName,int schoolId,int competitionLevelId,int competitionTypeId,int isGroup);

    int deleteCompetition(int competitionId);

    Competition selectBuCompetitionId(int competitionId);

    List<Competition> selectAllByType(int type);

    List<Competition> selectAllByTypeAndSchoolId(int type,int schoolId);

    List<Competition> selectAllByTypeAndCompetitionName(int type,String competitionName);

    List<Competition> selectAll();

}
