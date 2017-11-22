package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.AwardBean;
import org.obsidian.ceimp.bean.ScholarshipFormBean;

import java.util.List;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface AwardService {
    List<AwardBean> selectAllByUserIdAndYearScope(Long userId, Integer yearScope);

    List<ScholarshipFormBean> selectAllBySubNameAndYearScope(String subName,Integer yearScope,String grade);

    Long selectAwardIdBySubNameAndYearScope(String subName,Integer yearScope);

    int updateIsFilledByUserIdAndYearScopeAndSubName(Long userId,Integer yearScope,String subName);
}
