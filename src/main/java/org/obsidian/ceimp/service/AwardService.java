package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface AwardService {
    List<AwardBean> getList(Long userId, Integer yearScope);

    List<ScholarshipFormBean> selectAllBySubNameAndYearScope(String subName,Integer yearScope,String grade);

    Boolean exist(Long userId,String subName,Integer yearScope);

    int updateIsFilled(Long userId,Integer yearScope,String subName);
}
