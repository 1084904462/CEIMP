package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.PgsBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.entity.Pgs;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface PgsService {
    List<PgsBean> getPgsBeanList(List<ZipInfoBean> zipInfoBeanList, Integer yearScope);

    Pgs selectByUserIdAndYearScope(Long userId, Integer yearScope);

    PgsBean getPgsBeanByUserIdAndYearScope(Long userId, Integer yearScope);

    int insertPgs(Long userId,Integer yearScope,PgsBean pgsBean);

    int updatePgs(Long userId,Integer yearScope,PgsBean pgsBean);

    void getPgsWord(PgsBean pgsBean, HttpServletResponse response) throws IOException;
}
