package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class TechnologyCompetition {
    private Integer competitionId;

    private String competitionName;

    private Integer competitionTypeId;

    private Integer schoolId;

    private String organizer;

    private Long createTime;

    @Override
    public String toString() {
        return "TechnologyCompetition{" +
                "competitionId=" + competitionId +
                ", competitionName='" + competitionName + '\'' +
                ", competitionTypeId=" + competitionTypeId +
                ", schoolId=" + schoolId +
                ", organizer='" + organizer + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public TechnologyCompetition() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public TechnologyCompetition(String competitionName, Integer competitionTypeId, Integer schoolId, String organizer) {
        this.competitionName = competitionName;
        this.competitionTypeId = competitionTypeId;
        this.schoolId = schoolId;
        this.organizer = organizer;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public TechnologyCompetition(Integer competitionId, String competitionName, Integer competitionTypeId, Integer schoolId, String organizer) {
        this.competitionId = competitionId;
        this.competitionName = competitionName;
        this.competitionTypeId = competitionTypeId;
        this.schoolId = schoolId;
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