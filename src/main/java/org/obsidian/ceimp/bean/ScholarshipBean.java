package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/25.
 */
public class ScholarshipBean {
    private int scholarshipId;

    private String scholarshipName;

    @Override
    public String toString() {
        return "ScholarshipBean{" +
                "scholarshipId=" + scholarshipId +
                ", scholarshipName='" + scholarshipName + '\'' +
                '}';
    }

    public ScholarshipBean() {
    }

    public ScholarshipBean(int scholarshipId, String scholarshipName) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
    }

    public int getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(int scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName;
    }
}
