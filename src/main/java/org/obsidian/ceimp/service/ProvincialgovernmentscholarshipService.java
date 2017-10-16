package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ProvincialgovernmentscholarshipShowBean;
import org.obsidian.ceimp.entity.Provincialgovernmentscholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface ProvincialgovernmentscholarshipService {
    int insertProvincialgovernmentscholarship(String userId,
                                              String date1,String award1,String unit1,
                                              String date2,String award2,String unit2,
                                              String date3,String award3,String unit3,
                                              String date4,String award4,String unit4,
                                              String applyReason,String recommendReason,String opinion);

    int updateProvincialgovernmentscholarship(String userId,
                                              String date1,String award1,String unit1,
                                              String date2,String award2,String unit2,
                                              String date3,String award3,String unit3,
                                              String date4,String award4,String unit4,
                                              String applyReason,String recommendReason,String opinion);

    int deleteProvincialgovernmentscholarship(String userId);

    Provincialgovernmentscholarship selectByUserId(String userId);

    List<ProvincialgovernmentscholarshipShowBean> selectAllProvincialgovernmentscholarship();

    int updateAllRecommendReasonAndOpinion(String recommendReason,String opinion);
}
