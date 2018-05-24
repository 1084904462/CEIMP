package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NgOpinionFormBean;
import org.obsidian.ceimp.bean.NgOpinionUpdateBean;
import org.obsidian.ceimp.bean.ScholarshipOpinionBean;
import org.obsidian.ceimp.entity.Opinion;

import java.util.List;

/**
 * Created by BillChen on 2017/11/20.
 */
public interface OpinionService {
    ScholarshipOpinionBean getBean(Long SchoolId,String grade,Integer yearScope);

    int update(Long schoolId,Integer yearScope,ScholarshipOpinionBean scholarshipOpinionBean);

    Opinion get(Long userId, Integer yearScope);

    List<NgOpinionFormBean> getNgOpinionFormBeanList(Long schoolId,String grade,Integer yearScope);

    int updateNgOpinion(NgOpinionUpdateBean ngOpinionUpdateBean,Integer yearScope);
}
