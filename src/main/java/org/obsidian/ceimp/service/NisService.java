package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NisBean;
import org.obsidian.ceimp.entity.Nis;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface NisService {
    Nis selectByUserIdAndYearScope(Long userId, Integer yearScope);

    NisBean getNisBeanByUserIdAndYearScope(Long userId,Integer yearScope);

    int insertNis(Long userId,Integer yearScope,NisBean nisBean);

    int updateNis(Long userId,Integer yearScope,NisBean nisBean);

    void getNisWord(NisBean nisBean, HttpServletResponse response) throws IOException;
}
