package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NationalinspirationalscholarshipShowBean;
import org.obsidian.ceimp.entity.Nationalinspirationalscholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/10/14.
 */
public interface NationalinspirationalscholarshipService {
    int insertNationalinspirationalscholarship(String userId,
                                               String date1,String award1,String unit1,
                                               String date2,String award2,String unit2,
                                               String date3,String award3,String unit3,
                                               String date4,String award4,String unit4,
                                               String resident,String incomeSource,String monthIncome,
                                               String familySum,String address,String postalCode,
                                               String situation,String applyReason,String opinion);

    int updateNationalinspirationalscholarship(String userId,
                                               String date1,String award1,String unit1,
                                               String date2,String award2,String unit2,
                                               String date3,String award3,String unit3,
                                               String date4,String award4,String unit4,
                                               String resident,String incomeSource,String monthIncome,
                                               String familySum,String address,String postalCode,
                                               String situation,String applyReason,String opinion);

    int deleteNationalinspirationalscholarship(String userId);

    Nationalinspirationalscholarship selectByUserId(String userId);

    List<NationalinspirationalscholarshipShowBean> selectAllNationalinspirationalscholarship();

    int updateAllOpinion(String opinion);
}
