package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionLevel;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface CompetitionLevelService {

    int insertCompetitionLevel(String level);

    int updateCompetitionLevel(int competitionLevelId,String level);

    int deleteCompetitionLevel(int competitionLevelId);

    CompetitionLevel selectByCompetitionLevelId(int competitionLevelId);

    CompetitionLevel selectByLevel(String level);

    List<CompetitionLevel> selectAll();
}
