package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.Scholarship;

/**
 * Created by BillChen on 2017/11/14.
 */
public interface ScholarshipService {
    Scholarship selectByScholarshipId(Long scholarshipId);

    Scholarship selectBySubName(String subName);
}
