package org.obsidian.ceimp.service;

import org.obsidian.ceimp.bean.ScholarshipBean;
import org.obsidian.ceimp.bean.ScholarshipDetailBean;
import org.obsidian.ceimp.entity.Scholarship;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface ScholarshipService {

    int insertScholarship(String scholarshipName,String modelName);

    int updateScholarship(int scholarshipId,String scholarshipName,String modelName);

    int deleteScholarship(int scholarshipId);

    Scholarship selectByScholarshipId(int scholarshipId);

    List<Scholarship> selectAllByScholarshipName(String scholarshipName);

    List<Scholarship> selectAll();

    List<ScholarshipBean> selectAllIdAndName();

    ScholarshipDetailBean selectScholarshipDetail(int scholarshipId);
}
