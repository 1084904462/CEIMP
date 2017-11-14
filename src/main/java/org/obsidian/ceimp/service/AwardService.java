package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Award;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface AwardService {
    List<Award> selectAllByUserIdAndYearScope(Long userId,Integer yearScope);
}
