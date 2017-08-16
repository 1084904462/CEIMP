package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionLevelConnection;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface CompetitionLevelConnectionService {

    int insertCompetitionLevelConnection(int competitionId,int levelId,int competitionType);

    int updateCompetitionLevelConnection(int connectionId,int competitionId,int levelId,int competitionType);

    int deleteCompetitionLevelConnection(int connectionId);

    CompetitionLevelConnection selectByConnectionId(int connectionId);

    List<CompetitionLevelConnection> selectAllByConnectionIdAndCompetitionType(int competitionId,int competitionType);

    List<CompetitionLevelConnection> selectAllByLevelIdAndCompetitionType(int levelId,int competitionType);

    List<CompetitionLevelConnection> selectAllByCompetitionType(int competitionType);

    List<CompetitionLevelConnection> selectAll();
}
