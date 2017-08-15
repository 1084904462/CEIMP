package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.AwardLevel;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface AwardLevelService {

    int insertAwardLevel(String level);

    int updateAwardLevel(int awardLevelId,String level);

    int deleteAwardLevel(int awardLevelId);

    AwardLevel selectByAwardLevelId(int awardLevelId);

    AwardLevel selectByLevel(String level);

    List<AwardLevel> selectAll();
}
