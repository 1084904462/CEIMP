package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionTypeConnection {
    private Integer connectionId;

    private Integer competitionId;

    private Integer competitionTypeId;

    private Integer schoolId;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionTypeConnection{" +
                "connectionId=" + connectionId +
                ", competitionId=" + competitionId +
                ", competitionTypeId=" + competitionTypeId +
                ", schoolId=" + schoolId +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionTypeConnection() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionTypeConnection(Integer competitionId, Integer competitionTypeId, Integer schoolId) {
        this.competitionId = competitionId;
        this.competitionTypeId = competitionTypeId;
        this.schoolId = schoolId;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionTypeConnection(Integer connectionId, Integer competitionId, Integer competitionTypeId, Integer schoolId) {
        this.connectionId = connectionId;
        this.competitionId = competitionId;
        this.competitionTypeId = competitionTypeId;
        this.schoolId = schoolId;
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

    public Integer getCompetitionTypeId() {
        return competitionTypeId;
    }

    public void setCompetitionTypeId(Integer competitionTypeId) {
        this.competitionTypeId = competitionTypeId;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}