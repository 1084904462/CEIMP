package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionInput;

import java.util.List;

/**
 * Created by BillChen on 2017/8/16.
 */
public interface CompetitionInputService {

    int insertCompetitionInput(String userId,int competitionId,int competitionTypeId,int competitionLevelId,int awardLevelId,String evidence);

    int updateCompetitionInput(int inputId,String userId,int competitionId,int competitionTypeId,int competitionLevelId,int awardLevelId,String evidence);

    int deleteCompetitionInput(int inputId);

    CompetitionInput selectByInputId(int inputId);

    List<CompetitionInput> selectAllByThisYear();
    List<CompetitionInput> selectAllByYearScope(int yearScope);

    List<CompetitionInput> selectAllByUserId(String userId);
    List<CompetitionInput> selectAllByUserIdAndThisYear(String userId);
    List<CompetitionInput> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<CompetitionInput> selectAll();
}
