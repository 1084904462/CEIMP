package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionLevelConnection {
    private Integer connectionId;

    private Integer competitionId;

    private Integer competitionLevelId;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionLevelConnection{" +
                "connectionId=" + connectionId +
                ", competitionId=" + competitionId +
                ", competitionLevelId=" + competitionLevelId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionLevelConnection() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevelConnection(Integer competitionId, Integer competitionLevelId) {
        this.competitionId = competitionId;
        this.competitionLevelId = competitionLevelId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionLevelConnection(Integer connectionId, Integer competitionId, Integer competitionLevelId) {
        this.connectionId = connectionId;
        this.competitionId = competitionId;
        this.competitionLevelId = competitionLevelId;
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

    public Integer getCompetitionLevelId() {
        return competitionLevelId;
    }

    public void setCompetitionLevelId(Integer competitionLevelId) {
        this.competitionLevelId = competitionLevelId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}