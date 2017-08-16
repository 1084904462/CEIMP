package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionLevelConnection {
    private Integer connectionId;

    private Integer competitionId;

    private Integer levelId;

    private Integer competitionType;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionLevelConnection{" +
                "connectionId=" + connectionId +
                ", competitionId=" + competitionId +
                ", levelId=" + levelId +
                ", competitionType=" + competitionType +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionLevelConnection() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevelConnection(Integer competitionId, Integer levelId, Integer competitionType) {
        this.competitionId = competitionId;
        this.levelId = levelId;
        this.competitionType = competitionType;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevelConnection(Integer connectionId, Integer competitionId, Integer levelId, Integer competitionType) {
        this.connectionId = connectionId;
        this.competitionId = competitionId;
        this.levelId = levelId;
        this.competitionType = competitionType;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Integer connectionId) {
        this.connectionId = connectionId;
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(Integer competitionType) {
        this.competitionType = competitionType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}