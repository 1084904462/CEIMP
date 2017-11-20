package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NisBean;
import org.obsidian.ceimp.entity.Nis;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface NisService {
    Nis selectByUserIdAndYearScope(Long userId, Integer yearScope);

    List<Nis> selectAllByUserId(Long userId);

    NisBean getNisBeanByUserIdAndYearScope(Long userId,Integer yearScope);
}
