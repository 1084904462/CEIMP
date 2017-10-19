package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.NationalGrantOpinionBean;
import org.obsidian.ceimp.bean.NationalGrantShowBean;
import org.obsidian.ceimp.entity.NationalGrant;

import java.util.List;

/**
 * Created by BillChen on 2017/10/18.
 */
public interface NationalGrantService {
    int insertNationalGrant(String userId,
                            String resident,String incomeSource,String monthIncome,
                            String familySum, String address,String postalCode,
                            String fName1, String age1, String relation1, String workPlace1,
                            String fName2, String age2, String relation2, String workPlace2,
                            String fName3, String age3, String relation3, String workPlace3,
                            String fName4, String age4, String relation4, String workPlace4,
                            String fName5, String age5, String relation5, String workPlace5,
                            String situation,String applyReason);

    int updateNationalGrant(String userId,
                            String resident,String incomeSource,String monthIncome,
                            String familySum, String address,String postalCode,
                            String fName1, String age1, String relation1, String workPlace1,
                            String fName2, String age2, String relation2, String workPlace2,
                            String fName3, String age3, String relation3, String workPlace3,
                            String fName4, String age4, String relation4, String workPlace4,
                            String fName5, String age5, String relation5, String workPlace5,
                            String situation,String applyReason);

    int updateNationalGrant(String userId,String opinion);

    int deleteNationalGrant(String userId);

    NationalGrant selectByUserId(String userId);

    List<NationalGrantShowBean> selectAllNationalGrant();

    List<NationalGrantOpinionBean> selectAllNationalGrantOpinion();
}
