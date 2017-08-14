package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionLevel {
    private Integer competitionLevelId;

    private String competitionLevel;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionLevel{" +
                "competitionLevelId=" + competitionLevelId +
                ", competitionLevel='" + competitionLevel + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionLevel() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevel(Integer competitionLevelId, String competitionLevel) {
        this.competitionLevelId = competitionLevelId;
        this.competitionLevel = competitionLevel;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getCompetitionLevelId() {
        return competitionLevelId;
    }

    public void setCompetitionLevelId(Integer competitionLevelId) {
        this.competitionLevelId = competitionLevelId;
    }

    public String getCompetitionLevel() {
        return competitionLevel;
    }

    public void setCompetitionLevel(String competitionLevel) {
        this.competitionLevel = competitionLevel == null ? null : competitionLevel.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}