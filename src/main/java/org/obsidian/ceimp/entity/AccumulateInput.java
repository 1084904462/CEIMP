package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class AccumulateInput {
    private Integer inputId;

    private String userId;

    private Integer pointId;

    private String evidence;

    private Integer times;

    private Integer yearScope;

    private Long createTime;

    @Override
    public String toString() {
        return "AccumulateInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", evidence='" + evidence + '\'' +
                ", times=" + times +
                ", yearScope=" + yearScope +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public AccumulateInput() {
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public AccumulateInput(String userId, Integer pointId, String evidence, Integer times) {
        this.userId = userId;
        this.pointId = pointId;
        this.evidence = evidence;
        this.times = times;
        this.yearScope = TimeUtil.getInstance().getThisYear();
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public AccumulateInput(Integer inputId, String userId, Integer pointId, String evidence, Integer times) {
        this.inputId = inputId;
        this.userId = userId;
        this.pointId = pointId;
        this.evidence = evidence;
        this.times = times;
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