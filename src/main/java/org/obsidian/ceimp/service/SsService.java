package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.SsBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.entity.Ss;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface SsService {
    List<SsBean> getSsBeanList(List<ZipInfoBean> zipInfoBeanList, Integer yearScope);

    Ss selectByUserIdAndYearScope(Long userId, Integer yearScope);

    SsBean getSsBeanByUserIdAndYearScope(Long userId, Integer yearScope);

    int insertSs(Long userId,Integer yearScope,SsBean ssBean);

    int updateSs(Long userId,Integer yearScope,SsBean ssBean);

    void getSsWord(SsBean ssBean, HttpServletResponse response) throws IOException;
}
