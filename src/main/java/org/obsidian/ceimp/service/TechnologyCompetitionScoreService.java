package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.TechnologyCompetitionScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/15.
 */
public interface TechnologyCompetitionScoreService {

    int insertTechnologyCompetitionScore(int competitionLevelId,int awardLevelId,int competitionTypeId,int score);

    int updateTechnologyCompetitionScore(int scoreId,int competitionLevelId,int awardLevelId,int competitionTypeId,int score);

    int deleteTechnologyCompetitionScore(int scoreId);

    TechnologyCompetitionScore selectByScoreId(int scoreId);

    TechnologyCompetitionScore selectByCompetitionLevelIdAndAwardLevelIdAndCompetitionTypeId(int competitionLevelId,int awardLevelId,int competitionTypeId);

    List<TechnologyCompetitionScore> selectAll();
}
