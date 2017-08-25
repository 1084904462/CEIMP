package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/8/25.
 */
public class ScholarshipItemBean {
    private int scholarshipItemId;

    private String scholarshipItemName;

    private FillInTypeBean fillInTypeBean;

    private String fillInHint;

    @Override
    public String toString() {
        return "ScholarshipItemBean{" +
                "scholarshipItemId=" + scholarshipItemId +
                ", scholarshipItemName='" + scholarshipItemName + '\'' +
                ", fillInTypeBean=" + fillInTypeBean +
                ", fillInHint='" + fillInHint + '\'' +
                '}';
    }

    public ScholarshipItemBean() {
    }

    public ScholarshipItemBean(int scholarshipItemId, String scholarshipItemName, FillInTypeBean fillInTypeBean, String fillInHint) {
        this.scholarshipItemId = scholarshipItemId;
        this.scholarshipItemName = scholarshipItemName;
        this.fillInTypeBean = fillInTypeBean;
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

    public FillInTypeBean getFillInTypeBean() {
        return fillInTypeBean;
    }

    public void setFillInTypeBean(FillInTypeBean fillInTypeBean) {
        this.fillInTypeBean = fillInTypeBean;
    }

    public String getFillInHint() {
        return fillInHint;
    }

    public void setFillInHint(String fillInHint) {
        this.fillInHint = fillInHint;
    }
}
