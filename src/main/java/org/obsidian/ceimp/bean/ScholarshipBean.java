package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/8/25.
 */
public class ScholarshipBean {
    private int scholarshipId;

    private String scholarshipName;

    private double awardPercent;

    private List<ScholarshipBlockBean> scholarshipBlockBeans;

    @Override
    public String toString() {
        return "ScholarshipBean{" +
                "scholarshipId=" + scholarshipId +
                ", scholarshipName='" + scholarshipName + '\'' +
                ", awardPercent=" + awardPercent +
                ", scholarshipBlockBeans=" + scholarshipBlockBeans +
                '}';
    }

    public ScholarshipBean() {
    }

    public ScholarshipBean(int scholarshipId, String scholarshipName, double awardPercent, List<ScholarshipBlockBean> scholarshipBlockBeans) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.awardPercent = awardPercent;
        this.scholarshipBlockBeans = scholarshipBlockBeans;
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

    public double getAwardPercent() {
        return awardPercent;
    }

    public void setAwardPercent(double awardPercent) {
        this.awardPercent = awardPercent;
    }

    public List<ScholarshipBlockBean> getScholarshipBlockBeans() {
        return scholarshipBlockBeans;
    }

    public void setScholarshipBlockBeans(List<ScholarshipBlockBean> scholarshipBlockBeans) {
        this.scholarshipBlockBeans = scholarshipBlockBeans;
    }
}
