package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Ss;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface SsService {
    Ss selectByUserIdAndYearScope(Long userId, Integer yearScope);

    List<Ss> selectAllByUserId(Long userId);
}
