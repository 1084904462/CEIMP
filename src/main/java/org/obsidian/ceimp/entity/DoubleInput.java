package org.obsidian.ceimp.entity;

import org.obsidian.ceimp.util.TimeUtil;

public class DoubleInput {
    private Integer inputId;

    private String userId;

    private Integer pointId;

    private String evidence;

    private Long createTime;

    @Override
    public String toString() {
        return "DoubleInput{" +
                "inputId=" + inputId +
                ", userId='" + userId + '\'' +
                ", pointId=" + pointId +
                ", evidence='" + evidence + '\'' +
                ", createTime=" + TimeUtil.getInstance().getTime(createTime) +
                '}';
    }

    public DoubleInput() {
        this.createTime = TimeUtil.getInstance().getTimeStamp();
    }

    public DoubleInput(Integer inputId, String userId, Integer pointId, String evidence) {
        this.inputId = inputId;
        this.userId = userId;
        this.pointId = pointId;
        this.evidence = evidence;
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

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}