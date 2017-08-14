package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class ArtCompetition {
    private Integer competitionId;

    private String competitionName;

    private Long createTime;

    @Override
    public String toString() {
        return "ArtCompetition{" +
                "competitionId=" + competitionId +
                ", competitionName='" + competitionName + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public ArtCompetition() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public ArtCompetition(Integer competitionId, String competitionName) {
        this.competitionId = competitionId;
        this.competitionName = competitionName;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName == null ? null : competitionName.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}