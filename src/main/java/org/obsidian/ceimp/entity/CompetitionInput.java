package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class CompetitionInput {
    private Integer inputId;

    private String userId;

    private Integer competitionId;

    private Integer competitionLevelId;

    private Integer competitionTypeId;

    private Integer awardLevelId;

    private Integer isRelevant;

    private Integer isGroup;

    private Integer rankId;

    private String evidence;

    private String additionCompetition;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "CompetitionInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", competitionId=" + competitionId +
                ", competitionLevelId=" + competitionLevelId +
                ", competitionTypeId=" + competitionTypeId +
                ", awardLevelId=" + awardLevelId +
                ", isRelevant=" + isRelevant +
                ", isGroup=" + isGroup +
                ", rankId=" + rankId +
                ", evidence='" + evidence + '\'' +
                ", additionCompetition='" + additionCompetition + '\'' +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public CompetitionInput() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionInput(String userId, Integer competitionId, Integer competitionLevelId, Integer competitionTypeId, Integer awardLevelId, Integer isRelevant, Integer isGroup, Integer rankId, String evidence, String additionCompetition) {
        this.userId = userId;
        this.competitionId = competitionId;
        this.competitionLevelId = competitionLevelId;
        this.competitionTypeId = competitionTypeId;
        this.awardLevelId = awardLevelId;
        this.isRelevant = isRelevant;
        this.isGroup = isGroup;
        this.rankId = rankId;
        this.evidence = evidence;
        this.additionCompetition = additionCompetition;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public CompetitionInput(Integer inputId, String userId, Integer competitionId, Integer competitionLevelId, Integer competitionTypeId, Integer awardLevelId, Integer isRelevant, Integer isGroup, Integer rankId, String evidence, String additionCompetition) {
        this.inputId = inputId;
        this.userId = userId;
        this.competitionId = competitionId;
        this.competitionLevelId = competitionLevelId;
        this.competitionTypeId = competitionTypeId;
        this.awardLevelId = awardLevelId;
        this.isRelevant = isRelevant;
        this.isGroup = isGroup;
        this.rankId = rankId;
        this.evidence = evidence;
        this.additionCompetition = additionCompetition;
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

    public Integer getAwardLevelId() {
        return awardLevelId;
    }

    public void setAwardLevelId(Integer awardLevelId) {
        this.awardLevelId = awardLevelId;
    }

    public Integer getIsRelevant() {
        return isRelevant;
    }

    public void setIsRelevant(Integer isRelevant) {
        this.isRelevant = isRelevant;
    }

    public Integer getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(Integer isGroup) {
        this.isGroup = isGroup;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public String getAdditionCompetition() {
        return additionCompetition;
    }

    public void setAdditionCompetition(String additionCompetition) {
        this.additionCompetition = additionCompetition == null ? null : additionCompetition.trim();
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