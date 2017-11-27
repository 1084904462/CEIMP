package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NisBean;
import org.obsidian.ceimp.bean.ZipInfoBean;
import org.obsidian.ceimp.entity.Nis;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface NisService {
    List<NisBean> getNisBeanList(List<ZipInfoBean> zipInfoBeanList, Integer yearScope);

    Nis selectByUserIdAndYearScope(Long userId, Integer yearScope);

    NisBean getNisBeanByUserIdAndYearScope(Long userId,Integer yearScope);

    int insertNis(Long userId,Integer yearScope,NisBean nisBean);

    int updateNis(Long userId,Integer yearScope,NisBean nisBean);

    void getNisWord(NisBean nisBean, HttpServletResponse response) throws IOException;
}
