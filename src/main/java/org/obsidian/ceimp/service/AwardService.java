package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Award;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface AwardService {

    int insertAward(String userId,int scholarshipId);

    int updateAward(int awardId,String userId,int scholarshipId);

    int deleteAward(int awardId);

    Award selectByAwardId(int awardId);

    List<Award> selectAllByUserId(String userId);

    List<Award> selectAllByScholarshipId(int scholarshipId);

    List<Award> selectAllByClassId(int classId);

    List<Award> selectAllBySchoolId(int schoolId);

    List<Award> selectAll();
}
