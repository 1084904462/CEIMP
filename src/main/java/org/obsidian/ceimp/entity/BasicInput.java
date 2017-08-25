package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class BasicInput {
    private Integer inputId;

    private String userId;

    private Integer pointId;

    private String evidence;

    private Integer times;

    private Double subjectiveScore;

    private String addition;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "BasicInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", evidence='" + evidence + '\'' +
                ", times=" + times +
                ", subjectiveScore=" + subjectiveScore +
                ", addition='" + addition + '\'' +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public BasicInput() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public BasicInput(String userId, Integer pointId, String evidence, Integer times, Double subjectiveScore, String addition) {
        this.userId = userId;
        this.pointId = pointId;
        this.evidence = evidence;
        this.times = times;
        this.subjectiveScore = subjectiveScore;
        this.addition = addition;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public BasicInput(Integer inputId, String userId, Integer pointId, String evidence, Integer times, Double subjectiveScore, String addition) {
        this.inputId = inputId;
        this.userId = userId;
        this.pointId = pointId;
        this.evidence = evidence;
        this.times = times;
        this.subjectiveScore = subjectiveScore;
        this.addition = addition;
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

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence == null ? null : evidence.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Double getSubjectiveScore() {
        return subjectiveScore;
    }

    public void setSubjectiveScore(Double subjectiveScore) {
        this.subjectiveScore = subjectiveScore;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition == null ? null : addition.trim();
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