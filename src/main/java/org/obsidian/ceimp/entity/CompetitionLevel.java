package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionLevel {
    private Integer competitionLevelId;

    private String level;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionLevel{" +
                "competitionLevelId=" + competitionLevelId +
                ", level='" + level + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionLevel() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevel(String level) {
        this.level = level;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevel(Integer competitionLevelId, String level) {
        this.competitionLevelId = competitionLevelId;
        this.level = level;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getCompetitionLevelId() {
        return competitionLevelId;
    }

    public void setCompetitionLevelId(Integer competitionLevelId) {
        this.competitionLevelId = competitionLevelId;
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