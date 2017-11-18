package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Ng;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface NgService {
    Ng selectByUserIdAndYearScope(Long userId,Integer yearScope);

    List<Ng> selectAllByUserId(Long userId);
}
