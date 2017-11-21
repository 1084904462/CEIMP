package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.TasBean;
import org.obsidian.ceimp.entity.Tas;

import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface TasService {
    Tas selectByUserIdAndYearScope(Long userId, Integer yearScope);

    List<Tas> selectAllByUserId(Long userId);

    TasBean getTasBeanByUserIdAndYearScope(Long userId, Integer yearScope);
}
