package org.obsidian.ceimp.bean;

import org.obsidian.ceimp.entity.ScholarshipBlock;
import org.obsidian.ceimp.entity.ScholarshipItem;

import java.util.List;

/**
 * Created by BillChen on 2017/8/20.
 */
public class ScholarshipBlockBean {
    private ScholarshipBlock scholarshipBlock;

    private List<ScholarshipItem> scholarshipItemList;

    @Override
    public String toString() {
        return "ScholarshipBlockBean{" +
                "scholarshipBlock=" + scholarshipBlock +
                ", scholarshipItemList=" + scholarshipItemList +
                '}';
    }

    public ScholarshipBlockBean() {
    }

    public ScholarshipBlockBean(ScholarshipBlock scholarshipBlock, List<ScholarshipItem> scholarshipItemList) {
        this.scholarshipBlock = scholarshipBlock;
        this.scholarshipItemList = scholarshipItemList;
    }

    public ScholarshipBlock getScholarshipBlock() {
        return scholarshipBlock;
    }

    public void setScholarshipBlock(ScholarshipBlock scholarshipBlock) {
        this.scholarshipBlock = scholarshipBlock;
    }

    public List<ScholarshipItem> getScholarshipItemList() {
        return scholarshipItemList;
    }

    public void setScholarshipItemList(List<ScholarshipItem> scholarshipItemList) {
        this.scholarshipItemList = scholarshipItemList;
    }
}
