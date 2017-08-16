package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionInput {
    private Integer inputId;

    private String userId;

    private Integer competitionId;

    private String evidence;

    private Integer competitionLevelId;

    private Integer awardLevelId;

    private Integer competitionType;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", competitionId=" + competitionId +
                ", evidence='" + evidence + '\'' +
                ", competitionLevelId=" + competitionLevelId +
                ", awardLevelId=" + awardLevelId +
                ", competitionType=" + competitionType +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionInput() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionInput(String userId, Integer competitionId, String evidence, Integer competitionLevelId, Integer awardLevelId, Integer competitionType) {
        this.userId = userId;
        this.competitionId = competitionId;
        this.evidence = evidence;
        this.competitionLevelId = competitionLevelId;
        this.awardLevelId = awardLevelId;
        this.competitionType = competitionType;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionInput(Integer inputId, String userId, Integer competitionId, String evidence, Integer competitionLevelId, Integer awardLevelId, Integer competitionType) {
        this.inputId = inputId;
        this.userId = userId;
        this.competitionId = competitionId;
        this.evidence = evidence;
        this.competitionLevelId = competitionLevelId;
        this.awardLevelId = awardLevelId;
        this.competitionType = competitionType;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public Integer getInputId() {
        return inputId;
    }

    public void setInputId(Integer inputId) {
        this.inputId = inputId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public Integer getCompetitionLevelId() {
        return competitionLevelId;
    }

    public void setCompetitionLevelId(Integer competitionLevelId) {
        this.competitionLevelId = competitionLevelId;
    }

    public Integer getAwardLevelId() {
        return awardLevelId;
    }

    public void setAwardLevelId(Integer awardLevelId) {
        this.awardLevelId = awardLevelId;
    }

    public Integer getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(Integer competitionType) {
        this.competitionType = competitionType;
    }

    public Integer getYearScope() {
        return yearScope;
    }

    public void setYearScope(Integer yearScope) {
        this.yearScope = yearScope;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}