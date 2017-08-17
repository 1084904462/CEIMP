package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
public interface CompetitionScoreService {

    int insertCompetitionScore(int competitionLevelId,int awardLevelId,int competitionTypeId,double score);

    int updateCompetitionScore(int scoreId,int competitionLevelId,int awardLevelId,int competitionTypeId,double score);

    int deleteCompetitionScore(int scoreId);

    CompetitionScore selectByScoreId(int scoreId);

    CompetitionScore selectByCompetitionLevelIdAndAwardLevelIdAndCompetitionTypeId(int competitionLevelId,int awardLevelId,int competitionTypeId);

    List<CompetitionScore> selectAllByCompetitionLevelId(int competitionLevelId);

    List<CompetitionScore> selectAllByAwardLevelId(int awardLevelId);

    List<CompetitionScore> selectAllByCompetitionTypeId(int competitionTypeId);

    List<CompetitionScore> selectAll();
}
