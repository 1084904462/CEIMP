package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface CompetitionInputService {

    int insertCompetitionInput(String userId,int competitionId,String evidence,int competitionLevelId,int awardLevelId,int competitionType);

    int updateCompetitionInput(int inputId,String userId,int competitionId,String evidence,int competitionLevelId,int awardLevelId,int competitionType);

    int deleteCompetitionInput(int inputId);

    CompetitionInput selectByInputId(int inputId);

    List<CompetitionInput> selectAllByUserId(String userId);
    List<CompetitionInput> selectAllByUserIdAndThisYear(String userId);
    List<CompetitionInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<CompetitionInput> selectAllByUserIdAndCompetitionType(String userId,int competitionType);
    List<CompetitionInput> selectAllByUserIdAndCompetitionTypeAndThisYear(String userId,int competitionType);
    List<CompetitionInput> selectAllByUserIdAndCompetitionTypeAndYearScope(String userId,int competitionType,int yearScope);

    List<CompetitionInput> selectAll();
}
