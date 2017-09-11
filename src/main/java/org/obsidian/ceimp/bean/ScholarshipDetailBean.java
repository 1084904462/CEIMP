package org.obsidian.ceimp.bean;

import java.util.List;

/**
 * Created by BillChen on 2017/9/11.
 */
public class ScholarshipDetailBean {
    private int scholarshipId;

    private String scholarshipName;

    private List<String> awardList;

    private List<ScholarshipBlockBean> scholarshipBlockBeans;

    @Override
    public String toString() {
        return "ScholarshipDetailBean{" +
                "scholarshipId=" + scholarshipId +
                ", scholarshipName='" + scholarshipName + '\'' +
                ", awardList=" + awardList +
                ", scholarshipBlockBeans=" + scholarshipBlockBeans +
                '}';
    }

    public ScholarshipDetailBean() {
    }

    public ScholarshipDetailBean(int scholarshipId, String scholarshipName, List<String> awardList, List<ScholarshipBlockBean> scholarshipBlockBeans) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.awardList = awardList;
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

    public List<String> getAwardList() {
        return awardList;
    }

    public void setAwardList(List<String> awardList) {
        this.awardList = awardList;
    }

    public List<ScholarshipBlockBean> getScholarshipBlockBeans() {
        return scholarshipBlockBeans;
    }

    public void setScholarshipBlockBeans(List<ScholarshipBlockBean> scholarshipBlockBeans) {
        this.scholarshipBlockBeans = scholarshipBlockBeans;
    }
}
