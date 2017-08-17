package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionTypeConnection;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
public interface CompetitionTypeConnectionService {

    int insertCompetitionTypeConnection(int competitionId,int competitionTypeId,int schoolId);

    int updateCompetitionTypeConnection(int connectionId,int competitionId,int competitionTypeId,int schoolId);

    int deleteCompetitionTypeConnection(int connectionId);

    CompetitionTypeConnection selectByConnectionId(int connectionId);

    List<CompetitionTypeConnection> selectAllByCompetitionId(int competitionId);

    List<CompetitionTypeConnection> selectAllByCompetitionTypeId(int competitionTypeId);

    List<CompetitionTypeConnection> selectAllBySchoolId(int schoolId);

    List<CompetitionTypeConnection> selectAll();
}
