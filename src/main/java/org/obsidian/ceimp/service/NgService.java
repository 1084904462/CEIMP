package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NgBean;
import org.obsidian.ceimp.entity.Ng;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by BillChen on 2017/11/18.
 */
public interface NgService {
    int updateNgOpinion(String opinion, List<String> userAccountList,Integer yearScope);

    Ng selectByUserIdAndYearScope(Long userId,Integer yearScope);

    NgBean getNgBeanByUserIdAndYearScope(Long userId,Integer yearScope);

    int insertNg(Long userId,Integer yearScope,NgBean ngBean);

    int updateNg(Long userId,Integer yearScope,NgBean ngBean);

    void getNgWord(NgBean ngBean, HttpServletResponse response) throws IOException;
}
