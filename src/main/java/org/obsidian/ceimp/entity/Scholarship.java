package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Scholarship {
    private Integer scholarshipId;

    private String scholarshipName;

    private Integer awardSum;

    private Long createTime;

    @Override
    public String toString() {
        return "Scholarship{" +
                "scholarshipId=" + scholarshipId +
                ", scholarshipName='" + scholarshipName + '\'' +
                ", awardSum=" + awardSum +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Scholarship() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Scholarship(Integer scholarshipId, String scholarshipName, Integer awardSum) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.awardSum = awardSum;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(Integer scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getScholarshipName() {
        return scholarshipName;
    }

    public void setScholarshipName(String scholarshipName) {
        this.scholarshipName = scholarshipName == null ? null : scholarshipName.trim();
    }

    public Integer getAwardSum() {
        return awardSum;
    }

    public void setAwardSum(Integer awardSum) {
        this.awardSum = awardSum;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}