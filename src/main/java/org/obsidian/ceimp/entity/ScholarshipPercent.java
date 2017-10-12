package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ScholarshipPercent {
    private Integer percentId;

    private Integer scholarshipId;

    private String level;

    private Double percent;

    private Long createTime;

    @Override
    public String toString() {
        return "ScholarshipPercent{" +
                "percentId=" + percentId +
                ", scholarshipId=" + scholarshipId +
                ", level='" + level + '\'' +
                ", percent=" + percent +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ScholarshipPercent() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ScholarshipPercent(Integer scholarshipId, String level, Double percent) {
        this.scholarshipId = scholarshipId;
        this.level = level;
        this.percent = percent;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ScholarshipPercent(Integer percentId, Integer scholarshipId, String level, Double percent) {
        this.percentId = percentId;
        this.scholarshipId = scholarshipId;
        this.level = level;
        this.percent = percent;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getPercentId() {
        return percentId;
    }

    public void setPercentId(Integer percentId) {
        this.percentId = percentId;
    }

    public Integer getScholarshipId() {
        return scholarshipId;
    }

    public void setScholarshipId(Integer scholarshipId) {
        this.scholarshipId = scholarshipId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}