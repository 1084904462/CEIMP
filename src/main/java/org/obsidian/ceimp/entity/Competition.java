package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Competition {
    private Integer competitionId;

    private String competitionName;

    private String organizer;

    private Long createTime;

    @Override
    public String toString() {
        return "Competition{" +
                "competitionId=" + competitionId +
                ", competitionName='" + competitionName + '\'' +
                ", organizer='" + organizer + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Competition() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Competition(String competitionName, String organizer) {
        this.competitionName = competitionName;
        this.organizer = organizer;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Competition(Integer competitionId, String competitionName, String organizer) {
        this.competitionId = competitionId;
        this.competitionName = competitionName;
        this.organizer = organizer;
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

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer == null ? null : organizer.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}