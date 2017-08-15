package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ArtCompetitionScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface ArtCompetitionScoreService {

    int insertArtCompetitionScore(int competitionLevelId,int awardLevelId,int score);

    int updateArtCompetitionScore(int scoreId,int competitionLevelId,int awardLevelId,int score);

    int deleteArtCompetitionScore(int scoreId);

    ArtCompetitionScore selectByScoreId(int scoreId);

    ArtCompetitionScore selectByCompetitionLevelIdAndAwardLevelId(int competitionLevelId,int awardLevelId);

    List<ArtCompetitionScore> selectAll();
}
