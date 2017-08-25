package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class InnovationLevel {
    private Integer levelId;

    private String level;

    private Integer innovationId;

    private Long createTime;

    @Override
    public String toString() {
        return "InnovationLevel{" +
                "levelId=" + levelId +
                ", level='" + level + '\'' +
                ", innovationId=" + innovationId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public InnovationLevel() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationLevel(String level, Integer innovationId) {
        this.level = level;
        this.innovationId = innovationId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public InnovationLevel(Integer levelId, String level, Integer innovationId) {
        this.levelId = levelId;
        this.level = level;
        this.innovationId = innovationId;
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

    public Integer getInnovationId() {
        return innovationId;
    }

    public void setInnovationId(Integer innovationId) {
        this.innovationId = innovationId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}