package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.InnovationLevel;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface InnovationLevelService {

    int insertInnovationLevel(String level,int innovationId);

    int updateInnovationLevel(int levelId,String level,int innovationId);

    int deleteInnovationLevel(int levelId);

    InnovationLevel selectByLevelId(int levelId);

    List<InnovationLevel> selectAllByLevel(String level);

    List<InnovationLevel> selectAllByInnovationId(int innovationId);

    List<InnovationLevel> selectAll();
}
