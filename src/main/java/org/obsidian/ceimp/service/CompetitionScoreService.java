package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
public interface CompetitionScoreService {

    int insertCompetitionScore(int type,int competitionLevelId,int awardLevelId,double score);

    int updateCompetitionScore(int scoreId,int type,int competitionLevelId,int awardLevelId,double score);

    int deleteCompetitionScore(int scoreId);

    CompetitionScore selectByScoreId(int scoreId);

    CompetitionScore selectByTypeAndCompetitionLevelIdAndAwardLevelId(int type,int competitionLevelId,int awardLevelId);

    List<CompetitionScore> selectAllByType(int type);

    List<CompetitionScore> selectAll();
}
