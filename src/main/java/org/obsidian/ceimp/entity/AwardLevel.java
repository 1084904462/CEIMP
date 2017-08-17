package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class AwardLevel {
    private Integer levelId;

    private String level;

    private Long createTime;

    @Override
    public String toString() {
        return "AwardLevel{" +
                "levelId=" + levelId +
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

    public AwardLevel(Integer levelId, String level) {
        this.levelId = levelId;
        this.level = level;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
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