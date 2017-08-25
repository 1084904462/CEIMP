package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public class ScholarshipBlockBean {
    private int scholarshipBlockId;

    private String scholarshipBlockName;

    private List<ScholarshipItemBean> scholarshipItemBeans;

    @Override
    public String toString() {
        return "ScholarshipBlockBean{" +
                "scholarshipBlockId=" + scholarshipBlockId +
                ", scholarshipBlockName='" + scholarshipBlockName + '\'' +
                ", scholarshipItemBeans=" + scholarshipItemBeans +
                '}';
    }

    public ScholarshipBlockBean() {
    }

    public ScholarshipBlockBean(int scholarshipBlockId, String scholarshipBlockName, List<ScholarshipItemBean> scholarshipItemBeans) {
        this.scholarshipBlockId = scholarshipBlockId;
        this.scholarshipBlockName = scholarshipBlockName;
        this.scholarshipItemBeans = scholarshipItemBeans;
    }

    public int getScholarshipBlockId() {
        return scholarshipBlockId;
    }

    public void setScholarshipBlockId(int scholarshipBlockId) {
        this.scholarshipBlockId = scholarshipBlockId;
    }

    public String getScholarshipBlockName() {
        return scholarshipBlockName;
    }

    public void setScholarshipBlockName(String scholarshipBlockName) {
        this.scholarshipBlockName = scholarshipBlockName;
    }

    public List<ScholarshipItemBean> getScholarshipItemBeans() {
        return scholarshipItemBeans;
    }

    public void setScholarshipItemBeans(List<ScholarshipItemBean> scholarshipItemBeans) {
        this.scholarshipItemBeans = scholarshipItemBeans;
    }
}
