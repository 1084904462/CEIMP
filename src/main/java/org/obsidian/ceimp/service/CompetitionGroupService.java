package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.CompetitionGroup;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface CompetitionGroupService {

    int insertCompetitionGroup(String rank,double percent,int schoolId);

    int updateCompetitionGroup(int rankId,String rank,double percent,int schoolId);

    int deleteCompetitionGroup(int rankId);

    CompetitionGroup selectByRankId(int rankId);

    CompetitionGroup selectByRank(String rank);

    List<CompetitionGroup> selectAllBySchoolId(int schoolId);

    List<CompetitionGroup> selectAll();
}
