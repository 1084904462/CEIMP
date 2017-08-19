package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/17.
 */
public interface CompetitionScoreService {

    int insertCompetitionScore(int competitionLevelId,int awardLevelId,int competitionTypeId,double score,int type);

    int updateCompetitionScore(int scoreId,int competitionLevelId,int awardLevelId,int competitionTypeId,double score,int type);

    int deleteCompetitionScore(int scoreId);

    CompetitionScore selectByScoreId(int scoreId);

    CompetitionScore selectByCompetitionLevelIdAndAwardLevelIdAndCompetitionTypeIdAndType(int competitionLevelId,int awardLevelId,int competitionTypeId,int type);

    List<CompetitionScore> selectAllByCompetitionLevelIdAndType(int competitionLevelId,int type);

    List<CompetitionScore> selectAllByAwardLevelIdAndType(int awardLevelId,int type);

    List<CompetitionScore> selectAllByCompetitionTypeIdAndType(int competitionTypeId,int type);

    List<CompetitionScore> selectAll();
}
