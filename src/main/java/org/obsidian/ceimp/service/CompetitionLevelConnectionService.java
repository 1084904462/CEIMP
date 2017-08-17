package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionLevelConnection;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface CompetitionLevelConnectionService {

    int insertCompetitionLevelConnection(int competitionId,int competitionLevelId);

    int updateCompetitionLevelConnection(int connectionId,int competitionId,int competitionLevelId);

    int deleteCompetitionLevelConnection(int connectionId);

    CompetitionLevelConnection selectByConnectionId(int connectionId);

    List<CompetitionLevelConnection> selectAllByCompetitionId(int competitionId);

    List<CompetitionLevelConnection> selectAllByCompetitionLevelId(int competitionLevelId);

    List<CompetitionLevelConnection> selectAll();
}
