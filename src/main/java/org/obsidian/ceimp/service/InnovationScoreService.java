package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.InnovationScore;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public interface InnovationScoreService {

    int insertInnovationScore(int levelId,int requireId,double score);

    int updateInnovationScore(int scoreId,int levelId,int requireId,double score);

    int deleteInnovationScore(int scoreId);

    InnovationScore selectByScoreId(int scoreId);

    InnovationScore selectByLevelIdAndRequireId(int levelId,int requireId);

    List<InnovationScore> selectAll();
}
