package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.PgsBean;
import org.obsidian.ceimp.entity.Pgs;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface PgsService {
    Pgs selectByUserIdAndYearScope(Long userId, Integer yearScope);

    List<Pgs> selectAllByUserId(Long userId);

    PgsBean getPgsBeanByUserIdAndYearScope(Long userId, int yearScope);
}
