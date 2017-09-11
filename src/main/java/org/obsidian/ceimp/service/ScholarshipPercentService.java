package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ScholarshipPercent;

import java.util.List;

/**
 * Created by BillChen on 2017/9/7.
 */
public interface ScholarshipPercentService {

    int insertScholarshipPercent(int scholarshipId,String level,double percent);

    int updateScholarshipPercent(int percentId,int scholarshipId,String level,double percent);

    int deleteScholarshipPercent(int percentId);

    ScholarshipPercent selectByPercentId(int percentId);

    List<ScholarshipPercent> selectAllByScholarshipId(int scholarshipId);

    List<ScholarshipPercent> selectAll();
}
