package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class Competition {
    private Integer competitionId;

    private Integer type;

    private String competitionName;

    private Integer schoolId;

    private Integer competitionLevelId;

    private Integer competitionTypeId;

    private Integer isGroup;

    private Long createTime;

    @Override
    public String toString() {
        return "Competition{" +
                "competitionId=" + competitionId +
                ", type=" + type +
                ", competitionName='" + competitionName + '\'' +
                ", schoolId=" + schoolId +
                ", competitionLevelId=" + competitionLevelId +
                ", competitionTypeId=" + competitionTypeId +
                ", isGroup=" + isGroup +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public Competition() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Competition(Integer type, String competitionName, Integer schoolId, Integer competitionLevelId, Integer competitionTypeId, Integer isGroup) {
        this.type = type;
        this.competitionName = competitionName;
        this.schoolId = schoolId;
        this.competitionLevelId = competitionLevelId;
        this.competitionTypeId = competitionTypeId;
        this.isGroup = isGroup;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Competition(Integer competitionId, Integer type, String competitionName, Integer schoolId, Integer competitionLevelId, Integer competitionTypeId, Integer isGroup) {
        this.competitionId = competitionId;
        this.type = type;
        this.competitionName = competitionName;
        this.schoolId = schoolId;
        this.competitionLevelId = competitionLevelId;
        this.competitionTypeId = competitionTypeId;
        this.isGroup = isGroup;
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName == null ? null : competitionName.trim();
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public Integer getCompetitionLevelId() {
        return competitionLevelId;
    }

    public void setCompetitionLevelId(Integer competitionLevelId) {
        this.competitionLevelId = competitionLevelId;
    }

    public Integer getCompetitionTypeId() {
        return competitionTypeId;
    }

    public void setCompetitionTypeId(Integer competitionTypeId) {
        this.competitionTypeId = competitionTypeId;
    }

    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}