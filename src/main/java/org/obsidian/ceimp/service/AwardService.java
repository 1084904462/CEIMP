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

    List<Award> selectAllByThisYear();
    List<Award> selectAllByYearScope(int yearScope);

    List<Award> selectAllByUserId(String userId);
    List<Award> selectAllByUserIdAndThisYear(String userId);
    List<Award> selectAllByUserIdAndYearScope(String userId,int yearScope);

    List<Award> selectAllByScholarshipId(int scholarshipId);
    List<Award> selectAllByScholarshipIdAndThisYear(int scholarshipId);
    List<Award> selectAllByScholarshipIdAndYearScope(int scholarshipId,int yearScope);

    List<Award> selectAllByClassId(int classId);
    List<Award> selectAllByClassIdAndThisYear(int classId);
    List<Award> selectAllByClassIdAndYearScope(int classId,int yearScope);

    List<Award> selectAllBySchoolId(int schoolId);
    List<Award> selectAllBySchoolIdAndThisYear(int schoolId);
    List<Award> selectAllBySchoolIdAndYearScope(int schoolId,int yearScope);

    List<Award> selectAll();
}
