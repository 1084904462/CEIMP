package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/25.
 */
public class ScholarshipItemBean {
    private int scholarshipItemId;

    private String scholarshipItemName;

    private int fillInTypeId;

    private String fillInHint;

    @Override
    public String toString() {
        return "ScholarshipItemBean{" +
                "scholarshipItemId=" + scholarshipItemId +
                ", scholarshipItemName='" + scholarshipItemName + '\'' +
                ", fillInTypeId=" + fillInTypeId +
                ", fillInHint='" + fillInHint + '\'' +
                '}';
    }

    public ScholarshipItemBean() {
    }

    public ScholarshipItemBean(int scholarshipItemId, String scholarshipItemName, int fillInTypeId, String fillInHint) {
        this.scholarshipItemId = scholarshipItemId;
        this.scholarshipItemName = scholarshipItemName;
        this.fillInTypeId = fillInTypeId;
        this.fillInHint = fillInHint;
    }

    public int getScholarshipItemId() {
        return scholarshipItemId;
    }

    public void setScholarshipItemId(int scholarshipItemId) {
        this.scholarshipItemId = scholarshipItemId;
    }

    public String getScholarshipItemName() {
        return scholarshipItemName;
    }

    public void setScholarshipItemName(String scholarshipItemName) {
        this.scholarshipItemName = scholarshipItemName;
    }

    public int getFillInTypeId() {
        return fillInTypeId;
    }

    public void setFillInTypeId(int fillInTypeId) {
        this.fillInTypeId = fillInTypeId;
    }

    public String getFillInHint() {
        return fillInHint;
    }

    public void setFillInHint(String fillInHint) {
        this.fillInHint = fillInHint;
    }
}
