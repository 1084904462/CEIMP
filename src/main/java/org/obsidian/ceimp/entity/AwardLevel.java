package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class AwardLevel {
    private Integer awardLevelId;

    private String level;

    private Long createTime;

    @Override
    public String toString() {
        return "AwardLevel{" +
                "awardLevelId=" + awardLevelId +
                ", level='" + level + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public AwardLevel() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public AwardLevel(String level) {
        this.level = level;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public AwardLevel(Integer awardLevelId, String level) {
        this.awardLevelId = awardLevelId;
        this.level = level;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getAwardLevelId() {
        return awardLevelId;
    }

    public void setAwardLevelId(Integer awardLevelId) {
        this.awardLevelId = awardLevelId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}