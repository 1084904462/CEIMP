package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class AwardLevel {
    private Integer awardLevelId;

    private String awardLevel;

    private Long createTime;

    @Override
    public String toString() {
        return "AwardLevel{" +
                "awardLevelId=" + awardLevelId +
                ", awardLevel='" + awardLevel + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public AwardLevel() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public AwardLevel(Integer awardLevelId, String awardLevel) {
        this.awardLevelId = awardLevelId;
        this.awardLevel = awardLevel;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getAwardLevelId() {
        return awardLevelId;
    }

    public void setAwardLevelId(Integer awardLevelId) {
        this.awardLevelId = awardLevelId;
    }

    public String getAwardLevel() {
        return awardLevel;
    }

    public void setAwardLevel(String awardLevel) {
        this.awardLevel = awardLevel == null ? null : awardLevel.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}