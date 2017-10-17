package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ScholarshipOpinion;

/**
 * Created by BillChen on 2017/10/17.
 */
public interface ScholarshipOpinionSerivce {
    int updateScholarshipOpinion(String managerId,String nationalOpinion,String provincialRecommend,
                                 String provincialOpinion,String schoolOpinion,String tripleaOpinion);

    ScholarshipOpinion selectByManagerId(String managerId);

    int updateNationalOpinion(String managerId,String nationalOpinion);
    int updateProvincialRecommendAndProvincialOpinion(String managerId,String provincialRecommend,String provincialOpinion);
    int updateSchoolOpinion(String managerId,String schoolOpinion);
    int updateTripleaOpinion(String managerId,String tripleaOpinion);
}
