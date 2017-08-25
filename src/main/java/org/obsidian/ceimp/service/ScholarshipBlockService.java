package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ScholarshipBlock;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface ScholarshipBlockService {

    int insertScholarshipBlock(String scholarshipBlockName,int scholarshipId);

    int updateScholarshipBlock(int scholarshipBlockId,String scholarshipBlockName,int scholarshipId);

    int deleteScholarshipBlock(int scholarshipBlockId);

    ScholarshipBlock selectByScholarshipBlockId(int scholarshipBlockId);

    List<ScholarshipBlock> selectAllByScholarshipBlockName(String scholarshipBlockName);

    List<ScholarshipBlock> selectAllByScholarshipId(int scholarshipId);

    List<ScholarshipBlock> selectAll();
}
