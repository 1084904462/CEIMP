package org.obsidian.ceimp.service;

import org.obsidian.ceimp.entity.ScholarshipItem;

import java.util.List;

/**
 * Created by BillChen on 2017/8/14.
 */
public interface ScholarshipItemService {

    int insertScholarshipItem(String scholarshipItemName,int scholarshipBlockId,int fillInTypeId,String fillInHint);

    int updateScholarshipItem(int scholarshipItemId,String scholarshipItemName,int scholarshipBlockId,int fillInTypeId,String fillInHint);

    int deleteScholarshipItem(int scholarshipItemId);

    ScholarshipItem selectByScholarshipItemId(int scholarshipItemId);

    List<ScholarshipItem> selectAllByScholarshipItemName(String scholarshipItemName);

    List<ScholarshipItem> selectAllByScholarshipBlockId(int scholarshipBlockId);

    List<ScholarshipItem> selectAllByFillInTypeId(int fillInTypeId);

    List<ScholarshipItem> selectAllByScholarshipId(int scholarshipId);

    List<ScholarshipItem> selectAll();
}
