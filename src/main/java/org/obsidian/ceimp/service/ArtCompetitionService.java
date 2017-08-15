package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ArtCompetition;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface ArtCompetitionService {

    int insertArtCompetition(String competitionName);

    int updateArtCompetition(int competitionId,String competitionName);

    int deleteArtCompetition(int competitionId);

    ArtCompetition selectByCompetitionId(int competitionId);

    ArtCompetition selectByCompetitionName(String competitionName);

    List<ArtCompetition> selectAllByCompetitionName(String competitionName);

    List<ArtCompetition> selectAll();
}
