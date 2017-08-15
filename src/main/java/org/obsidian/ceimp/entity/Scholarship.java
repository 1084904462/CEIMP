package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Scholarship {
    private Integer scholarshipId;

    private String scholarshipName;

    private Double awardPercent;

    private Long createTime;

    @Override
    public String toString() {
        return "Scholarship{" +
                "scholarshipId=" + scholarshipId +
                ", scholarshipName='" + scholarshipName + '\'' +
                ", awardPercent=" + awardPercent +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Scholarship() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Scholarship(String scholarshipName, Double awardPercent) {
        this.scholarshipName = scholarshipName;
        this.awardPercent = awardPercent;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Scholarship(Integer scholarshipId, String scholarshipName, Double awardPercent) {
        this.scholarshipId = scholarshipId;
        this.scholarshipName = scholarshipName;
        this.awardPercent = awardPercent;
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

    public Double getAwardPercent() {
        return awardPercent;
    }

    public void setAwardPercent(Double awardPercent) {
        this.awardPercent = awardPercent;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}