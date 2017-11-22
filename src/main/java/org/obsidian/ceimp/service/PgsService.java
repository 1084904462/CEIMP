package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.PgsBean;
import org.obsidian.ceimp.entity.Pgs;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface PgsService {
    Pgs selectByUserIdAndYearScope(Long userId, Integer yearScope);

    PgsBean getPgsBeanByUserIdAndYearScope(Long userId, Integer yearScope);

    int insertPgs(Long userId,Integer yearScope,PgsBean pgsBean);

    int updatePgs(Long userId,Integer yearScope,PgsBean pgsBean);

    void getPgsWord(PgsBean pgsBean, HttpServletResponse response) throws IOException;
}
