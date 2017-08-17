package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionLevel;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface CompetitionLevelService {

    int insertCompetitionLevel(String level);

    int updateCompetitionLevel(int levelId,String level);

    int deleteCompetitionLevel(int levelId);

    CompetitionLevel selectByLevelId(int levelId);

    CompetitionLevel selectByLevel(String level);

    List<CompetitionLevel> selectAll();
}
